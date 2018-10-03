class Variable extends Expression{
  String name;

  Variable(String name){this.name = name;}

  public String toString(){return "variable nommée " + this.name;}
}
