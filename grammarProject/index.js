import grammarProjectLexer from "./generated/grammarProjectLexer.js";
import grammarProjectParser from "./generated/grammarProjectParser.js";
import CustomMiGrammarProjectVisitor from "./customGrammarProjectVisitor.js";
import antlr4, { CharStreams, CommonTokenStream } from "antlr4";
import readline from 'readline';
import fs from 'fs';


async function main() {
    let input;

    // Intento leer la entrada desde el archivo input - en forma sincrona.
    try {
        input = fs.readFileSync('inputCorrecto1.txt', 'utf8');
    } 
    catch (err) {
        // Si no es posible leer el archivo, solicitar la entrada del usuario por teclado
        input = await leerCadena(); // Simula lectura síncrona
        console.log(input);
    }
 


// FASE 1 - LEXER

// Proceso la entrada con el analizador para obtener el lexer
let inputStream = CharStreams.fromString(input);
let lexer = new grammarProjectLexer(inputStream);    


//Validar errores léxicos
lexer.removeErrorListeners();
lexer.addErrorListener({
    syntaxError(recognizer, offendingSymbol, line, column, msg) {
        console.error(`Error léxico en línea ${line}, columna ${column}: ${msg}`);
     }
});

//Verificar si el lexer está generando tokens 
console.log("Verificando tokens generados por el lexer...");
const tokens = lexer.getAllTokens();
if (tokens.length === 0) {
     console.error("No se generaron tokens. Verifica la entrada y la gramática.");
    return;
}

//Mostrar la tabla de tokens y lexemas
console.log("\nTabla de Tokens y Lexemas:");
console.log("--------------------------------------------------");
console.log("| Lexema         | Token                         |");
console.log("--------------------------------------------------");


// Recorrer todos los tokens generados por el lexer
for (let token of tokens) {
// Obtener el nombre simbólico del token
    const tokenType = grammarProjectLexer.symbolicNames[token.type] || `UNKNOWN (${token.type})`;
    const lexema = token.text; // Obtener el lexema (texto del token)
    console.log(`| ${lexema.padEnd(14)} | ${tokenType.padEnd(30)}|`);
}

console.log("--------------------------------------------------"); 


/* Vuelve a procesar la entrada, obtener el lexer, el código tokenizado y el parser 
* Es necesario volver a procesar la entrada porque la función getAllTokens() consume
* todos los tokens reconocidos y vacía el lexer. */
inputStream = CharStreams.fromString(input);
lexer = new grammarProjectLexer(inputStream);
let tokenStream = new CommonTokenStream(lexer);
let parser = new grammarProjectParser(tokenStream);


let tree = parser.program();  

  // Verificar si se produjeron errores sintácticos */
if (parser.syntaxErrorsCount > 0) 
    {
        console.error("\nSe encontraron errores de sintáxis en el código.");
    } 

else 
    {
        console.log("\nCódigo válido.");
        const cadena_tree = tree.toStringTree(parser.ruleNames);
         console.log(`\nÁrbol de derivación:\n ${cadena_tree}`);
 }
//FASE 3 - VISITOR(Generación de código )
console.log("\n--------------------------------------------------");
console.log("Traducción a JavaScript:");
console.log("--------------------------------------------------")

const visitor = new CustomMiGrammarProjectVisitor();
const codigoGenerado = visitor.visit(tree);

//mostrar el código generado
console.log("\nCódigo generado:");
console.log(codigoGenerado);

//Mostrar y ejecutar el código generado

console.log("\n--------------------------------------------------");
console.log("Ejecución:");
console.log("--------------------------------------------------");
eval(codigoGenerado);








function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    return new Promise(resolve => {
        rl.question("Ingrese una cadena: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

} 
// Ejecuta la función principal
main()
