class LT extends BinOp{
  LT(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  LT(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " < " + this.operandeD;}
}
