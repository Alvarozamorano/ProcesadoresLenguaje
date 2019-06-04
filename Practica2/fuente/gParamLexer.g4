lexer grammar gParamLexer;

KW_JSON: '-JSON';
KW_DOT: '-DOT';
KW_SVG: '-SVG';
KW_CSV: '-CSV';
KW_LEN: '-len';
KW_FONTCOLOR: '-fontcolor';
KW_FONTNAME: '-fontname';
KW_FONTSIZE: '-fontsize';
KW_ARROWSIZE: '-arrowsize';
KW_ARROWCOLOR: '-arrowcolor';
KW_PENWIDTH: '-penwidth';
KW_FILLCOLOR: '-fillcolor';
KW_STYLE: '-style';
KW_SHAPE: '-shape';
KW_EDGE: 'edge';
KW_NODE: 'node';
KW_RELA: 'relationship';
KW_CLASS: 'class';
KW_PROP: 'property';
KW_INHE: 'inheritance';
KW_INDI: 'indirect_use';

S_IGUAL: '=';
S_GUIONB: '_';
S_COMILLAS: '"';
ENTERO: [0-9]+;
INTRO: [\t\n\r]+ -> skip;
WS: ' '+ ->skip;

TEXTOCON: '"' (~('"'|'='|' '))+ '"'{setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));};
TEXTOSIN: (~('"'|'='|' '|'_'))+;