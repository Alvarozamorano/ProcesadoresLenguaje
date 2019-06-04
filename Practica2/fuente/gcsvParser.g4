parser grammar gcsvParser;

options {
    tokenVocab = gcsvLexer;
    language = Java;
}

fichero: cabecera linea+;

cabecera:columna (SEPARADOR columna)* INTRO;

linea:campo (SEPARADOR campo)* INTRO;

columna: TEXTO #columnaSinComillas
    | CADENA #columnaConComillas
    |        #columnaVacio 
    ;

campo: TEXTO #textoSinComillas
    | CADENA #stringConComillas
    |        #campoVacio 
    ;
