ANTLR=java -jar /usr/local/lib/antlr-4.7.1-complete.jar
JAVAC=javac
G4=PP.g4

bin:
	$(ANTLR) $(G4);
	tmp=`basename $$(G4) .g4`;
	$(JAVAC) $$tmp*.java;

clean:
	rm -f *~ *.class *.tokens *Lexer.java *.Parser.java *Listener.java
