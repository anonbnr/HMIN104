class Or extends BinOp{
  Or(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " or " + this.operandeD;}
}
