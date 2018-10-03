class Pair<L,R>{
  L left;
  R right;

  Pair(){}

  Pair(L left, R right){
    this.left = left;
    this.right = right;
  }

  public String toString(){return "<" + this.left + "," + this.right + ">";}
}
