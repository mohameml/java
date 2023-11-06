# cour 25 : généricité 





## 1. Introduction à la la genericité :

-  **Introduction à la la genericité:**

    - Parfois, on souhaite créer une classe mais on ne souhaite pas préciser le type exact de tel ou tel attribut. 
    
    - C’est souvent le cas quand la classe sert de conteneur à un autre type de classe. 
    
    - En Java, il est possible de créer des méthodes et des classes dont certains types sont des paramètres qui seront résolus au moment de l’invocation et de l’instanciation. 
    
    - On parle alors de méthodes et de classes génériques


## 2. **classes génerique:** 

- **classes génerique:**

    - Les classes génériques  permettent de créer des composants réutilisables qui peuvent fonctionner avec différents types de données. 

    - Elles sont définies en utilisant des types paramétrés, ce qui offre une flexibilité en permettant d'écrire du code qui peut être utilisé avec divers types de données sans avoir besoin de réécrire le même code pour chaque type spécifique.

    - **Exemple :**


        ```java
        public class Boite<T> {
            private T contenu;

            public void mettre(T objet) {
                this.contenu = objet;
            }

            public T obtenir() {
                return contenu;
            }
        }
        ```

        Dans cet exemple, la classe `Boite` est générique et utilise le type paramétré `T`. Cette classe peut contenir n'importe quel type d'objet. Lorsque vous créez une instance de cette classe, vous spécifiez le type de données que la classe devrait manipuler. Par exemple :

        ```java
        Boite<String> boiteDeChaines = new Boite<>();
        boiteDeChaines.mettre("Exemple de chaîne");
        String chaine = boiteDeChaines.obtenir();
        ```

        Ici, `Boite<String>` spécifie que `boiteDeChaines` ne peut contenir que des chaînes (`String`). Si vous essayez d'ajouter un autre type d'objet, par exemple un entier, cela générera une erreur à la compilation.


## 3. **attributs générique :**

- **attributs générique :** 

    - il est possible de déclarer des attributs génériques au sein de classes, permettant ainsi une flexibilité accrue pour stocker des données de types variés. 

    - Les attributs génériques suivent le même concept que les classes ou méthodes génériques, en utilisant des types paramétrés pour créer des attributs dont le type est spécifié au moment de l'instanciation de la classe. 

    - **Voici un exemple :**

        ```java
        public class Couple<A, B> {
            private A premier;
            private B second;

            public Couple(A premier, B second) {
                this.premier = premier;
                this.second = second;
            }

            public A getPremier() {
                return premier;
            }

            public B getSecond() {
                return second;
            }

            public void setPremier(A premier) {
                this.premier = premier;
            }

            public void setSecond(B second) {
                this.second = second;
            }
        }
        ```

        Dans cet exemple, la classe `Couple` est générique et possède deux attributs génériques `premier` de type `A` et `second` de type `B`. Lorsque vous instanciez cette classe, vous spécifiez les types de données que vous souhaitez utiliser pour ces attributs :

        ```java
        Couple<String, Integer> couple = new Couple<>("Bonjour", 10);
        String premier = couple.getPremier();
        Integer second = couple.getSecond();
        ```

        Ici, un objet de type `Couple` est créé avec le premier élément de type `String` et le deuxième de type `Integer`. Vous pouvez ensuite accéder aux éléments individuellement en fonction de leur type respectif.




## 4. **méthodes géneriques :** 


- les méthodes génériques sont des méthodes capables de prendre en charge différents types de données. 

- Elles utilisent des types paramétrés (génériques) pour créer des fonctions flexibles qui peuvent être utilisées avec différents types de données sans avoir à réécrire du code pour chaque type spécifique.


