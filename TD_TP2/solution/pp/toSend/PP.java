import java.util.*;

/**
 * TYPES
 */
abstract class Type{}

class Int extends Type {
  public String toString(){return "integer";}
}

class Bool extends Type {
  public String toString(){return "boolean";}
}

class Array extends Type{
  Type type;

  Array(Type type){this.type = type;}

  public String toString(){return "array of " + this.type.toString();}
}

/**
 * EXPRESSIONS
 */
abstract class Expression{}

class Constante extends Expression{
  int value;

  Constante(int value){this.value = value;}

  public String toString(){return "" + this.value;}
}

class ConstanteFalse extends Expression{
  public String toString(){return "false";}
}

class ConstanteTrue extends Expression{
  public String toString(){return "true";}
}

class Variable extends Expression{
  String name;

  Variable(String name){this.name = name;}

  public String toString(){return this.name;}
}

abstract class UOp extends Expression{
  Expression operande;
}

class Inv extends UOp{
  Inv(Expression op){
    this.operande = op;
  }

  public String toString(){return "-" + this.operande;}
}

class Not extends UOp{
  Not(Expression op){
    this.operande = op;
  }

  public String toString(){return "not(" + this.operande + ")";}
}

abstract class BinOp extends Expression{
  Expression operandeG, operandeD;
}

class Add extends BinOp{

  Add(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Add(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " + " + this.operandeD;}
}

class Sub extends BinOp{

  Sub(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Sub(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " - " + this.operandeD;}
}

class Mul extends BinOp{

  Mul(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Mul(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " * " + this.operandeD;}
}

class Div extends BinOp{

  Div(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Div(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " / " + this.operandeD;}
}

class And extends BinOp{

  And(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  And(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " and " + this.operandeD;}
}

class Or extends BinOp{

  Or(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Or(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " or " + this.operandeD;}
}

class Eq extends BinOp{
  Eq(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  Eq(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " = " + this.operandeD;}
}


class GT extends BinOp{

  GT(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  GT(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " > " + this.operandeD;}
}

class GTE extends BinOp{

  GTE(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  GTE(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " >= " + this.operandeD;}
}


class LT extends BinOp{
  LT(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  LT(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " < " + this.operandeD;}
}

class LTE extends BinOp{

  LTE(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  LTE(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " <= " + this.operandeD;}
}

class NEq extends BinOp{
  NEq(Expression og){
    this.operandeG = og;
    this.operandeD = null;
  }

  NEq(Expression og, Expression od){
    this.operandeG = og;
    this.operandeD = od;
  }

  public String toString(){return this.operandeG + " != " + this.operandeD;}
}


abstract class Cible{}

class Read extends Cible{
  public String toString(){return "read";}
}

class Write extends Cible{
  public String toString(){return "write";}
}

class FonctionUtilisateur extends Cible{
  String name;

  FonctionUtilisateur(String name){
    this.name = name;
  }

  public String toString(){return this.name;}
}

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

class ArrayGet extends Expression{
  Expression arr, index;

  ArrayGet(Expression arr){
    this.arr = arr;
    this.index = null;
  }

  ArrayGet(Expression arr, Expression index){
    this.arr = arr;
    this.index = index;
  }

  public String toString(){return this.arr + "[" + this.index + "]";}
}

class ArrayAllocation extends Expression{
  Type type;
  Expression taille;

  ArrayAllocation(Type type){
    this.type = type;
    this.taille = null;
  }

  ArrayAllocation(Type type, Expression taille){
    this.type = type;
    this.taille = taille;
  }

  public String toString(){return "new array of " + this.type + " [" + this.taille + "]";}
}

abstract class Instruction{}

class Affectation extends Instruction{
  String name;
  Expression val;

  Affectation(){
    this.name = "";
    this.val = null;
  }

  Affectation(String name, Expression val){
    this.name = name;
    this.val = val;
  }

  public String toString(){return this.name + " := " + this.val;}
}


class ArrayAffectation extends Instruction{
  Expression arr, index, val;

  ArrayAffectation(){
    this.arr = null;
    this.index = null;
    this.val = null;
  }

  ArrayAffectation(Expression arr, Expression index, Expression val){
    this.arr = arr;
    this.index = index;
    this.val = val;
  }

  public String toString(){return this.arr + "[" + this.index + "] := " + this.val;}
}

class Condition extends Instruction{
  Expression cond;
  Instruction i1, i2;

  Condition(){
    this.cond = null;
    this.i1 = null;
    this.i2 = null;
  }

  Condition(Expression cond, Instruction i1, Instruction i2){
    this.cond = cond;
    this.i1 = i1;
    this.i2 = i2;
  }

  public String toString(){return "if " + this.cond + " then " + this.i1 + " else {" + this.i2 + "}";}
}

class While extends Instruction{
  Expression cond;
  Instruction i;

  While(){
    this.cond = null;
    this.i = null;
  }

  While(Expression cond, Instruction i){
    this.cond = cond;
    this.i = i;
  }

  public String toString(){return "while " + this.cond + " do {" + this.i + "}\n";}
}

class ProcedureAppel extends Instruction{
  Cible cible;
  ArrayList<Expression> args;

  ProcedureAppel(){
    this.cible = null;
    this.args = new ArrayList<Expression>();
  }

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

class Sequence extends Instruction{
  Instruction i1, i2;

  Sequence(Instruction i1){
    this.i1 = i1;
    this.i2 = null;
  }

  Sequence(Instruction i1, Instruction i2){
    this.i1 = i1;
    this.i2 = i2;
  }

  public String toString(){return this.i1 + " ;\n" + this.i2;}
}

class Skip extends Instruction{
  public String toString(){return "skip";}
}

class Pair<L,R>{
  L left;
  R right;

  Pair(){}

  Pair(L left, R right){
    this.left = left;
    this.right = right;
  }

  public String toString(){return "<" + this.left + "," + this.right + ">";}
}

abstract class Definition{
  String name;
  ArrayList<Pair<String, Type>> args, locals;
  Instruction code;

  Definition(){
    this.name = "";
    this.args = new ArrayList<Pair<String, Type>>();
    this.locals = new ArrayList<Pair<String, Type>>();
  }

  Definition(String name, ArrayList<Pair<String, Type>> args){
    this.name = name;
    this.args = args;
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
    result += this.name + "(";

    for (Pair<String, Type> a : args)
      result += a.left + " : " + a.right + ", ";

    result += "\b\b)\n";

    for (Pair<String, Type> l : locals)
      result += "var " + l.left + " : " + l.right + "\n";

    result += code.toString() + "\n";

    return result;
  }
}

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

class Procedure extends Definition{

  Procedure(){
    super();
  }

  Procedure(String name, ArrayList<Pair<String, Type>> args, ArrayList<Pair<String, Type>> locals, Instruction code){
    super(name, args, locals, code);
  }
}

class Programme{
  ArrayList<Pair<String, Type>> globals;
  ArrayList<Definition> defs;
  Instruction code;

  Programme(){
    globals = new ArrayList<Pair<String, Type>>();
    defs = new ArrayList<Definition>();
    this.code = null;
  }

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

