import java.util.ArrayList;

abstract class Definition{
  String name;
  ArrayList<Pair<String, Type>> args, locals;
  Instruction code;

  Definition(){
    this.name = "";
    this.args = new ArrayList<Pair<String, Type>>();
    this.locals = new ArrayList<Pair<String, Type>>();
  }

  Definition(String name, ArrayList<Pair<String, Type>> args, ArrayList<Pair<String, Type>> locals, Instruction code){
    this.name = name;
    this.args = args;
    this.locals = locals;
    this.code = code;
  }

  public String toString(){
    String result = "";
    result += "Nom : " + this.name + "\n";

    for (Pair<String, Type> a : args)
      result += "arg " + a.left + " : " + a.right + "\n";

    for (Pair<String, Type> l : locals)
      result += "var " + l.left + " : " + l.right + "\n";

    result += code.toString();

    return result;
  }
}
