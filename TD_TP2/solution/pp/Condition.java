class Condition extends Instruction{
  Expression cond;
  Instruction i1, i2;

  Condition(Expression cond, Instruction i1, Instruction i2){
    this.cond = cond;
    this.i1 = i1;
    this.i2 = i2;
  }

  public String toString(){return "if " + this.cond + " then " + this.i1 + " else " + this.i2;}
}
