class Inv extends ExprArith{
  ExprArith e;

  Inv(ExprArith e){this.e = e;}

  int eval(){return -e.eval();}
}
