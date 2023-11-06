# cour 19 : Les Interfaces 

1. **Introduction aux Interfaces :**


- En première approche, en java et plus généralement en POO, une ``interface`` est un type (tout comme une classe) qui regroupe un ensemble de méthodes abstraites dont on ne donne que la signature (sans code).

- Une interface s'écrit comme une classe, mais au moyen du mot clé ``interface`` en lieu et place du mot clé class.

- Une interface ne contient aucun traitement véritable. Elle se contente de déclarer un cadre pour un ensemble de traitements qui devront être implémentés plus tard par une classe. 


- Une classe qui déclare implémenter une interface s'engage à fournir le service (le « contrat ») spécifié par l'interface. Elle doit donc fournir une implémentation pour chacune des méthodes listées dans l'interface :

   - Les interfaces définissent un contrat : si une classe implémente une interface, elle doit fournir des implémentations pour toutes les méthodes de l'interface.

#### RQ : 

- un inetrface ne peut pas étre instancier par le mot clé `new` c'est different d'une classe .


- En fait, ce n'est le cas que si la classe concrète. Une classe abstraite qui implémente une interface n'est pas tenue de fournir une implémentation pour toutes les méthodes déclarées dans l'interface. Mais ses sous-classes concrètes devront le faire, bien sûr (sans quoi elles ne seraient pas concrètes !).


- **Convention:**
    
    - le nom d'une interface, par convention, se termine souvent par  ``able`` (Deplacable, Cloneable, Comparable...)


- une interface ne peut déclarer que des attributs constants, déclarés ``static final``.

- Toutes les méthodes d'une interface sont implicitement déclarées ``abstract et public``. 



- ```java

    Dessinable[] tab = new Dessinable[3];
    ```

    - la syntaxe ``new Dessinable[3] `` ne signifie pas que l'on instancie directement une interface (ce qui serait contradictoire avec le fait qu'une interface ne contient que des méthodes abstraites). 



2. **Déclaration d'une Interface :**

   - Pour déclarer une interface, utilisez le mot-clé `interface` suivi du nom de l'interface.

   - Les méthodes déclarées dans une interface n'ont pas de corps (aucune implémentation).

   ```java
   interface Calculable {
       double calculer(); // tjrs public abstract 
   }
   ```

3. **Implémentation d'une Interface :**

   - Une classe peut implémenter une ou plusieurs interfaces en utilisant le mot-clé `implements`.

   - La classe doit fournir une implémentation pour toutes les méthodes de l'interface.

   ```java
   class Cercle implements Calculable {
       private double rayon;

       public Cercle(double rayon) {
           this.rayon = rayon;
       }

        // il faut que le modificateur soit public aussi :
       public double calculer() {
           return Math.PI * rayon * rayon;
       }
   }
   ```



4. **Héritage de plusieurs Interfaces :**
   - Une classe peut implémenter plusieurs interfaces en les séparant par des virgules.

   ```java
   class Cylindre implements Calculable, VolumeCalculable {
       // ...
   }
   ```

5. **Interfaces par Défaut et Méthodes Statiques (Java 8+) :**

   - À partir de Java 8, les interfaces peuvent contenir des méthodes avec une implémentation par défaut , on utilise le mot clés `default` .

   - Les méthodes statiques peuvent également être définies dans les interfaces.

   ```java
   interface Affichable {
       void afficher();

       default void afficherEnMajuscules() {
           System.out.println(afficher().toUpperCase());
       }

       static void afficherMessage() {
           System.out.println("Message d'interface.");
       }
   }
   ```

6. **Hiéarchies des interfaces :**

- Une hiérarchie d'interface est une structure qui définit une relation entre deux ou plusieurs interfaces. 

- Une interface peut hériter d'une autre interface, ce qui signifie que la première interface adopte toutes les méthodes de la deuxième interface.


Exemple :

Par exemple, l'interface `Animal` peut hériter de l'interface ``LivingThing``. Cela signifie que toute classe qui implémente l'interface Animal doit également implémenter l'interface LivingThing.

```java

interface LivingThing
{

}

inetrafce Aniaml extends LivingThing
{

}
```
7. **Variables de type inetrafce :**


