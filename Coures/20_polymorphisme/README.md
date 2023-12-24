# cour 20 : le Polymorphisme 

### 1.Définition et Principe du ``Polymorphisme``: 


- Le polymorphisme est l'un des principes fondamentaux de la programmation orientée objet (POO) : 

    - qui permet à des objets de différentes classes de répondre de manière spécifique à des méthodes partagées, de manière à ce que le même nom de méthode puisse être utilisé pour invoquer des comportements différents en fonction du type de l'objet :  **Polymorphisme de méthodes**.

    -  ou que un objet peut  prendre plusieurs formes , cela se traduit par la possibilité d'utiliser des objets de classes dérivées comme s'ils étaient des objets de la classe de base, tout en exploitant leurs comportements spécifiques : **Polymorphisme d'objets**.

- **Polymorphisme de méthodes :**   le polymorphisme de méthodes, lié à la surcharge et la redéfinition des méthodes de la classe mére .

- **Polymorphisme d'objets** : Il permet d'utiliser un objet d'une classe dérivée comme s'il s'agissait d'un objet de sa classe de base ie : on peut toujours manipuler une instance d'une classe fille au moyen d'une référence du type de n'importe quelle super classe.


- **Le principe de substitution:** est un concept fondamental de la programmation orientée objet (POO) qui découle du *polymorphisme des objets*.

    - le principe de substitution stipule que vous pouvez utiliser une instance d'une classe dérivée (une sous-classe) partout où une référence du type de sa classe parent (une superclasse) est attendue, sans introduire d'erreurs. Cela signifie que vous pouvez traiter une sous-classe comme si elle était une instance de sa superclasse sans provoquer de problèmes.

    
    - Voici un exemple pour clarifier le principe de substitution :

    Supposons que vous ayez une classe de base `Véhicule` et une classe dérivée `Voiture` :

    ```java
    class Véhicule {
        void seDéplacer() {
            System.out.println("Le véhicule se déplace.");
        }
    }

    class Voiture extends Véhicule {
        @Override
        void seDéplacer() {
            System.out.println("La voiture se déplace sur les roues.");
        }

        void klaxonner() {
            System.out.println("La voiture klaxonne.");
        }
    }
    ```

    Vous pouvez ensuite utiliser le principe de substitution de la manière suivante :

    ```java
    Véhicule monVéhicule = new Voiture(); // Une instance de Voiture est assignée à une référence de Véhicule.
    monVéhicule.seDéplacer(); // Appelle la méthode seDéplacer de Voiture.

    // Vous ne pouvez pas appeler monVéhicule.klaxonner() ici, car la référence est de type Véhicule.
    ```

    Dans cet exemple, le principe de substitution permet d'assigner une instance de `Voiture` à une référence de `Véhicule`. Lorsque vous appelez `seDéplacer()` sur `monVéhicule`, la méthode de la classe dérivée `Voiture` est exécutée, démontrant ainsi que vous pouvez utiliser une sous-classe partout où une référence de sa superclasse est attendue.





- **Exemple :**

```java
class Forme {
    void dessiner() {
        System.out.println("Dessine une forme.");
    }
}

class Cercle extends Forme {

    @Override // Polymorphisme de méthodes 
    void dessiner() {
        System.out.println("Dessine un cercle.");
    }
}

class Carre extends Forme {
    @Override
    void dessiner() {
        System.out.println("Dessine un carré.");
    }
}

class main
{
    public class void main(String[] args)
    {
        Formem f;
        f = new Cercle(); // Polymorphisme d'objets
    }
}
```

Daans ce Exemple on la méthode `dessiner()`  qui effectue plusieres taches différents selon le typee de l'objet d'ou le polymorphisme.


### 2. **type statique** et **type dynamique** :



1. **Type Statique :**

   - Le type statique fait référence au type déclaré d'une référence d'objet à un endroit donné du code. 
   
   - C'est le type de la variable ou de la référence utilisée pour manipuler l'objet. Le type statique est connu à la compilation, c'est-à-dire au moment où le code source est transformé en code binaire exécutable.

   - Le type statique est généralement défini par le type de la classe ou de l'interface à laquelle la référence est associée.
   
   - Le type statique d'une référence est immuable tout au long de sa durée de vie dans la portée du code où elle est définie.

   - Exemple en Java :
   ```java
   Animal monAnimal = new Chien(); // Le type statique est Animal.
   ```

2. **Type Dynamique :**

   - Le type dynamique fait référence au véritable type de l'objet en mémoire. C'est le type réel de l'objet créé au moment de son instanciation avec `new`.
   - Le type dynamique dépend de la classe réelle de l'objet, que la référence utilisée pour le manipuler soit du type de la superclasse ou de la sous-classe.
   - Le type dynamique est déterminé au moment de l'exécution (runtime) lorsque l'objet est créé.

   Exemple en Java :
   ```java
   Animal monAnimal = new Chien(); // Le type dynamique est Chien (la classe réelle de l'objet).
   ```


