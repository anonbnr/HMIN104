class Add extends BinOp{
  Add(ExprArith e1, ExprArith e2){
    this.e1 = e1;
    this.e2 = e2;
  }

  int eval(){return this.e1.eval() + this.e2.eval();}
}
