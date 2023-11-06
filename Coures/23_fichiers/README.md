# cour 23 : Tratiement de fichier en Java.


## I. Introduction  :


### 1. Les fichiers informatiques :

- Un fichier informatique est un ensemble de données stockées sur un périphérique non volatile( non volatile est un stockage permanent. il n'est pas perdu lorsqu'un ordinateur est hors tension ).

- Java prend en charge la manipulation de plusieurs types de fichiers, notamment les fichiers texte et les fichiers binaires. Les fichiers texte contiennent des données lisibles par l'homme, tandis que les fichiers binaires stockent des données brutes, non lisibles directement.


### 2. Les classes principales :


En Java, les classes principales pour le traitement de fichiers se trouvent dans les packages `java.io` et `java.nio`. Voici quelques classes clés :

- `File` : Représente un chemin de fichier ou de répertoire et peut être utilisé pour effectuer des opérations basiques telles que vérifier l'existence, supprimer, renommer, etc.

- `FileReader` et `FileWriter` : Utilisés pour lire et écrire des caractères dans des fichiers texte.

- `BufferedReader` et `BufferedWriter` : Offrent des opérations de lecture et d'écriture plus efficaces en utilisant des tampons, ce qui améliore les performances.

- `InputStream` et `OutputStream` : Utilisés pour la lecture et l'écriture d'octets dans des fichiers binaires.

- `Paths` : La classe `Paths` fournit des méthodes statiques pour créer des objets `Path`, qui représentent des chemins de fichiers ou de répertoires. Un objet `Path` encapsule un chemin abstrait qui peut pointer vers un emplacement sur le système de fichiers.


- `Files` : La classe `Files` fournit diverses méthodes statiques pour effectuer des opérations sur des fichiers et des répertoires, telles que la création, la copie, la suppression, etc. 

- `Charset` : La classe `Charset` fait partie de l'API Java et se trouve dans le package `java.nio.charset`. Elle permet de gérer les encodages, qui définissent la manière dont les caractères sont représentés en mémoire sous forme de séquences d'octets.
- `IOException ` :  est une classe faisant partie de la hiérarchie des exceptions liées aux opérations d'entrées/sorties en Java. Elle appartient au package java.io et dérive de la classe Exception. Elle est utilisée pour signaler des erreurs lors de la manipulation de flux de données, de fichiers, de sockets et d'autres opérations d'E/S.





## II. Lecture d'un fichier :

### 1. la méthode `newBufferedReader` de la classe `Files`:

La méthode `newBufferedReader` de la classe `Files` permet de lire un fichier texte en utilisant un `BufferedReader`. Cette méthode est très pratique et simplifie la gestion des ressources et la lecture des lignes du fichier. Voici comment l'utiliser :

```java
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectureAvecNewBufferedReader {
    public static void main(String[] args) {
        Path cheminFichier = Paths.get("monFichier.txt");
        
        try{
            BufferedReader reader = Files.newBufferedReader(cheminFichier)
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);

            reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Dans cet exemple, nous utilisons `Paths.get` pour créer un objet `Path` à partir du chemin du fichier. Ensuite, nous utilisons la méthode `Files.newBufferedReader` pour créer un `BufferedReader` .

À l'intérieur du bloc `try`, nous utilisons une boucle pour lire chaque ligne du fichier et l'afficher. La méthode `readLine` renvoie `null` lorsque la fin du fichier est atteinte.

#### RQ : les méthodes de la classe ``BufferedReader` 

- `readline()` : La méthode ``readLine()`` lit une ligne complète du flux d'entrée. Une ligne est délimitée par un caractère de saut de ligne ('\n'), un retour chariot ('\r'), ou une combinaison de ces deux caractères. La méthode renvoie ``null`` lorsque la fin du flux est atteinte.

- ``read()`` : La méthode ``read()`` lit un caractère à la fois à partir du flux d'entrée. Elle renvoie la valeur du caractère sous forme d'entier (le code ASCII du caractère), ou -1 si la fin du flux est atteinte.

- `skip()` : La méthode ``skip()`` permet de sauter un certain nombre de caractères dans le flux d'entrée. Elle peut être utile pour ignorer des données non nécessaires. Elle renvoie le nombre de caractères effectivement sautés.


### 2. `BufferedReader` et `FileReader`:

La classe `FileReader` est utilisée pour lire les caractères à partir d'un fichier texte. Elle est simple à utiliser, mais il est recommandé de l'encapsuler dans un `BufferedReader` pour améliorer les performances de la lecture en tamponnant les données. Voici comment lire un fichier avec `FileReader` :

