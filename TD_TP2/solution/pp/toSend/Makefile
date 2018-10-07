ANTLR=java -jar /usr/local/lib/antlr-4.7.1-complete.jar
JAVAC= javac
G4=PP.g4
TESTS=simple factIter factRecur isPos isSq

bin:
	@echo compilation de la grammaire ${G4}
	$(ANTLR) $(G4);
	@tmp=`basename $(G4) .g4`;
	@echo
	@echo compilation des fichiers sources générés par ANTLR
	$(JAVAC) $$tmp*.java;
	@echo
	@echo "analyse syntaxique de différents programmes écrits en PP"
	@for file in $(TESTS); do sim=`cat $$file`; java PPTest "$$sim"; done

clean:
	rm -f *~ *.class *.tokens *Lexer.java *Parser.java *Listener.java *.interp
