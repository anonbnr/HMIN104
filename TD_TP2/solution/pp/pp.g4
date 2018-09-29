grammar pp;
/*GRAMMAR RULES*/
p:
  (VAR (variable : type)+)*
  (definition)*
  instruction;
definition:
  fonction'('(variable : type)*')' (: type)?
  ((VAR (variable : type)+))?
  instruction;
expression returns [Expression value]:
  constante
  |variable
  |'-' c = constante {$value = new Inv($c.C);}
  |'not' c = constante {$value = new Not($c.C);}
  /* |expression bop expression */
  |
  |cible'('expression*')'
  |expression'['expression']'
  |'new array of 'type '['expression']';
variable: ID;
instruction:
  variable ':=' expression
  |expression'['expression']' ':=' expression
  |'if' expression 'then' instruction 'else' instruction
  |'while' expression 'do' instruction
  |cible'('expression*')'
  |'skip'
  |instruction';'instruction;
cible:
  'read'
  |'write'
  |ID;
uop:
  '-'
  |'not';
bop:
  '+'
  |'-'
  |'*'
  |'/'
  |'and'
  |'or'
  |'<'
  |'<='
  |'='
  |'!='
  |'>'
  |'>=';
type returns [Type T]:
  "integer" {$T = new Int();}
  |"boolean" {$T = new Bool();}
  |"array of" t = type {$T = new Array($t.T);};
constante returns [Constante C]:
  LITENT {$C = new ConstanteInt(Integer.parseInt(LITENT));}
  |LITBOOL {$C = new ConstanteBool(Boolean.parseBoolean(LITBOOL));};

/*TOKENS*/
WS [ \t\r\n] -> skip;
VAR "var";
ID [a-z]+;
LITENT 0|[1-9]([1-9])*;
LITBOOL 'true'|'false';
