
# Spécifiez les répertoires pour les fichiers source et les fichiers compilés
SRCDIR := src
BINDIR := bin

# Spécifiez les répertoires pour les fichiers JAR externes
LIBDIR := lib

# Spécifiez les noms des fichiers JAR externes
JFREECHART_JAR := jfreechart.jar
JCOMMON_JAR := jcommon.jar

# Spécifiez les fichiers source de votre projet
SOURCES := $(wildcard $(SRCDIR)/*.java)

# Spécifiez le nom de votre classe principale
MAINCLASS := ChartExample

# Spécifiez le chemin de classe pour les fichiers JAR externes
CLASSPATH := $(BINDIR):$(LIBDIR)/$(JFREECHART_JAR):$(LIBDIR)/$(JCOMMON_JAR)

# Options de compilation
JAVAC := javac
JAVACFLAGS := -d $(BINDIR) -sourcepath $(SRCDIR) -classpath $(CLASSPATH)

# Cible de compilation
compile:
	$(JAVAC) $(JAVACFLAGS) $(SOURCES)

# Cible pour exécuter l'application
run: compile
	java -classpath $(CLASSPATH) $(MAINCLASS)

# Cible pour nettoyer les fichiers compilés
clean:
	rm -rf $(BINDIR)/*.class
