

all : run 


compile :
	javac -d ./bin/ -sourcepath ./src/ ./src/test.java 


run : compile 
	java -cp ./bin/ test


clean :
	rm -r ./bin/*