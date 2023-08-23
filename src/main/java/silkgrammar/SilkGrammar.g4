grammar SilkGrammar;

// Reglas léxicas
ID      : [a-zA-Z]+ ;       // Identificadores (nombres de variables)
INT     : [0-9]+ ;          // Números enteros
STRING  : '"' .*? '"' ;     // Cadenas de texto
BOOLEAN : 'true' | 'false' ; // Valores booleanos
WS      : [ \t\r\n]+ -> skip ; // Espacios en blanco

// Reglas sintácticas
program : statement+ ;   // Un programa consiste en una secuencia de declaraciones

statement : variableDeclaration
          | assignment
          | printStatement
          | inputStatement
          | ifStatement
          | whileStatement
          ;

variableDeclaration : 'var' ID '=' expression ';' ; // Declaración de variables
assignment         : ID '=' expression ';' ;         // Asignación de variables

printStatement : 'print' expression ';' ;   // Instrucción para imprimir valores
inputStatement : 'input' ID ';' ;           // Instrucción para recibir valores de entrada

ifStatement : 'if' '(' expression ')' block ('else' block)? ; // Estructura condicional
whileStatement : 'while' '(' expression ')' block ;           // Bucle while

block : '{' statement+ '}' ; // Bloque de código

expression : '(' expression ')'            // Agrupación
           | expression ('*' | '/') expression // Multiplicación o división
           | expression ('+' | '-') expression // Suma o resta
           | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression // Operadores de comparación
           | expression 'and' expression   // Operador lógico AND
           | expression 'or' expression    // Operador lógico OR
           | 'not' expression              // Operador lógico NOT
           | BOOLEAN                       // Valor booleano
           | INT                           // Entero
           | STRING                        // Cadena de texto
           | ID                            // Variable
           ;

// Ignorar comentarios entre /* y */
COMMENT : '/*' .*? '*/' -> skip ;