- **La syntaxe générale :** des méthodes génériques en Java suit un schéma spécifique pour déclarer des méthodes capables de travailler avec des types paramétrés. 
    
    - **la structure typique d'une méthode générique en Java :**

        ```java
        public <T> returnType maMethode(T parametre1, T parametre2, ...) {
            // Corps de la méthode
        }
        ```


        - `public`: Modificateur d'accès de la méthode (peut être `public`, `private`, `protected` ou package-private).

        - `<T>` : Déclaration du type paramétré générique `T`. Le nom `T` peut être remplacé par tout autre nom de type (comme `E`, `V`, etc.).

        - `returnType` : Type de retour de la méthode. Cela peut être un type générique ou non.

        - `maMethode` : Nom de la méthode.

        - `(T parametre1, T parametre2, ...)` : Liste des paramètres de la méthode. Les paramètres peuvent être de type générique `T` ou de types spécifiques. Les types spécifiques peuvent être mélangés avec le type générique.

        - Corps de la méthode : Le code à exécuter dans la méthode. La logique de la méthode peut utiliser le type générique `T` ainsi que d'autres types spécifiques.



- **Voici un exemple de méthode générique en Java :**

    ```java
    public class OperationsGeneriques {
        public <T> T maximum(T a, T b) {
            if (a instanceof Comparable && b instanceof Comparable) {
                Comparable<T> compA = (Comparable<T>) a;
                if (compA.compareTo(b) < 0) {
                    return b;
                } else {
                    return a;
                }
            }
            return null;
        }
    }
    ```

    Dans cet exemple, la méthode `maximum` est générique, elle utilise un type paramétré `T`. Elle prend deux arguments de type `T` (deux éléments du même type) et renvoie le plus grand des deux. Cette méthode utilise l'interface `Comparable` pour comparer les objets. Elle peut être utilisée avec n'importe quel type de données qui implémente l'interface `Comparable`.

    - **Exemple d'utilisation de la méthode générique `maximum` :**

        ```java
        OperationsGeneriques operations = new OperationsGeneriques();

        Integer maxEntier = operations.maximum(5, 10);
        System.out.println("Maximum des entiers : " + maxEntier);

        Double maxDouble = operations.maximum(3.5, 8.9);
        System.out.println("Maximum des doubles : " + maxDouble);

        String maxString = operations.maximum("abc", "xyz");
        System.out.println("Maximum des chaînes : " + maxString);
        
        ```

    - Cette méthode générique peut être utilisée avec différents types de données sans avoir à redéfinir la logique de comparaison à chaque fois. Elle offre la flexibilité de travailler avec divers types de données, tout en conservant la sécurité de type à la compilation.




### RQ : 

- Les classes génériques sont largement utilisées dans Java, notamment dans les collections génériques telles que `ArrayList<T>`, `HashMap<K, V>`, etc. 

- Elles permettent de stocker des éléments de types spécifiques tout en assurant la sécurité de type et la réutilisabilité du code.

- Les méthodes génériques sont utilisées dans de nombreuses classes et bibliothèques Java standard pour créer des fonctions qui peuvent être appliquées à différentes structures de données sans duplication de code.







## 5. **La notation en diamant :**

- La notation en diamant en Java fait référence à l'utilisation des diamants (`<>`) lors de l'instanciation d'une classe générique. 

- Elle a été introduite dans Java 7 pour améliorer la lisibilité du code lors de l'instanciation d'objets de types génériques.

```java
List<String> listeDeChaines = new ArrayList<>();
```

- La partie `<>` après le nom de la classe (`ArrayList<>`) est **le diamant**, et il indique au compilateur de Java d'inférer le type requis en se basant sur le contexte, c'est-à-dire sur le type de la variable à gauche de l'assignation.

- Cela permet une meilleure lisibilité du code en éliminant la redondance de la spécification du type lors de l'instanciation des classes génériques, tout en préservant la sécurité de type.


## 6. **les wildcards en java :**


- **Définition :**

    - les wildcards, représentés par le symbole `?`, sont des caractères spéciaux utilisés dans le contexte des types génériques pour fournir une flexibilité accrue lors de la manipulation de données génériques.

    - Les wildcards permettent de définir des types génériques sans spécifier un type précis. 

    - Ils sont utilisés pour représenter des types inconnus ou non spécifiés. Ces wildcards sont principalement utilisés dans le cadre des collections génériques pour déclarer des types génériques sans être lié à un type de données spécifique.


