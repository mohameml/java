# cour 9 : Les attributs


Les attributs sont utilisés pour stocker les données et les caractéristiques des objets créés à partir d'une classe.

**1. Introduction aux Attributs :**
- Les attributs, également appelés variables membres, sont des variables déclarées à l'intérieur d'une classe.
- Chaque objet créé à partir de cette classe possède sa propre copie des attributs.
- Les attributs définissent les caractéristiques ou les données qui décrivent l'état de l'objet.

**2. Déclaration d'Attributs :**
- Les attributs sont déclarés à l'intérieur de la classe, généralement en haut de la définition de la classe.
- Les attributs peuvent avoir des types primitifs (int, double, boolean, etc.) ou des types de référence (objets).
- Exemple de déclaration d'attributs :
  ```java
  public class Student {
      String name;
      int age;
      double gpa;
  }
  ```

**3. Accès aux Attributs :**
- Les attributs sont accessibles à l'intérieur des méthodes de la classe où ils sont déclarés.
- Utilisez le mot-clé `this` pour faire référence aux attributs de l'instance actuelle de la classe.
- Exemple d'utilisation d'attributs :
  ```java
  public class Student {
      String name;
      int age;
      
      public void displayInfo() {
          System.out.println("Name: " + this.name);
          System.out.println("Age: " + this.age);
      }
  }
  ```

**4. Initialisation des Attributs :**
- Les attributs peuvent être initialisés directement lors de leur déclaration ou dans les constructeurs.
- L'initialisation peut être effectuée avec des valeurs par défaut ou avec des valeurs passées en paramètres.
- Exemple d'initialisation d'attributs dans un constructeur :
  ```java
  public class Book {
      String title;
      String author;
      
      public Book(String t, String a) {
          this.title = t;
          this.author = a;
      }
  }
  ```

**5. Encapsulation et Attributs Privés :**
- Pour améliorer l'encapsulation et la sécurité, les attributs peuvent être déclarés comme `private`.
- Des méthodes getter et setter sont utilisées pour accéder et modifier les attributs privés.
- Exemple d'encapsulation :
  ```java
  public class BankAccount {
      private double balance;
      
      public double getBalance() {
          return balance;
      }
      
      public void deposit(double amount) {
          if (amount > 0) {
              balance += amount;
          }
      }
  }
  ```

**6. Attributs Statiques (Variables de Classe) :**
- Les attributs statiques sont partagés par toutes les instances de la classe.
- Ils sont déclarés avec le mot-clé `static` et peuvent être accédés via le nom de la classe.
- Exemple d'attribut statique :
  ```java
  public class MathUtils {
      public static final double PI = 3.14159;
  }
  ```

### RQ :

Pour accéder à un attribut statique , vous utilisez le nom de la classe suivie de l'opérateur de résolution de portée (`.`) suivi du nom de l'attribut. Voici comment vous pouvez accéder à un attribut statique :


Pour accéder à l'attribut statique `PI` depuis une autre classe, vous pouvez le faire de la manière suivante :

```java
public class Main {
    public static void main(String[] args) {
        double piValue = MathUtils.PI;
        System.out.println("The value of PI is: " + piValue);
    }
}
```

### RQ : La différence  entre `public` et `static` :


**a. `public` :**
- `public` est un modificateur d'accès qui indique que la classe, la méthode ou l'attribut auquel il est appliqué est accessible depuis n'importe où dans le programme.
- Une classe ou une méthode déclarée comme `public` peut être utilisée et appelée à partir de n'importe quelle autre classe, même si elles sont dans des packages différents.
- Exemple d'utilisation de `public` :
  ```java
  public class MyClass {
      public int publicAttribute;
      
      public void publicMethod() {
          // Code de la méthode
      }
  }
  ```

**b. `static` :**
- `static` est un modificateur qui indique que la méthode ou l'attribut auquel il est appliqué appartient à la classe elle-même plutôt qu'à une instance particulière de la classe.
- Les attributs statiques sont partagés entre toutes les instances de la classe et peuvent être utilisés sans créer d'objet spécifique.
- Les méthodes statiques peuvent être appelées directement à partir de la classe, sans nécessiter la création d'une instance.
- Exemple d'utilisation de `static` :
  ```java
  public class MathUtils {
      public static final double PI = 3.14159;
      
      public static int add(int a, int b) {
          return a + b;
      }
  }
  ```