3. **interroger le type dynamique d'un objet durant l'exécution d'un programme :**


- **la méthode `getClass()` :**

    - Pour interroger le type dynamique d'un objet durant l'exécution d'un programme en Java, vous pouvez utiliser la méthode `getClass()` pour obtenir l'objet `Class` associé à cet objet, puis utiliser diverses méthodes et opérations pour examiner ou comparer ce type dynamique.


    - La signature de la méthode `getClass()` est la suivante :

    ```java
    public final Class<?> getClass()
    ```

    -   Exemple d'utilisation de `getClass()` :

        ```java
        public class Exemple {
            public static void main(String[] args) {
                String maChaine = "Hello, World!";
                Class<?> classe = maChaine.getClass();
                
                System.out.println("Le type de l'objet est : " + classe.getName());
            }
        }
        ```

        Dans cet exemple, nous avons une chaîne de caractères (`String`) appelée `maChaine`. Nous utilisons la méthode `getClass()` sur cette instance pour obtenir l'objet `Class` associé à cette chaîne. Ensuite, nous utilisons la méthode `getName()` de la classe `Class` pour obtenir le nom de la classe réelle de l'objet, qui est "java.lang.String" dans ce cas.





- **Comparer les types dynamiques** :

   - Vous pouvez comparer les types dynamiques pour voir s'ils sont les mêmes ou s'ils sont équivalents. Cela peut être utile dans des scénarios où vous traitez des objets de différentes classes.

   - Exemple :
    ```java
    Object objet1 = new String("Hello");
    Object objet2 = new Integer(42);
    Class<?> classe1 = objet1.getClass();
    Class<?> classe2 = objet2.getClass();
    boolean memesTypes = classe1.equals(classe2);
    System.out.println("Les types dynamiques des objets sont-ils les mêmes ? " + memesTypes);
    ```








### 3. Le Polymorphisme en Action :

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

### 4. Interfaces et Polymorphisme :

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

### 5.L’annotation ``@Override`` :

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

### 6. Types de polymorphisme : 



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


### 7.  *cast* en Java :

- La conversion de type statique, souvent appelée "cast" en Java, est le processus de conversion d'une référence d'objet d'un type à un autre. Cela permet de traiter un objet comme s'il était d'une classe différente de celle qu'il avait à l'origine. 

- En Java, il existe deux types de conversion de type statique : le "transtypage" (casting) explicite et le "transtypage" implicite. Voyons les deux en détail :

    1. **Transtypage explicite (Casting explicite) :**
    - Le transtypage explicite est réalisé en utilisant l'opérateur `(type)` pour spécifier le type vers lequel vous souhaitez effectuer la conversion.
    - Il est utilisé lorsque vous êtes sûr que l'objet est réellement de ce type, ou lorsque vous devez effectuer des opérations spécifiques à ce type.

    Exemple :
    ```java
    Object monObjet = new String("Hello");
    String maChaine = (String) monObjet; // Transtypage explicite vers String.
    ```

    Vous devez être prudent lors de l'utilisation du transtypage explicite, car s'il est utilisé incorrectement, il peut provoquer des exceptions de type **ClassCastException** si l'objet n'est pas vraiment du type spécifié.

    2. **Transtypage implicite (Casting implicite) :**
    - Le transtypage implicite est réalisé sans nécessiter de syntaxe explicite. Il est effectué automatiquement lorsque vous affectez un objet d'une sous-classe à une référence de sa superclasse.
    - Cela se produit lorsque le type statique est un sous-type du type dynamique de l'objet.

    Exemple :
    ```java
    String maChaine = "Hello";
    Object monObjet = maChaine; // Transtypage implicite de String à Object.
    ```

    Ici, l'objet de type `String` est affecté à une référence de type `Object`, ce qui est une conversion implicite.


    ### RQ : 
    Il est important de noter que le transtypage implicite ne peut se produire que dans le sens de la hiérarchie de classes, c'est-à-dire d'une sous-classe vers une superclasse. Les transtypages explicites sont utilisés lorsque vous devez forcer une conversion vers un type plus spécifique, et ils sont soumis à des règles strictes pour éviter les erreurs.



