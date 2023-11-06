# cour 22 : les énumerations 


### 1.**Définition d'une Énumération :**

Une énumération en Java est une liste de valeurs constantes nommées. Elle est définie à l'aide du mot-clé `enum` et peut contenir un ensemble de constantes pré-définies qui représentent des choix spécifiques ou des états possibles.


### 2.**Syntaxe de Déclaration d'une Énumération :**

**Syntaxe** :

```java
enum NomDeLEnumeration {
    VALEUR1,
    VALEUR2,
    // ...
}
```

**Exemple** :

```java
public enum Color {
    RED,
    Green,
    Black,
    Yellow,
    Blue;

}
```



### 3. **Exemple d'Utilisation :**
```java
enum JourSemaine {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
}

public class EnumExample {
    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.MERCREDI;
        System.out.println("Jour de la semaine : " + jour);
    }
}
```

### 4. **Méthodes et Propriétés des Énumérations :**


**4.1. Méthode `values()` :**
La méthode `values()` renvoie un tableau contenant toutes les constantes de l'énumération dans l'ordre de leur déclaration.

```java
enum JourSemaine {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
}

public class EnumValuesExample {
    public static void main(String[] args) {
        JourSemaine[] jours = JourSemaine.values();
        for (JourSemaine jour : jours) {
            System.out.println(jour);
        }
    }
}
```

**2. Méthode `ordinal()` :**
La méthode `ordinal()` renvoie l'indice (position) de la constante dans l'ordre de sa déclaration.

```java
enum Saison {
    PRINTEMPS, ETE, AUTOMNE, HIVER;
}

public class EnumOrdinalExample {
    public static void main(String[] args) {
        Saison saison = Saison.ETE;
        System.out.println("Indice de ETE : " + saison.ordinal()); // Affiche 1
    }
}
```

**3. Méthode `compareTo()` :**
La méthode `compareTo()` compare l'ordre de deux constantes d'énumération.

```java
enum Taille {
    PETIT, MOYEN, GRAND;
}

public class EnumCompareToExample {
    public static void main(String[] args) {
        Taille taille1 = Taille.PETIT;
        Taille taille2 = Taille.GRAND;

        int comparaison = taille1.compareTo(taille2);
        if (comparaison < 0) {
            System.out.println("Petit vient avant Grand");
        } else if (comparaison > 0) {
            System.out.println("Grand vient avant Petit");
        } else {
            System.out.println("Les tailles sont égales");
        }
    }
}
```

**4. Méthode `name()` :**
La méthode `name()` renvoie le nom de la constante.

```java
enum Couleur {
    ROUGE, VERT, BLEU;
}

public class EnumNameExample {
    public static void main(String[] args) {
        Couleur couleur = Couleur.VERT;
        System.out.println("Nom de la constante : " + couleur.name()); // Affiche "VERT"
    }
}
```
**5.la méthode `valueOf()` :**

La méthode `valueOf()` est une méthode statique fournie par toutes les énumérations en Java. Cette méthode permet de convertir une chaîne de caractères en une constante d'énumération correspondante.


```java
enum JourSemaine {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
}

public class EnumValueOfExample {
    public static void main(String[] args) {
        String jourString = "MERCREDI";
        JourSemaine jour = JourSemaine.valueOf(jourString);
        System.out.println("Jour : " + jour); // Affiche "MERCREDI"
    }
}
```
Si la chaîne fournie ne correspond pas à une constante d'énumération existante, la méthode `valueOf()` lèvera une exception `IllegalArgumentException`.

```java
String jourString = "VENDREDII"; // Cette chaîne ne correspond à aucune constante d'énumération
JourSemaine jour = JourSemaine.valueOf(jourString); // Lèvera une exception IllegalArgumentException
```





### 5. Personnalisation :
 
Vous pouvez ajouter des champs, des constructeurs et des méthodes aux énumérations pour les personnaliser.

Exemple :

```java 


public enum MyColor {
    RED("Rouge", "FF0000"),
    Green("Vert", "00FF00"),
    Black("Noir", "000000"),
    Yellow("Jaune", "01F210"),
    Blue("blue", "0000FF");

    private String name;

    public String getName() {
        return this.name;
    }

    private String codeHexa;

    public String getCodeHexa() {
        return this.codeHexa;
    }

    private MyColor(String name, String codeHexa) {
        this.name = name;
        this.codeHexa = codeHexa;
    }

    @Override
    public String toString() {
        return this.name;
    }
}




```



#### RQ :

- **Comparaison entre  deux instances d'une enum** :
La comparaison entre deux instances d'une énumération (`enum`) en Java peut être effectuée en utilisant l'opérateur d'égalité (`==`) ou la méthode `equals()`. Cependant, il est important de noter que dans une énumération, chaque constante est une instance unique de la classe d'énumération. Par conséquent, la comparaison avec l'opérateur d'égalité (`==`) ou la méthode `equals()` fonctionnera de la même manière que la comparaison entre objets normaux.



```java
enum Couleur {
    ROUGE, VERT, BLEU;
}

public class EnumComparisonExample {
    public static void main(String[] args) {
        Couleur couleur1 = Couleur.ROUGE;
        Couleur couleur2 = Couleur.ROUGE;
        Couleur couleur3 = Couleur.BLEU;

        // Comparaison avec l'opérateur d'égalité (==)
        System.out.println(couleur1 == couleur2); // Affiche true
        System.out.println(couleur1 == couleur3); // Affiche false

        // Comparaison avec la méthode equals()
        System.out.println(couleur1.equals(couleur2)); // Affiche true
        System.out.println(couleur1.equals(couleur3)); // Affiche false
    }
}
```


- **Utiliation de `switch` pour une `enum`** :

L'utilisation d'une instruction `switch` avec une énumération en Java permet de simplifier et de rendre plus lisible le traitement des différentes valeurs constantes de l'énumération. 


Exemple :

```java
enum JourSemaine {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
}
```


```java
public class EnumSwitchExample {
    public static void main(String[] args) {
        JourSemaine jour = JourSemaine.MERCREDI;

        switch (jour) {
            case LUNDI:
                System.out.println("C'est un jour de travail.");
                break;
            case MARDI:
                System.out.println("C'est un jour de travail.");
                break;
            case MERCREDI:
                System.out.println("C'est un jour de travail.");
                break;
            case JEUDI:
                System.out.println("C'est un jour de travail.");
                break;
            case VENDREDI:
                System.out.println("C'est un jour de travail.");
                break;
            case SAMEDI:
                System.out.println("C'est le week-end.");
                break;
            case DIMANCHE:
                System.out.println("C'est le week-end.");
                break;
            default:
                System.out.println("Jour non reconnu.");
                break;
        }
    }
}
```


 
 
