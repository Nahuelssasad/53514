# Instruccion de Uso

- 1.Ejecutar en la consola el comando `node index.js`.Dentro de index.js se puede cambiar el input o como prompteo cuando se ejecute el comando.

# Gramatica del Lenguaje

```
<programa> ::= "flujo" <identificador> "{" { <definicion> } "}" ;

<definicion> ::= <estado>
| <rol>
| <transicion>
| <accion>
| <notificacion> ;

<estado> ::= "estado" <identificador> [ "inicial" | "final" ] ";" ;

<rol> ::= "rol" <identificador>
"puede"
"[" <permiso> { "," <permiso> } "]" ";" ;

<permiso> ::= "crear"
| "revisar"
| "aprobar"
| "rechazar"
| "archivar" ;

<transicion> ::= "desde" <identificador>
"hacia" <identificador>
"cuando" <condicion> ";" ;

<condicion> ::= <identificador> "." <permiso>
| <identificador> "==" <valor> ;

<accion> ::= "accion" <identificador>
"{"
{ <instruccion> }
"}" ;

<instruccion> ::= "asignar" <identificador> "=" <valor> ";"
| "registrar" "(" <cadena> ")" ";" ;

<notificacion> ::= "notificar"
<identificador>
"con"
<cadena> ";" ;

<valor> ::= <cadena>
| <numero>
| <booleano>
| <identificador> ;

<booleano> ::= "verdadero"
| "falso" ;

<identificador> ::= <letra>
{ <letra> | <digito> | "\_" } ;

<cadena> ::= '"' { <caracter> } '"' ;

<numero> ::= <digito> { <digito> } ;

<caracter> ::= <letra>
| <digito>
| '"'
| "."
| ","
| ":"
| ";"
| "-" ;

<letra> ::= "a" | ... | "z" | "A" | ... | "Z" ;

<digito> ::= "0" | ... | "9" ;
```

# Correspondencia de estructuras con JavaScript

## 1 Programa (<programa>)

### Funcion

Representa el flujo principal del sistema.Suponemos que la gramatica ejecuta los pasos secuenciales para realizar un proceso.

### Traduccion

Se convertirá en un objeto principal que contendrá:

- estados,
- roles,
- transiciones,
- acciones,
- notificaciones.

### Representación interna

```js
const Nombre_de_flujo = {
  estados: [],
  roles: {},
  transiciones: [],
  acciones: {},
  notificaciones: [],
};
```

## 2 Estados (<estado>)

### Funcion

Representa etapas del proceso.
El modificador:

- inicial
- final

es opcional según la gramática.

### Traduccion

Cada estado será almacenado como un objeto.

### Representación interna

```js
{
   nombre: "borrador",
   tipo: "inicial"
}
```

## 3 Roles (<rol>)

### Funcion

Definen permisos disponibles para ciertos usuarios o entidades.:

### Traduccion

Los roles serán almacenados junto con sus permisos asociados.

### Representación interna

```js
roles["director"] = ["revisar", "aprobar"];
```

## 4 Permisos (<permiso>)

### Funcion

Representan operaciones autorizadas dentro del sistema.

### Traduccion

Se utilizarán para validar transiciones y acciones.

### Representación interna(ejemplo)

```js
"aprobar";
```

## 5 Transiciones (<transicion>)

### Funcion

Permiten cambiar de un estado a otro bajo una condición.

### Traduccion

Las transiciones serán almacenadas como relaciones entre estados.

### Representación interna

```js
{
   desde: "borrador",
   hacia: "aprobado",
   condicion: "director.aprobar"
}
```

## 6 Condiciones (<condicion>)

### Funcion

Controlan cuándo puede ejecutarse una transición.

### Traduccion

Las condiciones serán evaluadas como expresiones booleanas en JavaScript.

### Representación interna

```js
roles["director"].includes("aprobar");
```

```js
estado === "aprobado";
```

## 7 Acciones (<accion>)

### Función

Agrupan instrucciones ejecutables.

### Traducción

Cada acción se convertirá en una función JavaScript.

### Representación interna

```js
function aprobar() {}
```

## 8 Instruccion (<instruccion>)

### Función

Ejecuta alguna de las instruccion definidas en la gramatica.

### Traducción

Se convertira en una asignacion a una variable o se genera una salida mediante la consola.

### Representación interna

```js
estado = "aprobado"; //asignacion
console.log("Proceso completado"); //registrar
```

## 9 Notificaciones (<notificar>)

### Función

Permiten enviar mensajes a un rol específico.

### Traducción

Permiten enviar mensajes a un rol específico.

### Representación interna

```js
console.log("Notificación enviada");
```

# Reglas semanticas

- 1.Solo debe haber un estado inicial.
- 2.Debe haber al menos un estado inicial.
- 3.No puede haber estados repetidos.
- 4.Roles no repetidos
- 5.Las transiciones deben referenciar a estados existentes.

## Mejoras

Se podrian agregar otras reglas semanticas como por ejemplo que las condiciones
provengan de roles validos o que los permisos utilizados deben pertenecer al rol correspondiente.
