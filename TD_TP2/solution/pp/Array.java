public class Array extends Type{
  Type type;

  Array(Type type){this.type = type;}

  public String toString(){return "array of " + this.type.toString();}
}
