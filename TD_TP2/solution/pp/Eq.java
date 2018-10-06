class Eq extends BinOp{
  Eq(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Eq(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " = " + this.operandeD;}
}