Exemple :

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureAvecFileReaderEtBufferedReader {
    public static void main(String[] args) {
        

        try{
           
            BufferedReader bufferedReader = new BufferedReader(new FileReader("nomFichier.txt"));
            String ligne;
            while ((ligne = bufferedReader.readLine()) != null) {
                System.out.println(ligne);

            bufferedReader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


```


## III. écriture dans un fichier :

### 1. la méthode `newBufferedWriter` de la classe `Files`:

#### Exemple :

```java


import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exemplewrite {
    public static void main(String[] args) {

        try {
            BufferedWriter brw = Files.newBufferedWriter(Paths.get("fil2.txt"));
            /*
             * Les Méthodes pour écrire dabs le fichier :
             * - write()
             * -newLine : pour le reour a la ligne
             * 
             */

            brw.write("Bonjour tout le mond !!!");
            brw.newLine();
            brw.write("Sidi va à l'école .");

            brw.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Errure :" + e.getMessage());
        }

    }

}

```
#### RQ :
- lorquer vous passer un `int` à la méthode `write()` sera intérepter comme un code Ascii. ie `write(65)--> A`.
- la méthode `write(message , indexBegin , indexEnd)` : permet de troncer un message.
- la méthode `newLine()` : faire un retour à la ligne.


## IV . Les Modes d'ouverture `StandardOpenOption`  :

En Java, l'enum  `StandardOpenOption` fait partie du package `java.nio.file` et permet de spécifier les options d'ouverture de fichiers. Cette classe permet de contrôler le comportement d'ouverture du fichier, notamment en spécifiant si le fichier doit être ouvert en lecture, écriture, création, etc.

Voici quelques-unes des options d'ouverture couramment utilisées fournies par `StandardOpenOption` :

1. `READ` : Ouvre le fichier en mode lecture. Si le fichier n'existe pas, une exception est levée.

2. `WRITE` : Ouvre le fichier en mode écriture. Si le fichier n'existe pas, il est créé. Si le fichier existe, son contenu est tronqué.

3. `APPEND` : Ouvre le fichier en mode ajout (écriture à la fin). Si le fichier n'existe pas, il est créé. Si le fichier existe, les données sont ajoutées à la fin.

4. `CREATE` : Crée le fichier s'il n'existe pas déjà. Cette option est généralement utilisée en conjonction avec `WRITE`.

5. `CREATE_NEW` : Crée un nouveau fichier, mais lève une exception si le fichier existe déjà.

6. `TRUNCATE_EXISTING` : Tronque le fichier à zéro octet s'il existe déjà. Utilisé en conjonction avec `WRITE`.

7. `DELETE_ON_CLOSE` : Indique que le fichier doit être supprimé lorsque le canal est fermé.


#### Exemple :

```java

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Paths;

public class ExempleOption {

    public static void main(String[] args) {

        // on ouvrir en fichier en mode ajout : APPEND

        try {

            BufferedWriter brw = Files.newBufferedWriter(Paths.get("file.txt"), StandardOpenOption.APPEND);

            brw.write("ceci un nouveau messaje !!!");

            brw.close();
        } catch (Exception e) {

            System.out.println("Errure :" + e.getMessage());
        }

    }

}



```


## V. la Classe `Files` :

La classe `Files` offre de nombreuses méthodes pour effectuer des opérations de manipulation de fichiers. 

1. **`Files.exists(Path path)`** : Vérifie si un fichier ou un répertoire existe.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) {
        Path chemin = Paths.get("mon_fichier.txt");
        boolean existe = Files.exists(chemin);
        System.out.println("Le fichier existe : " + existe);
    }
}
```

2. **`Files.createFile(Path path)`** : Crée un nouveau fichier.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("nouveau_fichier.txt");
        Files.createFile(chemin);
    }
}
```

3. **`Files.readAllLines(Path path)`** : Lit toutes les lignes d'un fichier texte dans une liste.

```java
import java.nio.file.*;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("mon_fichier.txt");
        List<String> lignes = Files.readAllLines(chemin);
        for (String ligne : lignes) {
            System.out.println(ligne);
        }
    }
}
```

4. **`Files.write(Path path, Iterable<? extends CharSequence> lines)`** : Écrit des lignes dans un fichier.

```java
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("nouveau_fichier.txt");
        List<String> lignes = Arrays.asList("Ligne 1", "Ligne 2", "Ligne 3");
        Files.write(chemin, lignes, StandardCharsets.UTF_8);
    }
}
```

5. **`Files.delete(Path path)`** : Supprime un fichier ou un répertoire.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("fichier_a_supprimer.txt");
        Files.delete(chemin);
    }
}
```

