import java.util.ArrayList;

class FonctionAppel extends Expression{
  Cible cible;
  ArrayList<Expression> args;

  FonctionAppel(){
    this.cible = null;
    this.args = new ArrayList<Expression>();
  }

  FonctionAppel(Cible cible, ArrayList<Expression> args){
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