- **Types :**

    - Il existe trois types de wildcards couramment utilisés :

        1. **Wildcard non-borné** (`<?>`) : 
            
            - Signifie **n'importe quel type**. 
            
            - Il est souvent utilisé pour lire des données génériques sans se soucier du type exact. 
            
            - Par exemple, lorsqu'on souhaite parcourir une liste sans effectuer d'opérations qui dépendent du type spécifique :

                ```java
                public static void printList(List<?> l)
                {
                    // une méthode génerique 
                    
                    for(Object o : l)
                    {
                        System.out.println(">"+ o.toString());
                    }
                }
                ```     

        2. **Wildcard borné supérieur** (`<? extends E>`) : 

            -  Signifie **n'importe quel type qui est un sous-type de E**. 
            
            - Cela permet de définir une limite supérieure pour le type de données utilisé dans une collection générique. 
            
            - Par exemple, une liste qui accepte tous les sous-types d'une classe spécifique :
                ```java
                List<? extends Number> nombres = new ArrayList<>();
                // Cette liste acceptera tous les sous-types de Number, par exemple Integer, Double, etc.
                ```

        3. **Wildcard borné inférieur** (`<? super E>`) : 
            
            -  Signifie **n'importe quel type qui est un super-type de E**. 
            
            - Il définit une limite inférieure pour le type de données utilisé dans une collection générique
            
            - Par exemple, une liste qui accepte un type et tous ses super-types :
                ```java
                List<? super Integer> listeEntiers = new ArrayList<>();
                // Cette liste acceptera Integer et tout supertype de Integer (par exemple, Number, Object)
                ```
           


- Les wildcards offrent une grande flexibilité lors de la manipulation de données génériques. 

- Ils permettent de travailler avec des types génériques de manière plus générique, sans être spécifiquement lié à un type de données particulier, ce qui rend le code plus flexible et réutilisable.

- Ils sont largement utilisés dans le contexte des collections génériques, telles que les listes (`List`), les ensembles (`Set`), et les cartes (`Map`), permettant de créer des structures de données génériques capables de contenir des éléments de types inconnus ou variés.





### RQ : 

- `<E>` (type générique explicite) : C'est la déclaration explicite d'un type générique dans une classe, une interface ou une méthode :

   - Exemple :
   ```java
   public class Boite<E> {
       private E contenu;

       public void mettre(E objet) {
           this.contenu = objet;
       }

       public E obtenir() {
           return contenu;
       }
   }

   Boite<String> boiteDeChaines = new Boite<>();
   // Une boîte qui ne peut contenir que des chaînes (String)
   ```


## 7. **interfaces génériques :**

- En Java, il est possible de définir des interfaces génériques, ce qui permet de créer des contrats pour des classes qui peuvent travailler avec différents types de données. 

- Les interfaces génériques sont définies de manière similaire aux classes génériques, mais au lieu de définir une implémentation concrète, elles déclarent des méthodes ou des contrats pouvant être utilisés par des classes qui implémentent ces interfaces.


- **un exemple d'interface générique en Java :**

    ```java
    public interface BoiteGenerique<T> {
        void mettre(T objet);
        T obtenir();
    }
    ```

    Dans cet exemple, l'interface `BoiteGenerique` est générique et possède deux méthodes génériques : `mettre` et `obtenir`. Cette interface peut être implémentée par des classes qui manipulent une "boîte" d'un type spécifique.

    Une classe concrète peut implémenter cette interface en spécifiant le type de données qu'elle utilisera :

    ```java
    public class MaBoite<T> implements BoiteGenerique<T> {
        private T contenu;

        @Override
        public void mettre(T objet) {
            this.contenu = objet;
        }

        @Override
        public T obtenir() {
            return contenu;
        }
    }
    ```

    Cette classe `MaBoite` implémente l'interface générique `BoiteGenerique` en utilisant le type générique `T` pour définir sa méthode `mettre` et `obtenir`.





## 8. **héritage générique :**


- L'héritage générique en Java se réfère à l'utilisation de la généricité dans le cadre de l'héritage entre les classes. 

- Cela permet de créer des relations hiérarchiques entre des classes génériques. 

- Les sous-classes peuvent spécialiser ou étendre des classes génériques tout en conservant la généricité, permettant ainsi une plus grande flexibilité et réutilisation du code.


