class ArrayAffectation extends Instruction{
  Expression arr, index, val;

  ArrayAffectation(){
    this.arr = null;
    this.index = null;
    this.val = null;
  }

  ArrayAffectation(Expression arr, Expression index, Expression val){
    this.arr = arr;
    this.index = index;
    this.val = val;
  }

  public String toString(){return this.arr + "[" + this.index + "] := " + this.val;}
}
