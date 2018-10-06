class Add extends BinOp{

  Add(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Add(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " + " + this.operandeD;}
}
