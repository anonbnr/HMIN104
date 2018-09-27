grammar ExprArithAST;
expr returns [ExprArith value]:
  e = additionExpr {$value = $e.value;};
additionExpr returns [ExprArith value]:
  e1 = multiplyExpr {$value = $e1.value;}
  ('+'e2 = multiplyExpr {$value = new Add($value, $e2.value);}
  |'-'e2 = multiplyExpr {$value = new Sub($value, $e2.value);})*;
multiplyExpr returns [ExprArith value]:
  e1 = atomExpr {$value = $e1.value;}
  ('*'e2 = atomExpr {$value = new Mul($value, $e2.value);}
  |'/'e2 = atomExpr {$value = new Div($value, $e2.value);})*;
atomExpr returns [ExprArith value]:
  c = Number {$value = new Cte(Integer.parseInt($c.text));}
  |'('e1 = additionExpr')' {$value = $e1.value;}
  |'-'e2 = atomExpr {$value = new Inv($e2.value);};
Number: [0-9]+;
WS: [ \t\r\n] -> skip;
