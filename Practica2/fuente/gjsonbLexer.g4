lexer grammar gjsonbLexer;


CONTEXT: '"@context":' -> pushMode(CONTEXT_MODE);
//GRAPHS: '"graphs"';
LLAVEA:'{' ;
LLAVEC:'}' ;
CA:'[' ->skip;
CC:']' ->skip;
DOSP:':' ;
COMA:',' ->skip;
WS:' ' ->skip;
INTRO:'\r\n' ->skip;
COMILLAS:'"' ;
ID:'"@id":' WS* ->pushMode(ID_MODE);
NAME:'"name":';
LABEL:'"label":';
ES:'"es":';
ENG:'"eng":'|'"en":';
PROPERTIES:'"properties":' WS* '[';
TYPEOF:'"typeOf":';
USEDBY:'"usedby":';
ISLIST:'"isList":';
MULTIPLICITYMAX:'"multiplicityMax":';
MULTIPLICITYMIN:'"multiplicityMin":';
INHERITS:'"inherits":';
OPTIONAL:'"optional":';
TO:'"to":';
FROM:'"from":';
REVERSENAME: '"reverseName":';
LABELREVERSENAME: '"labelReverseName":';
RUTA:'"http://';

BOOL: 'true'|'false';

TEXTO:'"' ('""'|~'"')* '"'* {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};


mode CONTEXT_MODE;
GRAPHS: '"graphs":' -> popMode;
TEXTOCONTEXT: .+? ->skip;

mode ID_MODE;
CLASE: '"''http://PdL.com/class#' NOMBRE '"' {setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));}->popMode; 
fragment NOMBRE:.+?;
PROPIEDAD: '"' 'http://PdL.com/property#' NOMBRE '"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));} ->popMode;
RELACION:'"' 'http://PdL.com/relationship#' NOMBRE'"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));}->popMode;