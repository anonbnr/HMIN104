class Inv extends UOp{
  Inv(Expression op){
    this.operande = op;
  }

  public String toString(){return "-" + this.operande;}
}
