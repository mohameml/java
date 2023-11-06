


# all : runTestzoo

compileTestHeritage :
	javac -d ./bin/ -sourcepath src/ src/TestHeritage.java

compileTest_zoo_Ensimag :
	javac -d ./bin/ -sourcepath src/ src/Test_zoo_Ensimag.java

runTestHeritage : compileTestHeritage
	java -classpath ./bin TestHeritage

runTestzoo : compileTest_zoo_Ensimag
	java -classpath ./bin Test_zoo_Ensimag

clean :
	rm -r bin/*