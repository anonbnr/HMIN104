import java.util.ArrayList;

class Programme{
  ArrayList<Pair<String, Type>> globals;
  ArrayList<Definition> defs;
  Instruction code;

  Programme(ArrayList<Pair<String, Type>> globals, ArrayList<Definition> defs, Instruction code){
    this.globals = globals;
    this.defs = defs;
    this.code = code;
  }

  public String toString(){
    String result = "";

    for (Pair<String, Type> var: globals)
      result += "var " + var.left + " : " + var.right + "\n";

    for (Definition def : defs)
      result += def.toString();

    result += code.toString();

    return result;
  }
}
