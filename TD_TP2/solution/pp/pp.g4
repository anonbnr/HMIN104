grammar pp;
/*GRAMMAR RULES*/
p:
  (VAR (ID : type)+)*
  (definition)*
  instructions;

type returns [Type T]:
  "integer" {$T = new Int();}
  |"boolean" {$T = new Bool();}
  |"array of" t = type {$T = new Array($t.T);};
constante returns [Constante C]:
  "integer" {$C = new Constante(LITENT);}
  |"boolean" {$C = new Constante(LITBOOL)};

/*TOKENS*/
WS [ \t\r\n] -> skip;
VAR "var";
ID [a-z]+;
