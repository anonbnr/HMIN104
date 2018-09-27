public class ConstanteInt extends Expression{
  int value;
  ConstanteInt(int value){this.value = value};
  public String toString(){return "expression valant " + this.value;}
}
