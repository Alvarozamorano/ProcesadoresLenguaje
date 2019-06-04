parser grammar gParamParser;

options {
    tokenVocab = gParamLexer;
    language = Java;
}

parametros: ficheros param;

ficheros: (json|dot|svg|ws)* | csv+ ws*;

param: (len|fontcolor|fontname|fontsize|arrowsize|arrowcolor|penwidth|fillcolor|style|shape)*;

len: w_len guionb elemento igual entero;

fontcolor: w_fontcolor guionb edno guionb elemento igual cadena;

fontname: w_fontname guionb edno guionb elemento igual cadena;

fontsize: w_fontsize guionb edno guionb elemento igual entero;

arrowsize: w_arrowsize guionb edno guionb elemento igual entero;

arrowcolor: w_arrowcolor guionb edno guionb elemento igual cadena;

penwidth: w_penwidth guionb edno guionb elemento igual entero;

fillcolor: w_fillcolor guionb edno guionb elemento igual cadena;

style: w_style guionb edno guionb elemento igual cadena;

shape: w_shape guionb edno guionb elemento igual cadena;

json: w_json igual ruta;

dot: w_dot igual ruta;

svg: w_svg igual ruta;

csv: w_csv igual ruta;

w_json: KW_JSON;
w_dot: KW_DOT;
w_svg: KW_SVG;
w_csv: KW_CSV;
w_len: KW_LEN;
w_fontcolor: KW_FONTCOLOR;
w_fontname: KW_FONTNAME;
w_fontsize: KW_FONTSIZE;
w_arrowsize: KW_ARROWSIZE;
w_arrowcolor: KW_ARROWCOLOR;
w_penwidth: KW_PENWIDTH;
w_fillcolor: KW_FILLCOLOR;
w_style: KW_STYLE;
w_shape: KW_SHAPE;

edno: edge|node;
edge: KW_EDGE;
node: KW_NODE;

igual: S_IGUAL;
guionb: S_GUIONB;

cadena:TEXTOSIN;
entero:ENTERO;

w_rela: KW_RELA;
w_class: KW_CLASS;
w_prop: KW_PROP;
w_inhe: KW_INHE;
w_indi:KW_INDI;
elemento: w_rela|w_class|w_prop|w_inhe|w_indi;
ruta: TEXTOCON|TEXTOSIN;

ws: WS;