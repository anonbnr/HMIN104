import java.util.ArrayList;

class Procedure extends Definition{

  Procedure(String name, ArrayList<Pair<String, Type>> args, ArrayList<Pair<String, Type>> locals, Instruction code){
    super(name, args, locals, code);
  }
}
