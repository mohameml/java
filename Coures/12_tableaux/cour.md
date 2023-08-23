# cour 12 : Les tableaux en JAVA 


## I. Tableaux 1D :

**1.Défintion d'un Tableau:**

Un tableau est une liste nommée d'éléments de données qui ont tous le même type de données. Chaque donnée est un élément du tableau.

**2.Déclaration d'un tableau :**
Vous déclarez un tableau de la même manière que vous déclarez une variable simple, mais vous insérez une paire de crochets après le type de données.
```java 
typeDonnee[] nomTableau;   // la manière préférée.
typeDonnee nomTableau[];  
```

Exemple :

```java

int[] tab ;
Etudient[] listeEtudient ;

```

**3.Création d'un tableau:**

Après avoir créé une variable tableau, vous devez réserver de l'espace mémoire.

Déclarer un tableau et lui réserver de la mémoire sont deux processus distincts. Pour réserver des emplacements mémoire pour 20 valeurs "Etudiant", vous pouvez déclarer la variable de tableau et créer le tableau avec deux instructions distinctes, comme suit:

```java
Etudiant[] listeEtudiants; // déclaration 
listeEtudiants = new Etudiant[20]; // réservation de mémoire pour 20 Valeures 

/*
On peut également fait le deux à meme temps 
*/

Etudiant[] listeEtudiants = new Etudiant[20];

```

#### RQ :

Java permet aux variables, aux expressions arithmétiques et aux valeurs de retour de méthode d'être utilisées comme tailles de tableau, ce qui rend la déclaration de tableau plus flexible.


**4.Initialissation d'un tableau:**


Pour initialiser un tableau, vous utilisez une liste de valeurs d'initialisation séparées par des virgules et placées entre des accolades.

```java
int[] nums = {2, 5, 3, 7, 7, 6, 8, 9, 10, 13};
```

#### RQ1 : 

Une variable de type primitif, telle que int, contient une valeur. Une variable de type référence, telle qu'un tableau, contient une adresse mémoire dans laquelle une valeur est stockée. En d'autres termes, les noms de tableau contiennent des références, comme tous les noms d'objet Java.

Aucune adresse de mémoire n'est attribuée lorsque vous déclarez un tableau en utilisant uniquement un type de données, des crochets et un nom (`int[] tab`). 

Au lieu de cela, le nom de la variable de tableau a la valeur null, ce qui signifie que l'identificateur n'est pas associé à une adresse de mémoire.

Lorsque vous utilisez le mot-clé `new` pour définir un tableau, la référence de tableau acquiert une valeur d'adresse de mémoire.

##### Exemple :

```java 	
int[] nums = new int[10];
```

nums contient une adresse, mais chaque élément de nums a la valeur 0 par défaut, car nums est un tableau d'entiers.

#### RQ2 : 

. Les valeurs par défaut suivantes sont utilisées pour différents types de tableaux:

- 0 est attribué à chaque élément d'un tableau int.
- Chaque élément d'un tableau double ou float est attribué 0.0.
- Chaque élément d'un tableau de caractères est attribué à \u0000, qui correspond à la valeur Unicode d'un caractère null.
- La valeur false est attribuée à chaque élément d'un tableau booléen.
- Chaque élément d'un tableau d'objets, y compris String, est affecté de la valeur null par défaut.



**5.Parcourir les élements d'un tableau:**

**5.1 boucle for :**

le champ `length` contient le nombre d'éléments dans le tableau.

```java 

int[] tab = {1,2,3,4,5,6,7,8,9};

for(int i = 0 ; i<tab.length ; i++)
{
    System.out.println(tab[i]);
}
```

**5.2 boucle foreach:**

la syntaxe principale d'un boucle for-each est :

```java 

for (type element : collection) {
    // Corps de la boucle
}

```

- type : Le type de données des éléments dans la collection.
- element : Une variable qui prend la valeur de chaque élément lors du parcours.
- collection : La collection que vous souhaitez parcourir.

```java 
int[] tab = {1,2,3,4,5,6,7,8,9};

for(int elem : tab)
{
    System.out.println(elem);
}

```

**6. tableau et Méthodes :**

**6.1 Passer des tableaux à des méthodes:**


Tout comme vous pouvez transmettre des valeurs de type primitif à des méthodes, vous pouvez également transmettre des tableaux à des méthodes. 

Exemple :


Par exemple, la méthode suivante affiche les éléments dans un tableau int.

```java 


public class Tableau1D {

    public static void afficherTab1D(int[] tab) 
    {
        for (int elem : tab) 
        {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) 
    {
        int[] tabTest = new int[10];
        System.out.println("----- tabTest --------");
        afficherTab1D(tabTest);

    }

}

```

**6.2 Retourner un tableau à partir d'une méthode:**