- Une interface définit un type, de la même manière qu'une classe , On peut donc déclarer des références du type d'une interface.

- Toute instance d'une classe qui implémente une interface peut être considérée comme étant du type de l'interface. 

- Ou, dit autrement, une référence du type d'une interface (type statique) peut être utilisée pour manipuler des objets dont le type dynamique est n'importe quelle classe qui implémente cette interface.

- Une interface peut donc être utilisée, comme n'importe quelle super classe, pour le polymorphisme. Par exemple :

```java 
Deplacable d = new Point(10, 12)

```


- **Exemple :**



- Supposons que vous ayez une interface `Calculable` et deux classes `Cercle` et `Rectangle` qui l'implémentent :

```java
interface Calculable {
    double calculer();
}

class Cercle implements Calculable {
    // Implémentation de la méthode calculer()
}

class Rectangle implements Calculable {
    // Implémentation de la méthode calculer()
}
```

Ensuite, vous pouvez créer une référence de type `Calculable` et l'assigner à une instance de l'une de ces classes :

```java
public class Main {
    public static void main(String[] args) {
        Calculable calculable1 = new Cercle();
        Calculable calculable2 = new Rectangle();

        double resultat1 = calculable1.calculer();
        double resultat2 = calculable2.calculer();

        System.out.println("Résultat 1 : " + resultat1);
        System.out.println("Résultat 2 : " + resultat2);
    }
}
```

Dans cet exemple, les références `calculable1` et `calculable2` sont de type `Calculable`, qui est l'interface. Cependant, elles sont affectées à des instances des classes `Cercle` et `Rectangle` respectivement, car ces classes implémentent l'interface `Calculable`.


8 .**les classes anonymes :**


- les classes anonymes sont des classes sans nom. 

- Elles sont souvent utilisées pour implémenter rapidement des interfaces ou étendre des classes abstraites de manière concise et directe. 

- Elles sont définies et instanciées en même temps, souvent au moment de l'utilisation, et ne sont pas nommées.



- **exemple 1 d'utilisation des classes anonymes avec des interfaces :**


Supposons que nous avons une interface "Forme" :

```java
interface Forme {
    void dessiner();
}
```

On peut utiliser une classe anonyme pour implémenter cette interface :

```java
public class ExempleClassesAnonymes {
    public static void main(String[] args) {
        // Utilisation d'une classe anonyme pour implémenter l'interface Forme
        Forme forme = new Forme() {
            @Override
            public void dessiner() {
                System.out.println("Dessiner une forme");
            }
        };

        forme.dessiner(); // Appel de la méthode dessiner() sur l'instance de Forme
    }
}
```

Dans cet exemple, une classe anonyme est utilisée pour implémenter l'interface ``Forme``. On définit directement l'implémentation de la méthode ``dessiner()`` à l'intérieur de la classe anonyme au moment de l'instanciation de l'interface ``Forme``.

Les classes anonymes sont pratiques pour les implémentations temporaires et ponctuelles. Elles sont souvent utilisées dans le cadre d'événements (comme les écouteurs d'événements dans les interfaces graphiques) ou pour des tâches spécifiques qui nécessitent une implémentation rapide sans créer une classe distincte.


- **exemple 2 :**


```java

interface Dessinable {
    public void dessiner(Graphics g);
    public void setColor(Color c);
    [...]
}

class Test {
    public static void main(String args[]) {
        Graphics g = [...];
        Dessinable[] tab = new Dessinable [3];

        tab[0] = new Dessinable() { // Une belle classe anonyme pour notre bonhomme de neige
            private Color color;

            public void setColor(Color c) {
                this.color = c;
            }
            public void dessiner(Graphics g) {
                g.drawOval(...);
                [...]
            }        
        };
        tab[1] = new Rectangle(...);
        tab[2] = new PangolinDessinable(...);
        for(Dessinable d : tab) {
            d.dessiner(g);
        }
    }
}

```

- la syntaxe ``new Dessinable()`` ne signifie pas que l'on instancie directement une interface . 

- Il s'agit ici d'un raccourci d'écriture qui condense la définition d'une classe réalisant l'interface Dessinable et son instanciation en une seule ligne d'instructions. 

