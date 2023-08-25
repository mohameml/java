# cour 19 : Les Interfaces 

1. **Introduction aux Interfaces :**
   - Une interface est une collection de méthodes abstraites (sans implémentation) que les classes concrètes doivent fournir.
   - Les interfaces définissent un contrat : si une classe implémente une interface, elle doit fournir des implémentations pour toutes les méthodes de l'interface.

#### RQ : 

un inetrface ne peut pas étre instancier par le mot clé `new` c'set different d'une classe .

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

Une hiérarchie d'interface est une structure qui définit une relation entre deux ou plusieurs interfaces. Une interface peut hériter d'une autre interface, ce qui signifie que la première interface adopte toutes les méthodes de la deuxième interface.


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

En Java, vous ne pouvez pas créer une variable dont le type est une interface de manière directe, car les interfaces sont des contrats abstraits et ne peuvent pas être instanciées. Cependant, vous pouvez utiliser une référence de type d'interface pour faire référence à une instance d'une classe qui implémente cette interface. 


Exemple :

Voici comment cela fonctionne :

Supposons que vous ayez une interface `Calculable` et deux classes `Cercle` et `Rectangle` qui l'implémentent :

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

