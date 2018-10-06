class While extends Instruction{
  Expression cond;
  Instruction i;

  While(){
    this.cond = null;
    this.i = null;
  }

  While(Expression cond, Instruction i){
    this.cond = cond;
    this.i = i;
  }

  public String toString(){return "while " + this.cond + " do {" + this.i + "}\n";}
}