6. **`Files.move(Path source, Path target, CopyOption... options)`** : Déplace ou renomme un fichier.

```java
import java.nio.file.*;
import java.nio.file.StandardCopyOption;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("ancien_nom.txt");
        Path target = Paths.get("nouveau_nom.txt");
        Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
```



7. **`createDirectory(Path dir)`** : Crée un répertoire.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("nouveau_repertoire");
        Files.createDirectory(chemin);
    }
}
```

8. **`isDirectory(Path path, LinkOption... options)`** : Vérifie si le chemin spécifié correspond à un répertoire.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("nouveau_repertoire");
        boolean estRepertoire = Files.isDirectory(chemin);
        System.out.println("Est un répertoire : " + estRepertoire);
    }
}
```

9. **`isRegularFile(Path path, LinkOption... options)`** : Vérifie si le chemin spécifié correspond à un fichier ordinaire (et non à un répertoire ou à un lien symbolique).

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("mon_fichier.txt");
        boolean estFichierOrdinaire = Files.isRegularFile(chemin);
        System.out.println("Est un fichier ordinaire : " + estFichierOrdinaire);
    }
}
```

10. **`size(Path path)`** : Renvoie la taille du fichier en octets.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("mon_fichier.txt");
        long taille = Files.size(chemin);
        System.out.println("Taille du fichier : " + taille + " octets");
    }
}
```


11. **`deleteIfExists(Path path)`** : Supprime un fichier ou un répertoire s'il existe.

```java
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path chemin = Paths.get("fichier_a_supprimer.txt");
        boolean supprime = Files.deleteIfExists(chemin);
        System.out.println("Fichier supprimé : " + supprime);
    }
}
```

## VI. Gestion des Exceptions `IOException `:


**a. Introduction à `IOException` :**
`IOException` est une classe faisant partie de la hiérarchie des exceptions liées aux opérations d'entrées/sorties en Java. Elle appartient au package `java.io` et dérive de la classe `Exception`. Elle est utilisée pour signaler des erreurs lors de la manipulation de flux de données, de fichiers, de sockets et d'autres opérations d'E/S.

**b. Utilisation de `IOException` :**
Lorsque vous effectuez des opérations d'E/S, vous devez être conscient que des erreurs peuvent survenir, comme des fichiers inexistants, des problèmes d'autorisation, des déconnexions réseau, etc. Ces erreurs sont généralement signalées sous la forme d'instances de `IOException`.

Voici comment vous pouvez utiliser la gestion des exceptions `IOException` :

```java
import java.io.*;

public class ExempleIOException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("monFichier.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String ligne;
            while ((ligne = bufferedReader.readLine()) != null) {
                System.out.println(ligne);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Une erreur d'E/S s'est produite : " + e.getMessage());
        }
    }
}
```

**c. Héritage et Exceptions Spécifiques :**
`IOException` est la classe mère de plusieurs exceptions spécifiques qui couvrent des scénarios plus détaillés. Par exemple, `FileNotFoundException` est une sous-classe d'`IOException` et est utilisée spécifiquement pour signaler qu'un fichier n'a pas été trouvé.

En utilisant des exceptions spécifiques, vous pouvez adapter votre gestion des erreurs pour répondre à des situations particulières. Par exemple :

```java
try {
    FileInputStream fileInputStream = new FileInputStream("monFichier.txt");
    // ... lire le fichier ...
} catch (FileNotFoundException e) {
    System.out.println("Le fichier n'a pas été trouvé : " + e.getMessage());
} catch (IOException e) {
    System.out.println("Une erreur d'E/S s'est produite : " + e.getMessage());
}
```

**d. Utilisation de la Clause `throws` :**
Si une méthode que vous définissez peut potentiellement déclencher une `IOException`, vous pouvez le signaler en utilisant la clause `throws` dans la signature de la méthode. Cela indique que l'appelant de la méthode devra gérer cette exception ou la transmettre.

**e. Autres Méthodes Utiles :**
La classe `IOException` fournit également d'autres méthodes utiles pour obtenir des informations sur l'erreur, telles que `getCause()`, `printStackTrace()`, etc.
