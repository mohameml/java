# cour 20 : le Polymorphisme 

### 1.Définition et Principe du ``Polymorphisme``: 

le Polymorphisme en java est un concept pour lequelle nous pouvons effecuter une seulle action de différents maniéres.

Le polymorphisme, du grec "poly" signifiant "plusieurs" et "morphê" signifiant "forme", se réfère à la capacité d'un objet de prendre plusieurs formes. En POO, cela se traduit par la possibilité d'utiliser des objets de classes dérivées comme s'ils étaient des objets de la classe de base, tout en exploitant leurs comportements spécifiques.


Exemple : 

Le mécanisme fondamental qui sous-tend le polymorphisme est l'héritage. Il permet à une classe, appelée sous-classe, d'hériter des propriétés d'une autre classe, appelée superclasse. En exploitant l'héritage, nous pouvons substituer des méthodes de la superclasse dans la sous-classe pour y ajouter ou modifier des comportements spécifiques.

**Exemple :**

```java
class Forme {
    void dessiner() {
        System.out.println("Dessine une forme.");
    }
}

class Cercle extends Forme {
    void dessiner() {
        System.out.println("Dessine un cercle.");
    }
}

class Carre extends Forme {
    void dessiner() {
        System.out.println("Dessine un carré.");
    }
}
```

Daans ce Exemple on la méthode `dessiner()`  qui effectue plusieres taches différents selon le typee de l'objet d'ou le polymorphisme.

### 2. Le Polymorphisme en Action :

Grâce à l'héritage, nous pouvons créer des tableaux, des listes ou des références de la classe de base pour stocker des objets de différentes sous-classes. Lorsque nous appelons des méthodes sur ces objets, les méthodes appropriées de chaque sous-classe sont exécutées, ce qui illustre le polymorphisme.

**Exemple :**

```java
public class Main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[2];
        formes[0] = new Cercle();
        formes[1] = new Carre();

        for (Forme forme : formes) {
            forme.dessiner();  // Appelle la méthode appropriée
        }
    }
}
```

### 3. Interfaces et Polymorphisme :

Les interfaces sont un autre moyen d'atteindre le polymorphisme en définissant un contrat que les classes doivent suivre. Une classe peut implémenter plusieurs interfaces, permettant ainsi à une classe d'adopter différents comportements.


**Exemple  : Polymorphisme avec Interfaces**

Imaginons que nous avons des animaux qui peuvent émettre des sons, et nous voulons utiliser des interfaces pour gérer différents types d'animaux :

```java
interface Animal {
    void emettreSon();
}

class Chien implements Animal {
    public void emettreSon() {
        System.out.println("Le chien aboie.");
    }
}

class Chat implements Animal {
    public void emettreSon() {
        System.out.println("Le chat miaule.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animaux = {new Chien(), new Chat()};
        
        for (Animal animal : animaux) {
            animal.emettreSon();
        }
    }
}
```

### 4.L’annotation ``@Override`` :

- Les annotations sont des types spéciaux en Java qui commence par @. Les annotations servent à ajouter une information sur une classe, un attribut, une méthode, un paramètre ou une variable. 

- Une annotation apporte une information au moment de la compilation, du chargement de la classe dans la JVM ou lors de l’exécution du code. Le langage Java proprement dit utilise relativement peu les annotations. 

- On trouve cependant l’annotation @Override qui est très utile pour le polymorphisme. Cette annotation s’ajoute au début de la signature d’une méthode pour préciser que cette méthode est une redéfinition d’une méthode héritée. Cela permet au compilateur de vérifier que la signature de la méthode correspond bien à une méthode d’une classe parente. Dans le cas contraire, la compilation échoue.

Exemple :

```java


public class Vehicule {

  private final String marque;
  private float vitesse;

  public Vehicule(String marque) {
    this.marque = marque;
  }

  public void accelerer(float deltaVitesse) {
    this.vitesse += deltaVitesse;
  }

  public void decelerer(float deltaVitesse) {
    this.vitesse = Math.max(this.vitesse - deltaVitesse, 0f);
  }

  protected void reculer(float vitesse) {
    this.vitesse = -vitesse;
  }

  // ...

}


public class Voiture extends Vehicule {

  public Voiture(String marque) {
    super(marque);
  }

  @Override
  public void reculer(float vitesse) {
    super.reculer(vitesse);
  }

  // ...

}

```

### 5. Types de polymorphisme : 



- **Polymorphisme Statique  :**

Le polymorphisme statique se produit au moment de la compilation, lorsque le compilateur détermine quelle méthode spécifique sera appelée en fonction des informations disponibles à ce stade. Cela est principalement lié à la surcharge de méthodes. Lorsque vous avez des méthodes avec le même nom mais des signatures différentes (c'est-à-dire des types ou des nombres d'arguments différents), le compilateur décide quelle version de la méthode doit être appelée en se basant sur les types statiques des arguments.

Exemple de polymorphisme statique :

```java
class Calculatrice {
    int addition(int a, int b) {
        return a + b;
    }
    
    double addition(double a, double b) {
        return a + b;
    }
}
```

Dans cet exemple, en fonction des types statiques des arguments (int ou double), le compilateur détermine quelle version de la méthode `addition` doit être appelée.

- **Polymorphisme Dynamique  :**

Le polymorphisme dynamique se produit au moment de l'exécution, lorsque la méthode spécifique à appeler est déterminée en fonction du type réel de l'objet. Cela est principalement associé à l'héritage et à la substitution de méthodes. Lorsqu'une méthode est redéfinie dans une classe dérivée, l'appel à cette méthode à travers un objet de la classe de base déclenche l'exécution de la version redéfinie de la méthode dans la classe dérivée.

Exemple de polymorphisme dynamique :

```java
class Animal {
    void faireDuBruit() {
        System.out.println("L'animal fait un bruit.");
    }
}

class Chien extends Animal {
    void faireDuBruit() {
        System.out.println("Le chien aboie.");
    }
}
```

Dans cet exemple, lorsque vous appelez la méthode `faireDuBruit` sur un objet `Chien`, la version redéfinie de la méthode dans la classe `Chien` est appelée grâce au polymorphisme dynamique.



