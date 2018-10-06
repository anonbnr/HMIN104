class And extends BinOp{

  And(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  And(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " and " + this.operandeD;}
}
