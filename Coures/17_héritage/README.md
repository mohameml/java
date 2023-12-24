# cour 17 : Héritage en POO 


### 1.Défintion :

L'héritage est l'un des concepts fondamentaux de la programmation orientée objet (POO) qui permet de créer de nouvelles classes basées sur des classes existantes. Une classe enfant (ou sous-classe) hérite des propriétés (attributs et méthodes) d'une classe parente (ou superclasse), ce qui permet de réutiliser et d'étendre le code existant de manière efficace.

### 2. Définition d'une Classe Enfant :

- En Java, pour définir une classe enfant qui hérite d'une classe parente, on utilise le mot-clé `extends`. La classe enfant peut alors accéder aux attributs et méthodes non privés de la classe parente.

- Le modificateur `protected` permet un niveau d'accès intermédiaire entre les modificateurs `public` et `private` et  qui permet aussi  l'**Accès dans les classes filles (héritage)**


Exemple :

```java
class Vehicule {
    protected String marque;
    public void demarrer() {
        System.out.println("Véhicule démarré.");
    }
}

class Voiture extends Vehicule {
    private int nombrePortes;
    public void afficherMarque() {
        System.out.println("Marque : " + marque);
    }
}
```

Dans cet exemple, la classe `Voiture` hérite de la classe `Vehicule`. Cela signifie que la classe `Voiture` peut accéder aux attributs `marque` et aux méthodes `demarrer()` définis dans la classe `Vehicule`.



### 3. Constructeurs dans l'Héritage :

Les constructeurs sont également hérités, mais si la classe parente n'a pas de constructeur sans paramètre (constructeur par défaut), la classe enfant doit appeler explicitement un constructeur de la classe parente à l'aide du mot-clé `super`.

```java
class Animal {
    protected String nom;
    public Animal(String nom) {
        this.nom = nom;
    }
}

class Chien extends Animal {
    public Chien(String nom) {
        super(nom); // Appel explicite du constructeur de la classe parente
    }
}
```

### RQ :

- L'appel de ``super(...)`` doit toujours être la première instruction dans le corps du constructeur :
    
    - Si ce n'est pas le cas, alors le compilateur insère implicitement en 1ère ligne l'appel ``super()`` au constructeur par défaut (sans paramètres) de la mère. Si celui-ci n'existe pas, il y a une erreur.

- Il est toujours recommandé d'initialiser les attributs hérités via super(...) et jamais directement.



### 4. Rédefinition de Méthodes :

- Les classes enfants peuvent  redéfinir les méthodes de la classe parente pour adapter leur comportement. Lorsque vous appelez une méthode sur un objet de la classe enfant, la version redéfinie dans la classe enfant sera exécutée.

```java
class Shape {
    public void dessiner() {
        System.out.println("Dessine une forme.");
    }
}

class Circle extends Shape {
    
    @Override
    public void dessiner() {
        super.dessiner();

        System.out.println("Dessine un cercle.");
    }
}
```

- **la visibilité lors d'une redéfinition :**

    - La visibilité d'une méthode redéfinie doit être égale ou moins restrictive que celle de la méthode héritée :

        - La redéfinition d'une méthode ``public`` ne peut être que ``public`` ;
        - Celle d'une méthode ``protected`` peut être ``protected`` ou ``public`` ;
        - Celle d'une méthode sans visibilité (``paquetage``) peut être ``paquetage``, ``protected`` ou ``public`` ;
        - Enfin une méthode ``private`` ne peut pas être redéfinie puisqu'elle n'est pas accessibles aux filles ! (implicitement, elle est ``final``).
    
    - Par exemple : le problème en essayant de redéfinir ``String toString()`` (sans visibilité). Elle doit être ``public`` !

### RQ1 : Redéfinition vs surcharge

- **Attention** Ne pas confondre redéfinition (``override``; réécriture d'une méthode héritée) et surcharge (``overload``; ajout d'une nouvelle méthode de même nom) !

    - **Surcharger une méthode** (dans une classe, ou dans une sous classe) signifie écrire une nouvelle méthode qui a le même nom qu'une méthode déjà existante, mais dont le nombre et/ou le type des paramètres diffère. Surcharger ajoute une nouvelle méthode à la classe.

    - **Redéfinir une méthode** dans une sous-classe signifie écrire une méthode qui a exactement la même signature qu'une méthode héritée. La méthode redéfinie remplace, dans la clase fille, la méthode héritée.


### RQ 2: **Annotations**

- L'annotation ``@Override`` précédant : permet de notifier au compilateur qu'il s'agit bien de la redéfinition d'une méthode héritée ,Ceci évite de faire une surcharge par inadvertance (le programme ne compile plus), ce qui est une erreur assez commune mais potentiellement longue à détecter. Il est conseillé de toujours utiliser les annotations.

### RQ3 :  **Remarque sur le type de retour pour la surcharge**

- Il n'est pas possible de surcharger une méthode en ne changeant que son type de retour. 
- Les paramètres doivent être différents, en nombre et/ou en type :
    - Par exemple ``public void crier(boolean)`` ou ``public String crier(float, float)`` sont valides, mais pas ``public String crier()``. 


### 5. Exemple Complet  :

**fichier : Horse.java**
```java 
public class Horse {

    // les attributs :
    protected String name;
    protected int posX;
    protected int posY;

    public Horse(String name) {
        this.name = name;
        this.posX = 50;
        this.posY = 50;
    }

    public void move(int x, int y) {

        this.posX = x;
        this.posY = y;

    }

}

```

