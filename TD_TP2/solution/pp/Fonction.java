import java.util.ArrayList;

class Fonction extends Definition{
  Type ret;

  Fonction(){
    super();
  }

  Fonction(String name, ArrayList<Pair<String, Type>> args, Type ret){
    super(name, args);
    this.ret = ret;
  }

  Fonction(String name, ArrayList<Pair<String, Type>> args, ArrayList<Pair<String, Type>> locals, Instruction code, Type ret){
    super(name, args, locals, code);
    this.code = code;
  }

  public String toString(){
    return this.ret.toString() + " " + super.toString();
  }
}