- **un exemple démontrant l'héritage générique :**

Considérons une classe générique de base `BoiteGenerique<T>` :

```java
public class BoiteGenerique<T> {
    private T contenu;

    public void mettre(T objet) {
        this.contenu = objet;
    }

    public T obtenir() {
        return contenu;
    }
}
```

Maintenant, une sous-classe spécifique peut étendre cette classe générique tout en déterminant un type concret pour `T`. Par exemple :

```java
public class BoiteDeChaine extends BoiteGenerique<String> {
    // Cette classe spécialise la classe générique en utilisant le type 'String'
    // Elle hérite de toutes les fonctionnalités de BoiteGenerique avec un type spécifique (String)
}
```

Dans cet exemple, la classe `BoiteDeChaine` est une sous-classe de `BoiteGenerique` où le type `T` est fixé à `String`.

L'héritage générique permet aux sous-classes de spécifier le type concret pour un type générique et d'utiliser toutes les fonctionnalités de la classe générique de base. Cela offre une réutilisation de code significative, tout en permettant une spécialisation pour des types spécifiques.

Cette approche est largement utilisée dans les bibliothèques Java standard, où des classes génériques de base sont étendues pour des cas d'utilisation spécifiques, permettant ainsi une adaptabilité et une extensibilité des fonctionnalités tout en conservant la sûreté de type.


### RQ : 

- La syntaxe  `public class Paire<U extends Number, V>`, définit une classe générique nommée "Paire". Cette classe prend deux types de paramètres génériques, notés ici comme `U` et `V` :

    - `U extends Number` : Cela signifie que le type `U` (le premier paramètre générique) doit être une sous-classe de `Number`. En d'autres termes, `U` doit être soit de type `Number`, soit de l'un de ses sous-types (par exemple `Integer`, `Double`, etc.).

    - `V` : Il s'agit du deuxième paramètre générique et n'a aucune restriction concernant le type. Il peut être de n'importe quel type.


## 9. **Limitations :**

- Les méthodes et les classes génériques ont des limitations.


- **Les types paramétrés : <T>** ne s’appliquent que pour des classes :
    
    - On ne peut pas spécifier un type primitif. 
    
    - Si on désire créer une instance de ArrayList pour des nombres, alors on peut passer par la classe enveloppe Integer :

        ```java
        ArrayList<Integer> listeDeNombres = new ArrayList<Integer>();
        ```
 
- La déclaration d’un type paramétré ne fait pas partie du nom d’une classe  :

    - Donc il n’est pas possible de spécifier un type paramétré avec le mot-clé instanceof :

        ```java
        if (listeVoiture instanceof List<Voiture>) { // ERREUR DE COMPILATION
        // ...
        }
        ```

- Il n’est pas possible d’instancier un type paramétré dans le corps d’une méthode générique :

    ```java
    public static <T> doSomething(List<T> l) 
    {
        l.add(new T()); // ERREUR DE COMPILATION
    }    
    
    ```

- Il n’est pas possible de déclarer un attribut de classe (static) en utilisant un type paramétré :

    ```java
    public class Test<T> {

        private static T attribut; // ERREUR DE COMPILATION

        }
    
    
    ```

- Il n’est pas possible de créer des tableaux en spécifiant des types paramétrés :

    ```java
    List<String>[] tableau = new List<String>[10]; // ERREUR DE COMPILATION
    
    ```

    - **Soultion:** 

        ```java
        List<String>[] tableau = new List[10];
        for (int i = 0; i < 10; i++) {
            tableau[i] = new ArrayList<>();
        }

        
        ```

- Il n’est pas possible d’utiliser un type paramétré dans une expression catch :

    ```java
    public static <T extends Exception> void doSomething() {
        try {
            // ...
        } catch (T t) { // ERREUR DE COMPILATION
            // ...
        }
        }
    ```

- Il n’est pas possible de surcharger (overload) une méthode en ne changeant que le type paramétré d’un paramètre :

    ```java
        public class Test {

        public void doSomething(List<String> l) {
            // ...
        }

        public void doSomething(List<Integer> l) { // ERREUR DE COMPILATION
            // ...
        }
        }
    
    ```