- Dans le contexte des hiérarchies de classes où l'héritage est impliqué. Les castings sont couramment appelés **upcasting** et **downcasting** lorsqu'ils sont utilisés pour convertir des objets entre des superclasses et des sous-classes.

    1. **Upcasting (Casting vers le haut) :**

    - L'upcasting est la conversion d'une référence d'objet d'une sous-classe vers une référence de sa superclasse.
    - Cela se fait implicitement, ce qui signifie que vous pouvez affecter une instance d'une sous-classe à une référence de la superclasse sans nécessiter de transtypage explicite.

    Exemple :
    ```java
    class Animal { }
    class Chien extends Animal { }

    Chien monChien = new Chien();
    Animal monAnimal = monChien; // Upcasting, pas besoin de casting explicite.
    ```

    L'upcasting est sûr, car une sous-classe est toujours un type valide de sa superclasse.

    2. **Downcasting (Casting vers le bas) :**

    - Le downcasting est la conversion d'une référence d'objet d'une superclasse vers une référence de sa sous-classe.
    - Cela nécessite un transtypage explicite, car le type statique de la référence d'objet doit être modifié pour correspondre à la sous-classe.

    Exemple :
    ```java
    class Animal { }
    class Chien extends Animal { }

    Animal monAnimal = new Chien();
    Chien monChien = (Chien) monAnimal; // Downcasting, nécessite un casting explicite.
    ```

    Le downcasting peut provoquer une exception de type **ClassCastException** si la référence d'objet n'est pas réellement une instance de la sous-classe. Par conséquent, il est recommandé de vérifier avant d'effectuer un downcasting pour éviter des erreurs à l'exécution.


    ### RQ : 
    Il est important de noter que l'upcasting est généralement sûr et couramment utilisé pour traiter des objets polymorphiquement, tandis que le downcasting doit être effectué avec prudence et avec des vérifications appropriées pour s'assurer de sa validité. Les castings sont couramment utilisés lors de la manipulation d'objets polymorphes dans des hiérarchies de classes pour accéder aux méthodes et aux propriétés spécifiques aux sous-classes.



### 7. la liasion dynamique :


- La liaison dynamique (également appelée liaison tardive ou polymorphisme) permet au programme de déterminer quelle méthode exécuter en fonction du type réel de l'objet au moment de l'exécution. 


- Voici comment fonctionne ce mécanisme en Java :

    1. **Déclaration de méthodes dans des classes :** Les classes Java contiennent des méthodes. Une classe peut avoir sa propre implémentation de méthodes ou hériter de méthodes d'une classe parente (superclasse).

    2. **Création d'objets :** Les objets sont créés à partir de ces classes. Chaque objet a un type dynamique, qui est la classe réelle de cet objet.

    Exemple :
    ```java
    Animal monAnimal = new Chien();
    ```

    Dans cet exemple, `monAnimal` est de type dynamique `Chien`, même s'il est référencé comme un `Animal`.

    3. **Appel de méthodes :** Lorsqu'une méthode est appelée sur un objet, Java détermine quelle implémentation de la méthode exécuter en fonction du type dynamique de l'objet. La méthode appelée est la méthode de la classe réelle de l'objet, même si la référence est de type statique (le type déclaré).

    Exemple :
    ```java
    monAnimal.faireSonCri();
    ```

    Dans cet exemple, la méthode `faireSonCri` de la classe `Chien` sera exécutée, même si `monAnimal` est déclaré comme un `Animal`. C'est la liaison dynamique qui permet à Java de choisir la méthode appropriée.


- La liaison dynamique est fondamentale pour le polymorphisme en Java. Elle permet au code d'être plus générique et de traiter des objets de différentes sous-classes de manière uniforme, en utilisant des références de la classe de base. Cela favorise la réutilisation du code et simplifie la gestion des objets polymorphes.



### RQ : 

- Il est important de noter que la liaison dynamique ne se produit que pour les méthodes redéfinies (méthodes de la superclasse ayant une implémentation dans la sous-classe). Pour les méthodes non redéfinies, la liaison est statique, c'est-à-dire que la méthode de la classe de référence est appelée.


- Exemple :

```java

public class Test {    //1
    public static void main(String args[]) {    //2
        Animal tabFig[] = new Animal[2]; //3
        tabFig[0] = new PangolinALongueQueue("Kirikou", 124, 12);   //4
        tabFig[1] = new Prof("Esseur", 10); //5

        tabFig[0].setNbEcailles(1000);  //6
        tabFig[0].setNom("Hubert"); //7
        System.out.println( tabFig[0].toString() ); //8

        tabFig[0].crier();  //10
        tabFig[1].crier("Les élèves dorment !");    //11
    }   //12
} 

```

- **Ligne 6** : Le compilateur génère une erreur de compilation. L'objet ``tabFig[0]``, de type dynamique ``PangolinALongueQueue``, possède bien une méthode ``void setNbEcailles(int nb)`` (cette méthode est héritée de Pangolin)... Mais le compilateur ne voit pas cette méthode ! En effet :

    - le type statique de ``tabFig[0]`` est Animal.

    - la méthode ``void setNbEcailles(int)`` n'est pas définie au niveau de la classe Animal le compilateur ne trouve donc pas de méthode correspondant à l'appel.



- **Donc**  Pour pouvoir appeler une méthode sur un objet, il faut que cette méthode soit déclarée dans la classe du type statique de la référence utilisée pour le manipuler.