grammar PP;
/*GRAMMAR RULES*/
programme returns [Programme p]
  @init{$p = new Programme();}:
  (g = declaration {$p.globals = $g.variables;})?
  (def = definition {$p.defs.add($def.d);})*
  inst = instruction {$p.code = $inst.i;};
declaration returns [ArrayList<Pair<String,Type>> variables]
  @init{$variables = new ArrayList<Pair<String,Type>>();}:
  VAR (v = pairvar {$variables.add($v.pair);})+;
pairvar returns [Pair<String,Type> pair]
  @init{$pair = new Pair<String,Type>();}:
  s = variable {$pair.left = $s.v.name;} ':' t = type {$pair.right = $t.T;};
definition returns [Definition d]
  @init{$d = new Procedure();}:
  name = ID {$d.name = $name.text;}
  '('(arg = pairvar {$d.args.add($arg.pair);})*')'
  (':' t = type {$d = new Fonction($d.name, $d.args, $t.T);})?
  (loc = declaration {$d.locals = $loc.variables;})?
  inst = instruction {$d.code = $inst.i;};
instruction returns [Instruction i]:
  a = affectation {$i = $a.a;}
  |cond = condition {$i = $cond.c;}
  |WHILE expression DO '{'instruction'}'
  |expression'['expression']' ASSIGNMENT expression
  |cible'('expression*')'
  |SK
  |instruction';'instruction;
affectation returns [Affectation a]
  @init{$a = new Affectation();}:
  v = variable {$a.name = $v.v.name;}
  ASSIGNMENT e = expression {$a.val = $e.value;};
condition returns [Condition c]
  @init{$c = new Condition();}:
  IF e = expression {$c.cond = $e.value;}
  THEN inst1 = instruction {$c.i1 = $inst1.i;}
  ELSE '{'inst2 = instruction {$c.i2 = $inst2.i;}'}';
variable returns [Variable v]:
  name = ID {$v = new Variable($name.text);};
type returns [Type T]:
  INT {$T = new Int();}
  |BOOL {$T = new Bool();}
  |ARRAY t = type {$T = new Array($t.T);};
expression returns [Expression value]:
  c = constante {$value = $c.E;}
  |v = variable {$value = $v.v;}
  |'-'e = expression {$value = new Inv($e.value);}
  |LOGNOT e = expression {$value = new Not($e.value);}
  |expression bop expression
  |cible'('expression*')'
  |expression'['expression']'
  |ARRAY_ALLOCATION ARRAY type '['expression']';
cible:
  IN
  |OUT
  |ID;
constante returns [Expression E]:
  c = LITENT {$E = new Constante(Integer.parseInt($c.text));}
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
