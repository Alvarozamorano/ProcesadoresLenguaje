parser grammar gjsonbParser;

options {
    tokenVocab = gjsonbLexer;
    language = Java;
} 

fichero: LLAVEA context graphs LLAVEC;

context:CONTEXT (textoc)*;
textoc:TEXTOCONTEXT;

graphs:GRAPHS grafo*;
grafo:LLAVEA nombreGrafo DOSP? dentroGrafo LLAVEC;

dentroGrafo:LLAVEA tipoGrafo DOSP nodo* LLAVEC;

nodo:LLAVEA (id|name|label|properties|reverseName|labelReverseName|from|to
            |typeOf|usedby|multiplicityMax|multiplicityMin|inherits
            |optional|isList)* LLAVEC; 

//estructura: TEXTO DOSP (TEXTO|BOOL|estructurallave)*;
//estructurallave: LLAVEA (estructura)* LLAVEC;

id: ID (clase|propiedad|relacion);  
name:NAME TEXTO ; 
label: (LABEL LLAVEA  ((ES textoEs)|(ENG textoIn))* LLAVEC);
properties: PROPERTIES (prop)*;
prop:TEXTO;
reverseName: REVERSENAME TEXTO;
labelReverseName: (LABELREVERSENAME LLAVEA  ((ES textoEsReverse)|(ENG textoInReverse))* LLAVEC);
from: FROM TEXTO;  
to: TO TEXTO;  
typeOf: TYPEOF TEXTO; 
usedby: USEDBY TEXTO;
multiplicityMax: MULTIPLICITYMAX TEXTO; 
multiplicityMin: MULTIPLICITYMIN TEXTO; 
inherits: INHERITS TEXTO;
optional: OPTIONAL BOOL;  
isList: ISLIST BOOL;
 
clase: CLASE;
propiedad: PROPIEDAD; 
relacion:RELACION; 

textoEs: TEXTO;
textoIn:TEXTO;
textoEsReverse: TEXTO;
textoInReverse:TEXTO;

nombreGrafo:TEXTO|PROPERTIES; 
tipoGrafo:TEXTO;    