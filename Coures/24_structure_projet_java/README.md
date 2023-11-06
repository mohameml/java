# cour 24 : Makefile 


## 1. **La structure d'un projet en java :**



- **La Structure Générale d'un Projet Java**

La structure d'un projet logiciel Java est généralement organisée de manière hiérarchique pour gérer différents aspects du développement et du déploiement du logiciel. 

- Voici une structure de base :

```
projet-java/
│
├── src/               (Contient le code source)
│   ├── main/
│   │   ├── java/      (Classes source)
│   │   ├── resources/ (Fichiers de ressources)
│   │
│   ├── test/
│       ├── java/      (Classes de test)
│       ├── resources/ (Fichiers de ressources pour les tests)
│
├── bin/               (Dossier de sortie des fichiers compilés)
│
├── lib/               (Bibliothèques tierces)
│
├── doc/               (Documentation)
│
|  
│
├── Makefile           (Script de construction)
│
├── README.md          (Documentation du projet)
```

- **expliquation du rôle de chaque dossier dans la structure générale d'un projet logiciel en Java et les types de fichiers qu'ils contiennent :**

1. **`src/`** (Source Code Directory):

   - **`main/`**: Ce dossier contient le code source principal de l'application.
     - **`java/`**: Il contient les fichiers source Java (.java) qui forment le cœur de l'application.
     - **`resources/`**: Il peut contenir des fichiers de ressources tels que fichiers de configuration, images, fichiers de propriétés, etc., utilisés par l'application.

   - **`test/`**: Il contient les fichiers source Java pour les tests unitaires.
     - **`java/`**: Les fichiers source Java pour les tests unitaires de l'application.
     - **`resources/`**: Les fichiers de ressources spécifiques aux tests.

2. **`lib/` (Libraries Directory)**:
   - Il contient les bibliothèques t (fichiers JAR) nécessaires à votre application. Ces bibliothèques sont utilisées pour étendre les fonctionnalités de votre application.

3. **`bin/` (Binary Output Directory)**:
   - Ce dossier est généralement utilisé pour stocker les fichiers binaires générés lors de la compilation. Les fichiers `.class` générés à partir des fichiers source `.java` sont stockés ici.

4. **`doc/`** (Documentation Directory):
   - Ce dossier est utilisé pour stocker la documentation du projet, telle que la documentation JavaDoc, les manuels d'utilisation, les guides de développement.
```bash

javadoc -d doc -sourcepath src MonPackage

```

5. **`Makefile`** (Build Automation Script):
   - C'est un fichier de script Makefile utilisé pour automatiser le processus de compilation et de gestion du projet. Il peut contenir des règles pour compiler, exécuter et nettoyer le projet.

6. **`README.md`** (Project Documentation):
   - Il s'agit d'un fichier de documentation texte ou Markdown qui contient des informations sur le projet, telles que des instructions d'installation, des descriptions, des dépendances, des licences, etc.


### RQ : pour les pacakages :

- Les packages Java sont souvent organisés en fonction de la hiérarchie des répertoires dans le répertoire source. Chaque package correspond à un répertoire dans le répertoire source. Par exemple, si vous avez un package `com.monprojet.mesclasses`, il sera généralement situé dans le répertoire `src/com/monprojet/mesclasses`.

- Lorsque vous compilez votre code Java, les fichiers `.class` résultants (les fichiers binaires contenant le bytecode Java) sont généralement organisés dans une structure de répertoires qui reflète celle des packages. Par exemple, si vous avez un package `com.monprojet.mesclasses`, les fichiers `.class` correspondants se trouveront dans le répertoire de sortie (par exemple, `bin/com/monprojet/mesclasses`).

- Si vous créez un fichier JAR à partir de votre projet Java, la structure interne du fichier JAR reflétera également la structure de packages. Chaque package sera représenté sous forme de répertoire à l'intérieur du fichier JAR.



## 2. **les options `-sourcepath` et `-classpath`:**

En Java, les options `-sourcepath` et `-classpath` sont utilisées pour spécifier les chemins vers les sources et les classes respectivement lors de la compilation et de l'exécution de programmes Java. 

1. **`-sourcepath`** :

   - L'option `-sourcepath` permet de spécifier le chemin vers les fichiers source Java lors de la compilation.

   - Cela signifie que vous pouvez indiquer où le compilateur Java (généralement `javac`) doit rechercher les fichiers source Java que vous importez ou référencez dans votre code.

   - Cela est utile lorsque vos fichiers source Java ne se trouvent pas dans le répertoire courant, et que vous souhaitez que le compilateur puisse les trouver.

   - Exemple d'utilisation :
   ```bash
   javac -sourcepath chemin/vers/sources chemin/vers/sources/FichierMain.java

   ## Exemple : 
   javac -d ./bin/ -sourcepath src/  src/Main.java

   ```

2. **`-classpath`** :

   - L'option `-classpath` (ou son raccourci `-cp`) permet de spécifier le chemin vers les fichiers de classes (fichiers `.class`) lors de l'exécution d'un programme Java.

   - Cela signifie que vous pouvez indiquer où le programme Java doit rechercher les classes dont il dépend pour s'exécuter. Ces classes peuvent être vos propres classes ou des bibliothèques tierces.

   Exemple d'utilisation :
   ```bash
   java -classpath chemin/vers/classes MonProgramme

   # exemple : 

   java -classpath ./bin/ Main
   ```
