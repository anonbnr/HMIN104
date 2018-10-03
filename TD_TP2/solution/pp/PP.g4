grammar PP;
/*GRAMMAR RULES*/
programme returns [Programme p]
  @init{$p = new Programme();}:
  (g = declaration {$p.globals = $g.variables;})?
  (definition)*
  instruction;
declaration returns [ArrayList<Pair<String,Type>> variables]
  @init{$variables = new ArrayList<Pair<String,Type>>();}:
  VAR (v = var {$variables.add($v.pair);})+;
var returns [Pair<String,Type> pair]
  @init{$pair = new Pair<String,Type>();}:
  s = variable {$pair.left = $s.text;} ':' t = type {$pair.right = $t.T;};
definition:
  fonction'('(var)*')' (':' type)?
  (declaration)?
  instruction;
instruction:
  variable ASSIGNMENT expression
  |expression'['expression']' ASSIGNMENT expression
  |IF expression THEN instruction ELSE '{'instruction'}'
  |WHILE expression DO '{'instruction'}'
  |cible'('expression*')'
  |SK
  |instruction';'instruction;
variable: ID;
type returns [Type T]:
  INT {$T = new Int();}
  |BOOL {$T = new Bool();}
  |ARRAY t = type {$T = new Array($t.T);};
fonction returns [Fonction f]
@init{$f = new Fonction();}:
  name = ID {$f.name = $name.text;};
expression returns [Expression value]:
  constante
  |variable
  |'-'e = expression {$value = new Inv($e.value);}
  |LOGNOT e = expression {$value = new Not($e.value);}
  |expression bop expression
  |cible'('expression*')'
  |expression'['expression']'
  |ARRAY_ALLOCATION ARRAY type '['expression']';
cible:
  IN
  |OUT
  |fonction;
constante returns [Expression E]:
  LITENT {$E = new Constante(LITENT);}
  |LITTRUE {$E = new ConstanteTrue();}
  |LITFALSE {$E = new ConstanteFalse();};
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
SK: 'skip';
ASSIGNMENT: ':=';
ARRAY_ALLOCATION: 'new';
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
LITTRUE: 'true';
LITFALSE: 'false';
LITENT: '0'|[1-9]([1-9])*;
ID: [a-zA-Z0-9]+;
WS: [ \t\r\n] -> skip;