**fichier :Pegasus.java**

```java
public class Pegasus extends Horse {

    // Les attributs :

    private int posZ;

    // un constructeur :

    public Pegasus(String name) {
        super(name);
        this.posZ = 100;
    }

    // Les méthodes :

    public void move(int x, int y) {
        super.move(x, y);
        System.out.println("Le Pegase se deplace (X=" + this.posX + " ,Y=" + this.posY + ")");

    }

    public void fly(int z) {
        this.posZ = z;
        System.out.println("Le Pegase s'éleve dans l'air (Z=" + this.posZ + ")");

    }

}


```

### 6. le mot cles `instanceof` :

l'opérateur `instanceof` est utilisé pour déterminer si un objet est une instance d'une classe spécifique ou de l'une de ses sous-classes. Cela permet de vérifier le type d'objet au moment de l'exécution. L'opérateur `instanceof` retourne `true` si l'objet est une instance de la classe spécifiée, sinon il retourne `false`.

Voici comment utiliser l'opérateur `instanceof` :

```java
if (objet instanceof Classe) {
    // Code à exécuter si l'objet est une instance de la classe
}
```

Voici un exemple concret :

```java
class Animal {
}

class Chien extends Animal {
}

class Chat extends Animal {
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal monAnimal = new Chien();

        if (monAnimal instanceof Chien) {
            System.out.println("C'est un chien !");
        } else if (monAnimal instanceof Chat) {
            System.out.println("C'est un chat !");
        } else if (monAnimal instanceof Animal) {
            System.out.println("C'est un animal !");
        }
    }
}
```

### 7.Utilisation de `final` :

- En Java, le mot-clé `final` peut être utilisé avec des classes, des méthodes et des variables pour indiquer que leur contenu ne peut pas être modifié ou qu'ils ne peuvent pas être hérités, en fonction du contexte. 

- Voici comment `final` peut être utilisé avec des classes et des méthodes :

**a. Utilisation de `final` avec une Classe :**

Lorsqu'une classe est déclarée comme `final`, cela signifie qu'elle ne peut pas être sous-classée. Cela empêche d'autres classes d'étendre cette classe pour créer de nouvelles sous-classes.

```java
final class ClasseFinale {
    // ...
}
```

Dans cet exemple, la classe `ClasseFinale` est déclarée comme `final`, ce qui signifie qu'aucune autre classe ne peut hériter de cette classe.

**b.Utilisation de `final` avec une Méthode :**

Lorsqu'une méthode est déclarée comme `final` dans une classe, cela signifie qu'elle ne peut pas être redéfinie (surchargée) dans les sous-classes. Les méthodes finales conservent leur implémentation d'origine et ne peuvent pas être modifiées.

```java
class ClasseParente {
    final void methodeFinale() {
        // ...
    }
}
```

Dans cet exemple, la méthode `methodeFinale()` de la classe `ClasseParente` est déclarée comme `final`, ce qui signifie qu'aucune sous-classe ne peut la redéfinir.

### 8. Personnaliser les Exceptions

Vous pouvez également créer vos propres classes d'exception personnalisées en étendant la classe `Exception` ou l'une de ses sous-classes.

```java
class MonException extends Exception {
    // Constructeurs et méthodes spécifiques

    public MonException(String message)
    {
        super(message);
    }
}
```


#### Exemple : 
**fichier : HorseException.java** 
```java 
public class HorseException extends Exception {

    public HorseException(String message) {
        super(message);
    }

}

```

**fichier : Horse.java**
```java
public class Horse {

    // les attributs :
    protected String name;
    protected int posX;
    protected int posY;

    public Horse(String name) {
        this.name = name;
        this.posX = 50;
        this.posY = 50;
    }

    public void move(int x, int y) throws HorseException {

        if (x < 0) {
            throw new HorseException("x ne peut pas etre négative .");
        }
        this.posX = x;
        this.posY = y;

    }

}


```

`throws HorseException ` signifue que la méthode `move` peut réleve de Exception de type HorseException.


#### RQ : 

Dans une sous-classe, vous pouvez accéder aux attributs hérités de la classe parente en utilisant le mot-clé `super`. Cependant, l'utilisation de `this` dans une sous-classe fera référence aux attributs de la sous-classe elle-même, pas à ceux de la classe parente.



### RQ : **La super-classe Object**

- **une hiérarchie de classes**  est en fait un arbre dont la racine est une première classe « qui n'a pas de mère ». 

- En réalité, une classe qui ne définit pas de clause extends hérite implicitement d'une classe nommée ``Object`` :

```java
class Tatou extends Object {  // IMPLICITE quand on écrit juste : class Tatou
    // ça change des Pangolins non?
    [...]
}


```

- En conséquence TOUTE classe hérite, directement ou indirectement, de Object. De ce fait, les méthodes définies dans la classe Object peuvent être invoquées sur tous les objets d'un programme.

- Quelques-unes des principales méthodes de la classe Object sont :

    - **public String toString() :** retourne la représentation d'un objet sous forme de chaîne de caractères ;

    - **public boolean equals(Object obj) :** permet de comparer deux objets sémantiquement (selon leur état, leurs attributs, et pas uniquement égalité des références) ;

    - **public int hashCode() :** retourne un identifiant entier unique associé à un objet. Ceci est surtout utilisé pour l'insertion dans des structures de données de type table de hachage.

    - **protected void finalize() :** méthode exécutée par le ramasse-miettes au moment de la destruction d'un objet qui n'est plus référencé. 




