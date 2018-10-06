class Affectation extends Instruction{
  String name;
  Expression val;

  Affectation(){
    this.name = "";
    this.val = null;
  }

  Affectation(String name, Expression val){
    this.name = name;
    this.val = val;
  }

  public String toString(){return this.name + " := " + this.val;}
}
