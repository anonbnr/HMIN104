class Constante extends Expression{
  int value;

  Constante(int value){this.value = value;}

  public String toString(){return "expression valant " + this.value;}
}
