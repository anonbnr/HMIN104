import java.util.ArrayList;

class Fonction extends Definition{
  Type ret;

  Fonction(String name, ArrayList<Pair<String, Type>> args, ArrayList<Pair<String, Type>> locals, Instruction code, Type ret){
    super(name, args, locals, code);
    this.code = code;
  }

  public String toString(){
    String result = super.toString();
    result += "retourne un " + this.ret.toString() + "\n";

    return result;
  }
}