Une méthode peut renvoyer une référence à un tableau et vous devez inclure les crochets avec le type de retour dans l'en-tête de la méthode.


Exemple :


Par exemple, la méthode suivante renvoie un tableau qui est l'inverse d'un autre tableau.

```java 
    public static int[] inverserTab1D(int[] tab) {

        int len = tab.length;
        int[] tabInverse = new int[len];

        for (int i = 0; i < len; i++) {
            tabInverse[i] = tab[len - i - 1];
        }

        return tabInverse;

    }
```

## II. Tableaux 2D :

**1.Déclaration d'un tableau à 2D:**

Java prend également en charge les tableaux à deux dimensions. 

Syntaxe :

```java
typeDonnee[][] nomTableau = new typeDonnee[Nb_Lignes][Nb_Colonne];  
```

Exemple : 


```java 
int[][] nums= new int[3][4];
Etudiant[][] etds= Etudiant[3][4];
```

### RQ : 

Comme avec un tableau à une dimension, si vous ne fournissez pas de valeurs pour les éléments d'un tableau numérique à deux dimensions, les valeurs par défaut sont zéro.



**2. Initialisation d'un tableau à 2D :**

Vous pouvez également initialiser un tableau à deux dimensions avec des valeurs lors de sa création. Par exemple, le code suivant affecte des valeurs à nums lors de sa création:

```java
int[][] matrice = { 
    {0,1,2,3}, 
    {4,5,6,7}, 
    {8,9,10,11} 
};
```

**3.Passer un tableau à deux dimensions à une méthode:**

Lorsque vous transmettez un tableau à deux dimensions à une méthode, vous transmettez le nom du tableau comme vous le feriez avec un tableau à une dimension

Exemple : 


```java 


public class Tableau2D {

    public static void afficherTab2D(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int elem : ligne) {
                System.out.print(elem + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int[][] matrice = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        afficherTab2D(matrice);
    }

}


```

**4.Tableau irrégulier:**

Dans un tableau à deux dimensions, chaque ligne est également un tableau. 
En Java, vous pouvez déclarer chaque ligne comme ayant une longueur différente. Lorsqu'un tableau à deux dimensions comporte des lignes de longueurs différentes, il s'agit d'un tableau irrégulier, car vous pouvez imaginer que les extrémités de chaque ligne sont inégales.

Syntaxe :


Vous créez un tableau irrégulier en définissant le nombre de lignes pour un tableau à deux dimensions, mais pas le nombre de colonnes dans les lignes.

```java
int[][] nums = new int[3][];
```

Cette instruction déclare un tableau avec trois lignes, mais les lignes ne sont pas encore créées. Ensuite, vous pouvez déclarer les lignes individuelles en fonction du nombre d'éléments que vous souhaitez placer dans chaque ligne.

```java 
nums[0] = new int[3];
nums[1] = new int[5];
nums[2] = new int[7];

```

## III. la classe java.Arrays :

En Java, la classe `Arrays` est une classe utilitaire intégrée qui fournit diverses méthodes pour travailler avec des tableaux (arrays). 
Cette classe contient des méthodes statiques permettant de trier, rechercher, remplir, comparer et manipuler des tableaux de différentes manières. 




1. **`sort(T[] array)`** : Trie le tableau dans l'ordre croissant des éléments.

```java
import java.util.Arrays;

public class ExampleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Affiche le tableau trié
    }
}
```

2. **`binarySearch(T[] array, T key)`** : Recherche binaire d'un élément spécifique dans le tableau trié.

```java
import java.util.Arrays;

public class ExampleBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("L'élément 5 est à l'index : " + index);
    }
}
```

3. **`fill(T[] array, T value)`** : Remplit le tableau avec la valeur spécifiée.

```java
import java.util.Arrays;

public class ExampleFill {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 42);
        System.out.println(Arrays.toString(numbers)); // Affiche [42, 42, 42, 42, 42]
    }
}
```

4. **`equals(T[] a, T[] b)`** : Vérifie si deux tableaux sont égaux en termes d'éléments et d'ordre.

```java
import java.util.Arrays;

public class ExampleEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Les tableaux sont égaux : " + areEqual);
    }
}
```

5. **`toString(T[] array)`** : Convertit le tableau en une chaîne de caractères lisible.

```java
import java.util.Arrays;

public class ExampleToString {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String arrayAsString = Arrays.toString(numbers);
        System.out.println(arrayAsString); // Affiche [1, 2, 3, 4, 5]
    }
}
```

6. **`copyOf(T[] original, int newLength)`** : Copie une partie spécifiée du tableau original dans un nouveau tableau.

```java
import java.util.Arrays;

public class ExampleCopyOf {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(originalArray, 3);
        System.out.println(Arrays.toString(newArray)); // Affiche [1, 2, 3]
    }
}
```

