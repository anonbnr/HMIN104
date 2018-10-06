class Condition extends Instruction{
  Expression cond;
  Instruction i1, i2;

  Condition(){
    this.cond = null;
    this.i1 = null;
    this.i2 = null;
  }

  Condition(Expression cond, Instruction i1, Instruction i2){
    this.cond = cond;
    this.i1 = i1;
    this.i2 = i2;
  }

  public String toString(){return "if " + this.cond + " then " + this.i1 + " else {" + this.i2 + "}";}
}
