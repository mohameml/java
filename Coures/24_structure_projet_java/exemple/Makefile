JAVAC = javac
JAVA = java
SRC_DIR = src
BIN_DIR = bin
MAIN_CLASS = com.example.Main

all: compile run

compile:
	$(JAVAC) -d $(BIN_DIR) -sourcepath $(SRC_DIR) $(SRC_DIR)/$(MAIN_CLASS).java

run:
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

clean:
	rm -rf $(BIN_DIR)/*

.PHONY: all compile run clean






























