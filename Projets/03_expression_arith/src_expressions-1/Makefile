

all : run

compile : 
	javac -d ./bin/ -sourcepath ./src/ src/Main.java

run : compile 
	java -classpath ./bin/ Main 

clean :
	rm -r ./bin/*