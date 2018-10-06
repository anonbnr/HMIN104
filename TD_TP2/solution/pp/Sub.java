class Sub extends BinOp{

  Sub(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Sub(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " - " + this.operandeD;}
}
