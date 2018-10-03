grammar pp;
/*GRAMMAR RULES*/
programme:
  (declaration)?
  (definition)*
  instruction;
declaration: VAR (variable : type)+;
definition:
  fonction'('(variable : type)*')' (: type)?
  (declaration)?
  instruction;
instruction:
  variable ASSIGNMENT expression
  |expression'['expression']' ASSIGNMENT expression
  |IF expression THEN instruction ELSE instruction
  |WHILE expression DO instruction
  |cible'('expression*')'
  |SKIP
  |instruction';'instruction;
variable: ID;
type returns [Type T]:
  INT {$T = new Int();}
  |BOOL {$T = new Bool();}
  |ARRAY t = type {$T = new Array($t.value);};
fonction: ID;
expression returns [Expression value]:
  constante
  |variable
  |INVERSE c = constante {$value = new Inv($c.C);}
  |LOGNOT c = constante {$value = new Not($c.C);}
  |expression bop expression
  |cible'('expression*')'
  |expression'['expression']'
  |ARRAY_ALLOCATION ARRAY type '['expression']';
cible:
  IN
  |OUT
  |fonction;
constante returns [Constante C]:
  LITENT {$C = new ConstanteInt(Integer.parseInt(LITENT));}
  |LITBOOL {$C = new ConstanteBool(Boolean.parseBoolean(LITBOOL));};
bop:
  ADD
  |SUB
  |MUL
  |DIV
  |LOGAND
  |LOGOR
  |LTH
  |LTEQ
  |EQU
  |DIFF
  |GTH
  |GTEQ;

/*TOKENS*/
INT: 'integer';
BOOL: 'boolean';
ARRAY: 'array of';
IN: 'read';
OUT: 'write';
VAR: 'var';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
SKIP: 'skip';
ASSIGNMENT: ':=';
ARRAY_ALLOCATION: 'new';
INVERSE: '-';
LOGNOT: 'not';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
LOGAND: 'and';
LOGOR: 'or';
LTH: '<';
LTEQ: '<=';
EQU: '=';
DIFF: '!=';
GTH: '>';
GTEQ: '>=';
LITBOOL: 'true'|'false';
LITENT: 0|[1-9]([1-9])*;
ID: [a-z]+;
WS: [ \t\r\n] -> skip;
