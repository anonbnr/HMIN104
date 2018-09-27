public class ConstanteBool extends Expression{
  boolean value;
  ConstanteBool(boolean value){this.value = value;}
  public String toString(){return "expression valant " + this.value;}
}
