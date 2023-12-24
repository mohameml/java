# cour 15 : Lecture au clavier 

## I. La classe ``Scanner`` : 

**a. Utilisation de la classe Scanner:**

La classe `Scanner` fait partie du paquet `java.util` et fournit des méthodes pour lire différentes types de données à partir du clavier. Voici comment l'utiliser pour lire différents types de données :

1. Importez la classe `Scanner` :

```java
import java.util.Scanner;
```

2. Créez une instance de `Scanner` pour lire à partir de l'entrée standard (clavier) :

```java
Scanner scanner = new Scanner(System.in);
```

3. Utilisez les méthodes de `Scanner` pour lire les données :

- Pour les chaînes (String) :
```java
System.out.print("Entrez votre nom : ");
String nom = scanner.nextLine();
```

- Pour les entiers (int) :
```java
System.out.print("Entrez un nombre entier : ");
int nombreEntier = scanner.nextInt();
```

- Pour les nombres à virgule flottante (double) :
```java
System.out.print("Entrez un nombre à virgule : ");
double nombreVirgule = scanner.nextDouble();
```

4. Fermeture du Scanner

fermer l'objet `Scanner` après utilisation pour libérer les ressources :

```java
scanner.close();
```

**b.Exemple Complet:**

Voici un exemple complet montrant comment utiliser la classe `Scanner` pour lire différentes données à partir du clavier :

```java
import java.util.Scanner;

public class LectureClavierExemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre taille : ");
        double taille = scanner.nextDouble();

        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Taille : " + taille);

        scanner.close();
    }
}
```

#### RQ :
Dans ce programme il y' a un problème  : 

```java 
import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // on récupere un int 
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // puis on récupere un String :
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();




        scanner.close();
    }
}


```

le problème que vous rencontrez est dû au fait que la méthode `nextInt()` de `Scanner` ne consomme pas le caractère de nouvelle ligne (`\n`) après avoir lu le nombre, ce qui fait que le caractère de nouvelle ligne reste dans le flux d'entrée. Lorsque vous essayez ensuite de lire une ligne avec `nextLine()`, elle lit le caractère de nouvelle ligne laissé par `nextInt()`.

Pour résoudre ce problème, vous pouvez ajouter un `nextLine()` vide après `nextInt()` pour consommer le caractère de nouvelle ligne. Voici comment vous pouvez le faire :

```java
// ...

System.out.print("Quelle est votre age : ");
int nombre = sc.nextInt();
sc.nextLine(); // Consommer le caractère de nouvelle ligne restant

System.out.print("Quelle est votre nom : ");
String nom = sc.nextLine();



// ...
```

En ajoutant `sc.nextLine();` après `nextInt()`, vous consommez le caractère de nouvelle ligne, ce qui permettra à la méthode `nextLine()` suivante de fonctionner correctement pour la saisie du nom.

Votre programme modifié serait :

```java
import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quelle est votre nom : ");
        String name = sc.nextLine();
        System.out.println("Nom : " + name);

        System.out.print("Quelle est votre age : ");
        int age = sc.nextInt();
        sc.nextLine(); // Consommer le caractère de nouvelle ligne

        System.out.print("Quelle est votre nom : ");
        String nom = sc.nextLine();

        System.out.printf("Votre nom est %s et votre age est %d\n", nom, age);

        sc.close();
    }
}
```



## II. La classe ``BufferedReader`` : 




### 1.Lecture au Clavier avec la Classe BufferedReader :

La classe `BufferedReader` en Java est utilisée pour lire les données d'entrée d'une manière plus efficace et flexible que la classe `Scanner`. Elle offre des avantages tels que la gestion plus fine des caractères spéciaux et de meilleures performances pour la lecture de grandes quantités de données. Voici comment l'utiliser pour lire des données à partir du clavier :

**a.Importation de la Classe BufferedReader:**

Pour utiliser la classe `BufferedReader`, importez-la depuis le paquet `java.io` :

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

