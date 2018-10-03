class ArrayGet extends Expression{
  Expression arr, index;

  ArrayGet(Expression arr, Expression index){
    this.arr = arr;
    this.index = index;
  }

  public String toString(){return this.arr + "[" + this.index + "]";}
}
