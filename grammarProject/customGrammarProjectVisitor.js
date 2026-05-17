import grammarProjectVisitor from './generated/grammarProjectVisitor.js';


export default class CustomGrammarProjectVisitor extends grammarProjectVisitor {
    

    validarSemantica(defs) {
    const errores = [];
    
    const estados = defs.filter(d => d.tipo === 'estado').map(d => d.valor);
    
    //solo un estado inicial
    const estadosIniciales = estados.filter(e => e.tipo === 'inicial');
    if (estadosIniciales.length === 0) {
        errores.push("Error semántico: debe existir exactamente un estado inicial.");
    }
    if (estadosIniciales.length > 1) {
        errores.push(`Error semántico: se definieron ${estadosIniciales.length} estados iniciales — solo se permite uno.`);
    }
    // regla 1  al menos un estado final
    const estadosFinales = estados.filter(e => e.tipo === 'final');
    if (estadosFinales.length === 0) {
        errores.push("Error semántico: debe existir al menos un estado final.");
    }
    // regla 2 estados no repetidos
    const nombresEstados = new Set();
    for (const estado of estados) {
    if (nombresEstados.has(estado.nombre)) {
        errores.push(`Error semántico: el estado '${estado.nombre}' está definido más de una vez.`);
    }
    nombresEstados.add(estado.nombre);
    }
    // Regla 3: roles no repetidos
    const nombresRoles = new Set();
    const roles = defs.filter(d => d.tipo === 'rol').map(d => d.valor);
    for (const rol of roles) {
    if (nombresRoles.has(rol.nombre)) {
        errores.push(`Error semántico: el rol '${rol.nombre}' está definido más de una vez.`);
    }
    nombresRoles.add(rol.nombre);
    }
    // Regla 4: transiciones referencian estados existentes
    const nombresEstadosValidos = new Set(estados.map(e => e.nombre));
    const transiciones = defs.filter(d => d.tipo === 'transicion').map(d => d.valor);
    for (const transicion of transiciones) {
        if (!nombresEstadosValidos.has(transicion.origen)) {
            errores.push(`Error semántico: la transición referencia el estado origen '${transicion.origen}' que no existe.`);
    
        }
        if (!nombresEstadosValidos.has(transicion.destino)) {
            errores.push(`Error semántico: la transición referencia el estado destino '${transicion.destino}' que no existe.`);
        }
    }




    return errores;
}


    visitProgram(ctx) {
    const nombre = ctx.ID().getText();
    
    // cada visit retorna su parte
    const defs = ctx.definition().map(def => this.visit(def)).filter(d => d !== null); // filtrar posibles nulls por reglas no aplicables
    
    const errores = this.validarSemantica(defs); 
    if (errores.length > 0) {
    errores.forEach(e => console.error(e));
    throw new Error("Análisis semántico fallido."); // ← mensaje genérico
    }
    // separar por tipo
    const estados = defs.filter(d => d.tipo === 'estado').map(d => d.valor);
    const roles = defs.filter(d => d.tipo === 'rol').map(d => d.valor);
    const transiciones = defs.filter(d => d.tipo === 'transicion').map(d => d.valor);
    const acciones = defs.filter(d => d.tipo === 'accion').map(d => d.valor);
    const notificaciones = defs.filter(d => d.tipo === 'notificacion').map(d => d.valor);
 


    //parte para ejecutar codigo generado
    const accionesCode = acciones.join('\n');
    const notificacionesCode = notificaciones.join('\n');

    return `const ${nombre} = {\n` +
           `  estados: ${JSON.stringify(estados)},\n` +
           `  roles: ${JSON.stringify(roles)},\n` +
           `  transiciones: ${JSON.stringify(transiciones)},\n` +
           `  acciones: ${JSON.stringify(acciones)},\n` +
           `  notificaciones: ${JSON.stringify(notificaciones)}\n` +
           `};\n\n` +
           `// Funciones de acciones\n` +
           accionesCode + '\n\n' +
           `// Notificaciones\n` +
           notificacionesCode + '\n\n' +
           `// Ejecutar acciones\n` +
           acciones.map(a => {
               const nombreFn = a.match(/function (\w+)/)[1];
               return `${nombreFn}();`;
           }).join('\n');


}
visitDefinition(ctx) {
    if (ctx.state_()) return this.visit(ctx.state_());
    if (ctx.role()) return this.visit(ctx.role());
    if (ctx.transition()) return this.visit(ctx.transition());
    if (ctx.action()) return this.visit(ctx.action());
    if (ctx.notification()) return this.visit(ctx.notification());
}
visitState(ctx) {
    return {
        tipo: 'estado',
        valor: {
            nombre: ctx.ID().getText(),
            tipo: ctx.START() ? 'inicial' : ctx.END() ? 'final' : null
        }
    };
}
visitRole(ctx) {
    
    const nombre = ctx.ID().getText();
    const permisos = ctx.permission().map(p => this.visit(p));
    return {
        tipo: 'rol',
        valor: { nombre, permisos }
    };

	}

visitPermission(ctx) {
    return ctx.getText();
}

visitTransition(ctx) {
    const origen = ctx.ID(0).getText();
    const destino = ctx.ID(1).getText();
    const condicion = this.visit(ctx.condition());
    return {
        tipo: 'transicion',
        valor: { origen, destino, condicion }
    };
 }
visitCondition(ctx) {
    if (ctx.DOT()) {
        // caso: director.aprobar
        // → roles["director"].includes("aprobar")
        const rol = ctx.ID().getText();
        const permiso = this.visit(ctx.permission());
        return `roles["${rol}"].includes("${permiso}")`;
    } else {
        // caso: estado == "aprobado"
        // → estado === "aprobado"
        const identificador = ctx.ID().getText();
        const valor = this.visit(ctx.value());
        return `${identificador} === ${valor}`;
    }
}
visitAction(ctx) {
    const nombre = ctx.ID().getText();
    const instrucciones = ctx.instruction().map(instr => this.visit(instr));
    
    return {
        tipo: 'accion',
        valor: 'function ' + nombre + '() {\n' + instrucciones.join('\n') + '\n}'
    };
}
visitInstruction(ctx) {
    if (ctx.REGISTER()) {
        return `console.log(${ctx.STRING().getText()});`;
    } else {
        return `let ${ctx.ID().getText()} = ${this.visit(ctx.value())};`;
    }
}

visitNotification(ctx) {
    const mensaje = ctx.STRING().getText();
    return {
        tipo: 'notificacion',
        valor: `console.log(${mensaje});`

    };
}
visitValue(ctx) {
    return ctx.getText();
}
}