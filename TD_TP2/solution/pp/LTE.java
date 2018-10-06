class LTE extends BinOp{

  LTE(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  LTE(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " <= " + this.operandeD;}
}
