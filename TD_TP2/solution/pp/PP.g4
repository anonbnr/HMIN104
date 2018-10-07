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
  |wh = boucle {$i = $wh.w;}
  |aa = arrayaffectation {$i = $aa.aa;}
  |p = procappel {$i = $p.pa;}
  |s = SK {$i = new Skip();}
  |inst1 = instruction {$i = new Sequence($inst1.i);}
  ';'
  inst2 = instruction {((Sequence)$i).i2 = $inst2.i;};
affectation returns [Affectation a]
  @init{$a = new Affectation();}:
  v = variable {$a.name = $v.v.name;}
  ASSIGNMENT e = expression {$a.val = $e.value;};
arrayaffectation returns [ArrayAffectation aa]
  @init{$aa = new ArrayAffectation();}:
  e1 = expression {$aa.arr = $e1.value;}
  '['e2 = expression {$aa.index = $e2.value;}']'
  ASSIGNMENT e3 = expression {$aa.val = $e3.value;};
condition returns [Condition c]
  @init{$c = new Condition();}:
  IF e = expression {$c.cond = $e.value;}
  THEN inst1 = instruction {$c.i1 = $inst1.i;}
  ELSE '{'inst2 = instruction {$c.i2 = $inst2.i;}'}';
boucle returns [While w]
  @init{$w = new While();}:
  WHILE e = expression {$w.cond = $e.value;}
  DO '{'inst = instruction {$w.i = $inst.i;}'}';
expression returns [Expression value]:
  c = constante {$value = $c.E;}
  |v = variable {$value = $v.v;}
  |'-'e = expression {$value = new Inv($e.value);}
  |LOGNOT e = expression {$value = new Not($e.value);}
  |e1 = expression {$value = new Add($e1.value);}
  ADD
  e2 = expression {((Add)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new Sub($e1.value);}
  SUB
  e2 = expression {((Sub)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new Mul($e1.value);}
  MUL
  e2 = expression {((Mul)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new Div($e1.value);}
  DIV
  e2 = expression {((Div)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new And($e1.value);}
  LOGAND
  e2 = expression {((And)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new Or($e1.value);}
  LOGOR
  e2 = expression {((Or)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new LTE($e1.value);}
  LTEQ
  e2 = expression {((LTE)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new LT($e1.value);}
  LTH
  e2 = expression {((LT)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new Eq($e1.value);}
  EQU
  e2 = expression {((Eq)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new NEq($e1.value);}
  DIFF
  e2 = expression {((NEq)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new GT($e1.value);}
  GTH
  e2 = expression {((GT)$value).operandeD = $e2.value;}
  |e1 = expression {$value = new GTE($e1.value);}
  GTEQ
  e2 = expression {((GTE)$value).operandeD = $e2.value;}
  |f = fonctappel {$value = $f.fa;}
  |arr = expression {$value = new ArrayGet($arr.value);}
  '['i = expression {((ArrayGet)$value).index = $i.value;}']'
  |ARRAY_ALLOCATION ARRAY t = type {$value = new ArrayAllocation($t.T);}
  '['taille = expression {((ArrayAllocation)$value).taille = $taille.value;}']';
cible returns [Cible c]:
  IN {$c = new Read();}
  |OUT {$c = new Write();}
  |uf = ID {$c = new FonctionUtilisateur($uf.text);};
procappel returns [ProcedureAppel pa]
  @init{$pa = new ProcedureAppel();}:
  c = cible {$pa.cible = $c.c;}'('(e = expression {$pa.args.add($e.value);})*')';
fonctappel returns [FonctionAppel fa]
  @init{$fa = new FonctionAppel();}:
  c = cible {$fa.cible = $c.c;}'('(e = expression {$fa.args.add($e.value);})*')';
type returns [Type T]:
  INT {$T = new Int();}
  |BOOL {$T = new Bool();}
  |ARRAY t = type {$T = new Array($t.T);};
variable returns [Variable v]:
  name = ID {$v = new Variable($name.text);};
constante returns [Expression E]:
  c = LITENT {$E = new Constante(Integer.parseInt($c.text));}
  |LITTRUE {$E = new ConstanteTrue();}
  |LITFALSE {$E = new ConstanteFalse();};

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
