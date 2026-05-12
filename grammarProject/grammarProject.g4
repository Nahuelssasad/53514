grammar grammarProject;

//Parser

program: FLOW ID LBRACE definition* RBRACE;
definition: state | role | transition | action | notification;
state: STATE ID (START | END)? SEMICOLON;
role:
	ROLE ID CAN LBRACKET permission (COMMA permission)* RBRACKET SEMICOLON;
permission: CREATE | REFUSE | REVISE | APPROVE | ARCHIVE;
transition: FROM ID TO ID WHEN condition SEMICOLON;
condition: ID DOT permission | ID ISEQUAL value;
action: ACTION ID LBRACE instruction* RBRACE SEMICOLON;
instruction:
	ASSIGN ID ASSIGNVALUE value SEMICOLON
	| REGISTER LPAREN STRING RPAREN SEMICOLON;
notification: NOTIFY ID WITH STRING SEMICOLON;
value: BOOLEAN | NUMBER | ID | STRING;

/*ACLARACION!!
 - El token SPACE se define para permitir espacios dentro de las cadenas, pero no se utiliza para
 separar tokens en el programa.
 - El token WS se utiliza para ignorar espacios en blanco, tabs y
 saltos de línea que no forman parte de las cadenas o tokens significativos. Esto asegura que el
 programa pueda contener espacios y saltos de línea sin afectar la estructura del código.
 
 -Ademas,se ha cambiado la regla de produccion caracter y cadena por solo una :string, para
 simplificar la gramatica y evitar confusiones al momento de definir los tokens.
 Ahora, el token
 cadena se define como una secuencia de caracteres encerrada entre comillas dobles.Ya que en ANTLR4
 existe una separación de responsabilidades clara entre 
 el lexer y el parser. El lexer se encarga
 de reconocer unidades léxicas atómicas, mientras que el parser trabaja con la estructura
 gramatical. Definir cadena en el parser 
 como una secuencia de character individuales rompe esa
 separación, ya que obliga al parser a reconstruir token por token algo que conceptualmente es una
 unidad indivisible. 
 Además, exponer tokens como SEMICOLON y COMMA dentro de character genera
 ambigüedad real: el parser no puede distinguir si un ; pertenece a una cadena o cierra una
 instrucción.
 Al mover STRING al lexer, la cadena se captura como un único token atómico, se
 eliminan las ambigüedades estructurales y el parser recibe información limpia y sin conflictos, 
 cumpliendo correctamente con el rol que ANTLR4 le asigna a cada componente.
 */

//Lexer 

//Palabras reservadas
FLOW: 'flujo';
STATE: 'estado';
START: 'inicio';
END: 'fin';
ROLE: 'rol';
CAN: 'puede';
CREATE: 'crear';
REFUSE: 'rechazar';
REVISE: 'revisar';
APPROVE: 'aprobar';
ARCHIVE: 'archivar';
FROM: 'desde';
TO: 'hacia';
WHEN: 'cuando';
ACTION: 'accion';
ASSIGN: 'asignar';
REGISTER: 'registrar';
NOTIFY: 'notificar';
WITH: 'con';
BOOLEAN: ('verdadero' | 'falso');

//Simbolos
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
ASSIGNVALUE: '=';
ISEQUAL: '==';
DOT: '.';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
DOBLEQUOTE: '"';
COLON: ':';

//Cadena
STRING: '"' [a-zA-Z0-9.,;:\- ]* '"';

//Caracteres basicos
fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
ID: LETTER (LETTER | DIGIT | '_')*;
NUMBER: DIGIT+;

//Espacios en blanco
WS: [ \t\r\n]+ -> skip;