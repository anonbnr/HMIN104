class Div extends BinOp{
  Div(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " / " + this.operandeD;}
}
