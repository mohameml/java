

all : run

compile :
	javac -d ./bin/ ./src/Main.java 

run : compile

	java -classpath  ./lib/sqlite-jdbc.jar:./bin Main
	