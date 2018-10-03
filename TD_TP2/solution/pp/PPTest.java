import org.antlr.v4.runtime.*;

public class PPTest{
  public static void main(String[] args){
    ANTLRInputStream stream = new ANTLRInputStream(args[0]);
    PPLexer lexer = new PPLexer(stream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PPParser parser = new PPParser(tokens);
    Programme prog = parser.programme().p;
    System.out.println(prog);
  }
}
