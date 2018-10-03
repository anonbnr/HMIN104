import java.util.ArrayList;

class ProcedureAppel extends Instruction{
  Cible cible;
  ArrayList<Expression> args;

  ProcedureAppel(Cible cible, ArrayList<Expression> args){
    this.cible = cible;
    this.args = args;
  }

  public String toString(){
    String result = "";
    result += this.cible + "(";
    for (Expression a : args)
      result += a + " ";

    result += "\b)\n";

    return result;
  }
}
