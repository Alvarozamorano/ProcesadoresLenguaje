parser grammar gFiboParser;

options {
    tokenVocab = gFiboLexer;
    language = Java;
}

fichero: (comentario|include|funcion|INTRO)*;

comentario: COMENTARIOABRIR (textos|autor|descr|target|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLINEA textos* FINAL_COMENTARIO_UL;

textos: TEXTOCOMENTARIOML+|TEXTOCOMENTARIOUL+;

include:(wa)* includep ws+ (wa)* variable (wa)* terminador (wa)*;

funcion: wa* funcionp ws+ wa* (nombre_funcion) wa* parentesisa wa* entrada_funcion wa* parentesisc wa* dos_puntos wa* tipo_dato_salida wa* begin wa* dentro_funcion end wa*;
entrada_funcion: ((tipo_dato) ws+ wa* (valor)(wa* coma wa* (tipo_dato) ws+ wa* (valor))*)?;

dentro_funcion: (ws*(intro|asignacion|llamada_funcion|comentario|devolver_funcion|asignacion_funcion|bucle_while))*;

asignacion: (tipo_dato ws+)? wa* variable wa* asignar wa* (expr) wa* terminador wa*;

llamada_funcion: wa* (nombre_funcion) wa* parentesisa wa* (expr (wa* coma wa* expr wa*)*)? wa* parentesisc wa* terminador wa*;
llamada_funcion_a: (nombre_funcion) wa* parentesisa wa* (expr (wa* coma wa* expr wa*)*)? wa* parentesisc wa*;

devolver_funcion: wa* devolver wa* parentesisa wa* (expr) wa* parentesisc wa* terminador wa*;

asignacion_funcion: wa* tipo_dato ws+ wa* variable wa* asignar llamada_funcion;

bucle_while: wa* whilep wa* parentesisa wa* expr wa* (comp) wa* expr parentesisc wa* begin wa* ((ws*(intro|asignacion|llamada_funcion|comentario|devolver_funcion|asignacion_funcion))*) wa* end wa*;

valor: variable|numero|cadena;

autor: AUTOR;
descr: DESCRIPCION;
target: TARGET;
expr:   comentario expr
    |   expr comentario
    |   WS expr
    |   expr WS
    |   INTRO expr
    |   expr INTRO  
    |   <assoc=right> expr (md) expr
    |   expr (sr) expr 
    |   expr (comp) expr 
    |	variable
    |   numero
    |   llamada_funcion_a
    |   cadena
    |	parentesisa expr parentesisc
    |   operacion '(' (expr(','expr)*)? ')'
    ; 
nombre_funcion: IDf;
wa: (ws|comentario|intro);
ws: WS;
intro: INTRO;
operacion: COS|SEN|TAN;
numero:ENTERO|FLOTANTE;
cadena:TEXTO;
variable:IDf;
whilep: WHILE;
begin: BEGIN;
end: END;
devolver: DEVOLVER;
terminador: FIN_LINEA;
includep: INCLUDE;
funcionp: FUNCION;
parentesisa: PARENTESISA;
parentesisc: PARENTESISC;
md: MULTIPLICACION|DIVISION;
sr: SUMA|RESTA;
comp: MAYOR|MENOR|IGUAL|DISTINTO;
coma: COMA;
asignar: ASIGNAR;
dos_puntos: DOS_PUNTOS;
tipo_dato: NUMERO|CADENA;
tipo_dato_salida: NUMERO|CADENA|VOID;

