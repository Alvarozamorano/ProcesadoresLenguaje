lexer grammar gcsvLexer;

TEXTO: ~[,\n\r"]+;
CADENA:'"' ('""'|~'"')*'"'* {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
INTRO:[\n\r]+;
SEPARADOR:',';