# Example de makefile pour compiler le squelette de code distribué
# Vous pouvez compléter ce makefile, mais étant donnée la taille du projet, 
# il est FORTEMENT recommandé d'utiliser un IDE!

# Organisation:
#  1) Les sources (*.java) se trouvent dans le répertoire src
#     Les classes d'un package toto sont dans src/toto
#     Les classes du package par defaut sont dans src
#
#  2) Les bytecodes (*.class) sont générés dans le répertoire bin
#     La hiérarchie des sources (par package) est conservée.
#
#  3) Une librairie gui.jar est distribuée pour l'interface grapique. 
#     Elle se trouve dans le sous-répertoire lib.
#
# Compilation:
#  Options de javac:
#   -d : répertoire dans lequel sont générés les .class compilés
#   -sourcepath : répertoire dans lequel sont cherchés les .java
#   -classpath : répertoire dans lequel sont cherchées les classes compilées (.class et .jar)



compileTestInvader:
	javac -d bin -classpath lib/gui.jar -sourcepath src/ src/TestInvader.java

runTestInvader: compileTestInvader
	java -classpath bin:lib/gui.jar TestInvader





compileTestBalles :
	javac -d ./bin  -cp ./lib/gui.jar -sourcepath src/ src/TestBalles.java

runTestBalles: compileTestBalles 
	java -classpath bin:lib/gui.jar TestBalles





compileTestGUI:
	javac -d bin -classpath lib/gui.jar src/TestGUISimulator.java

runTestGUI: compileTestGUI
	java -classpath bin:lib/gui.jar  TestGUISimulator


compileTestBallesSimulator :
		javac -d bin -classpath lib/gui.jar  -sourcepath src/ src/TestBallesSimulator.java



runTestBallesSimulator : compileTestBallesSimulator

	java -classpath bin:lib/gui.jar TestBallesSimulator 



compileTestBoids :
		javac -d ./bin/ -classpath lib/gui.jar -sourcepath src/ src/TestBoids.java

runTestBoids : compileTestBoids 
	java -cp bin:lib/gui.jar TestBoids 


compileTestVecteur :
	javac -d ./bin -sourcepath src/ src/TestVecteur.java

runTestVecteur : compileTestVecteur
	java -cp ./bin/ TestVecteur 


compileTestEvent :
	javac -d ./bin/ -sourcepath ./src/ ./src/TestEventManager.java

runTestEvent : compileTestEvent
	java -cp ./bin TestEventManager 


clean:
	rm -r bin/*


