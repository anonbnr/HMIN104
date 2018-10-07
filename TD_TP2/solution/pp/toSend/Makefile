# $Id$

ANTLR=java -jar /usr/local/lib/antlr-4.7.1-complete.jar
JAVAC= javac
G4=PP.g4
TESTS=  simple factIter factRecur isPos isSq
# arr  
SHELL:=/bin/bash

bin:
	$(ANTLR) $(G4);
	tmp=`basename $(G4) .g4`;
	$(JAVAC) $$tmp*.java;
	# sim:=$(shell cat simple)
	for file in $(TESTS); do sim=`cat $$file`; java PPTest "$$sim"; done
