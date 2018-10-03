class ArrayAffectation{
  Expression arr, index, val;

  ArrayAffectation(Expression arr, Expression index, Expression val){
    this.arr = arr;
    this.index = index;
    this.val = val;
  }

  public String toString(){return this.arr + "[" + this.index + "] := " + this.val;}
}