```

**b.Création d'une Instance de BufferedReader:**

Créez une instance de `BufferedReader` en utilisant `InputStreamReader` pour lire à partir de l'entrée standard (`System.in`) :

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

Cette ligne de code crée un objet `BufferedReader` pour lire des données à partir de l'entrée standard (clavier) en utilisant un objet `InputStreamReader`.

- `InputStreamReader(System.in)` : `InputStreamReader` est utilisé pour lire des octets à partir d'un flux d'entrée, comme `System.in` qui représente l'entrée standard (le clavier). Lorsque vous créez un `InputStreamReader` avec `System.in`, il convertit les octets lus en caractères en utilisant l'encodage par défaut du système.

- `BufferedReader(InputStreamReader)` : `BufferedReader` est utilisé pour lire des lignes de texte à partir d'un flux d'entrée caractère. Il prend un objet `Reader` en argument, et `InputStreamReader` est un type de `Reader`. L'utilisation de `BufferedReader` permet de mettre en mémoire tampon les données lues, ce qui peut améliorer les performances de lecture.

- `BufferedReader br = ...` : Ici, nous créons une variable `br` qui est de type `BufferedReader` pour contenir l'objet que nous venons de créer. Cela nous permettra d'utiliser `br` pour lire les données à partir de l'entrée standard de manière plus pratique.



**c.Lecture de Chaînes de Caractères:**

Pour lire une ligne de texte à partir du clavier, utilisez la méthode `readLine()` de `BufferedReader`. Cette méthode renvoie une chaîne de caractères lue à partir de l'entrée :

```java

System.out.print("Entrez votre nom : ");
String nom = br.readLine();
System.out.println("Nom : " + nom);

```

**d.Lecture de Nombres:**

Lors de la lecture de nombres, vous devrez convertir la chaîne en nombre à l'aide des méthodes de conversion appropriées, comme `Integer.parseInt()` pour les entiers et `Double.parseDouble()` pour les nombres à virgule flottante. 

```java

System.out.print("Entrez votre âge : ");
int age = Integer.parseInt(br.readLine());
System.out.println("Âge : " + age);

```

**e.Fermeture de BufferedReader:**

N'oubliez pas de fermer l'objet `BufferedReader` après utilisation pour libérer les ressources :

```java

br.close();

```



### RQ : **Analyse d'une String avec Scanner :**

- on a La ligne de code suivent :  

```java
Scanner sc = new Scanner(exprString); // exprString : String 
```

- signifie que vous créez un nouvel objet de type `Scanner` en utilisant la chaîne de caractères `exprString` comme source d'entrée pour le scanner. 

- En d'autres termes, vous pouvez analyser ou lire le contenu de la chaîne à l'aide de cet objet `Scanner`.

- La classe `Scanner` en Java est utilisée pour analyser les entrées de différents types. Lorsque vous créez une instance de `Scanner` avec `exprString` comme argument, vous pouvez utiliser cet objet `sc` pour analyser la chaîne caractère par caractère, mot par mot, ou en fonction de délimiteurs spécifiques.

- un exemple pour lire des mots individuels à partir de `exprString` à l'aide de l'objet `sc` :

```java
String exprString = "Ceci est un exemple.";
Scanner sc = new Scanner(exprString);

while (sc.hasNext()) {
    String mot = sc.next(); // Lire un mot à la fois
    System.out.println(mot);
}

sc.close(); // N'oubliez pas de fermer le Scanner à la fin de son utilisation
```

Dans cet exemple, la chaîne `exprString` est divisée en mots individuels à l'aide de la méthode `next()` du `Scanner`. Chaque mot est imprimé dans la console.

La création d'un `Scanner` à partir d'une chaîne de caractères permet d'utiliser toutes les méthodes de lecture fournies par la classe `Scanner` pour traiter le contenu de cette chaîne comme une source d'entrée.
