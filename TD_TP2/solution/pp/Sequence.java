class Sequence extends Instruction{
  Instruction i1, i2;

  Sequence(Instruction i1, Instruction i2){
    this.i1 = i1;
    this.i2 = i2;
  }

  public String toString(){return this.i1 + " ; " + this.i2;}
}
