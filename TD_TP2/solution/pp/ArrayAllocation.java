class ArrayAllocation extends Expression{
  Type type;
  Expression taille;

  ArrayAllocation(Type type){
    this.type = type;
    this.taille = null;
  }

  ArrayAllocation(Type type, Expression taille){
    this.type = type;
    this.taille = taille;
  }

  public String toString(){return "new array of " + this.type + " [" + this.taille + "]";}
}
