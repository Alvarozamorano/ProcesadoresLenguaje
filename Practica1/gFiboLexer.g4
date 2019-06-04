lexer grammar gFiboLexer;

INCLUDE: 'include';
FUNCION: 'function';
NUMERO: 'numero';
CADENA: 'cadena';
WHILE: 'while';
BEGIN: 'begin';
END: 'end';
DEVOLVER: 'devolver';
VOID: 'void';
PARENTESISA: '(';
PARENTESISC: ')';
COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLINEA: '//'-> pushMode(COMENTARIO_LINEA_MODE); 
COS: 'cos';
SEN: 'sen';
TAN: 'tan';
 

IDf: ID_LETRA(ID_LETRA|DIGITO)*;
fragment ID_LETRA:[a-zA-Z];
fragment DIGITO:[0-9];

ENTERO: DIGITO+;
FLOTANTE: DIGITO+ '.' DIGITO*
        | '.' DIGITO+  //.8  .999
        ;
INTRO: '\r\n';
FIN_LINEA: ';';
WS: ' '+;
COMA: ',';
DOS_PUNTOS: ':';
ASIGNAR: ':=';
MULTIPLICACION: '*';
DIVISION: '/';
SUMA: '+';
RESTA: '-';
MAYOR: '>';
MENOR: '<';
IGUAL: '==';
DISTINTO: '!=';
COMILLAS: '"';


TEXTO: '"' (ESC|.).*? '"'; // .--> cualquier elemento  "hola"  ""  "hol/a"  "hola\n" "hola \"juan\" "
fragment ESC: '\\'[btnr"\\];


mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '*/' ->popMode; 
TEXTOCOMENTARIOML: .+?;
AUTOR: '@author:' .+? '\r\n';
DESCRIPCION: '@description:' .+? '\r\n';
TARGET: '@target:' .+? '\r\n';

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: ('\r\n')->popMode;
TEXTOCOMENTARIOUL: .+?;