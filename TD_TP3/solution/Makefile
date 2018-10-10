JAVAC= javac

bin:
	@echo "compilation des fichiers source"
	$(JAVAC) *.java;

PP: UPP
	@echo compilation du fichier $@.java
	${JAVAC} $@.java

UPP: RTL
	@echo compilation du fichier $@.java
	${JAVAC} $@.java

RTL:
	@echo compilation du fichier $@.java
	${JAVAC} $@.java

clean:
	rm -f *.class