### RQ :

- Il est important de noter que les valeurs spécifiées avec `-sourcepath` et `-classpath` peuvent être des chemins de répertoires ou des chemins de fichiers séparés par des deux-points (:) sous Linux/macOS :

 - **Exemple :**

voici un exemple d'utilisation des options `-sourcepath` et `-classpath` avec des chemins de répertoires sous Linux/MacOS. Supposons que nous ayons une structure de projet Java comme suit :

```
        projet-java/
        │
        ├── src/
        │   └── Main.java
        │
        ├── lib/
        │   ├── bibliotheque1.jar
        │   └── bibliotheque2.jar
        │
        ├── bin/
```


1. Utilisation de `-sourcepath` pour spécifier le chemin des sources (`src`) et `-classpath` pour spécifier le chemin des bibliothèques (`lib/bibliotheque1.jar:lib/bibliotheque2.jar`) lors de la compilation :

```bash
        javac -d bin/ -sourcepath src/ -classpath lib/bibliotheque1.jar:lib/bibliotheque2.jar src/Main.java
```

 

2. Exécution du programme compilé en utilisant l'option `-classpath` :

```bash
        java -classpath bin/:lib/bibliotheque1.jar:lib/bibliotheque2.jar Main
```









## 3.**Écriture d'un Makefile**

Un Makefile est un script utilisé pour automatiser le processus de compilation. Voici un exemple simple de Makefile pour un projet Java :

- **Exemple 1 :**
```make

#
# Compilation:
#  Options de javac:
#   -d : répertoire dans lequel sont générés les .class compilés
#   -sourcepath : répertoire dans lequel sont cherchés les .java
#   -classpath : répertoire dans lequel sont cherchées les classes compilées (.class et .jar)

all: run

compile:
	javac -d bin -classpath lib/gui.jar src/TestInvader.java

run: compile
	java -classpath bin:lib/gui.jar TestInvader

clean:
	rm -rf bin/



```

- **Exemple 2 :**

```make

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


```


## 4. La documentation ``javadoc`` :


### 4.1 les étapes de la documentation :

- La documentation en Java est  réalisée en utilisant un outil appelé **Javadoc**, qui génère des documents à partir des commentaires intégrés dans le code source Java. 

- Voici comment vous pouvez documenter vos **classes**, **méthodes** et **champs** en Java à l'aide de Javadoc :

1. **Commentaires de documentation de classe :**
   - Pour documenter une classe, placez un commentaire de documentation juste avant la déclaration de la classe. Vous devez utiliser le format ``/** ... */`` pour indiquer que c'est un commentaire de documentation.

   - Exemple :
   ```java
   /**
    * Cette classe représente un exemple de classe en Java.
    * Elle contient des méthodes et des champs pour effectuer diverses opérations.
   */
   public class Exemple {
       // ... Définition de la classe ...
   }
   ```

2. **Commentaires de documentation de méthode :**

   - Pour documenter une méthode, placez un commentaire de documentation juste avant la déclaration de la méthode. Incluez une description de ce que fait la méthode, des paramètres, et la valeur de retour le cas échéant.

   - Exemple :
   ```java
   /**
    * Cette méthode additionne deux nombres et renvoie le résultat.
    *
    * @param a Le premier nombre à additionner.
    * @param b Le deuxième nombre à additionner.
    * @return La somme des deux nombres.
    */
   public int additionner(int a, int b) {
       return a + b;
   }
   ```

3. **Commentaires de documentation de champ (variable) :**

   - Pour documenter un champ, placez un commentaire de documentation juste avant la déclaration du champ. Incluez une description de son rôle et de sa signification.

   Exemple :
   ```java
   /**
    * Cette variable stocke un identifiant unique pour l'objet.
    */
   private int id;
   ```

- Une fois que vous avez ajouté ces commentaires de documentation dans votre code, vous pouvez utiliser l'outil Javadoc pour générer la documentation sous forme de fichiers *HTML*. 

- Pour générer la documentation, utilisez la commande `javadoc` dans votre terminal :

```
javadoc -d docs MonClasse.java
```

Cela générera la documentation dans un répertoire nommé "docs" à partir de votre fichier source "MonClasse.java". Vous pourrez ensuite ouvrir les fichiers HTML générés dans un navigateur pour accéder à votre documentation Java.


## 4.2**Utilisez des balises Javadoc** :
   
- Javadoc prend en charge de nombreuses balises que vous pouvez utiliser pour formater et enrichir votre documentation. 

- Voici quelques balises couramment utilisées :
   
   - `@param` : Décrire les paramètres d'une méthode.
   - `@return` : Décrire la valeur de retour d'une méthode.
   - `@throws` : Décrire les exceptions levées par une méthode.
   - `@see` : Créer des liens vers d'autres classes ou méthodes.
   - `@deprecated` : Marquer un élément comme obsolète.
   - `@since` : Indiquer la version à partir de laquelle l'élément a été introduit.




