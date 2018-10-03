class Not extends UOp{
  Not(Expression op){
    this.operande = op;
  }

  public String toString(){return "not(" + this.operande + ")";}
}
