# cour 8 : constructeur de classe 



Les constructeurs sont des méthodes spéciales qui sont utilisées pour initialiser les objets dès leur création. Ils jouent un rôle crucial dans l'attribution des valeurs initiales aux attributs de la classe. 

**1. Introduction aux Constructeurs :**
- Un constructeur est une méthode spéciale portant le même nom que la classe.
- Il est appelé automatiquement lorsqu'un nouvel objet est créé à l'aide du mot-clé `new`.
- Les constructeurs permettent d'initialiser les attributs de la classe avec des valeurs spécifiques.

**2. Constructeurs par Défaut :**
- Si aucune définition de constructeur n'est fournie dans la classe, Java fournit un constructeur par défaut sans paramètres.
- Ce constructeur ne fait rien de spécial et initialise les attributs avec des valeurs par défaut (0 pour les entiers, null pour les références, etc.).

**3. Création de Constructeurs  :**
- Vous pouvez définir vos propres constructeurs pour spécifier comment les objets doivent être initialisés.
- Les constructeurs personnalisés peuvent accepter des paramètres, ce qui permet de transmettre des valeurs lors de la création d'un objet.
- Exemple de constructeur personnalisé :
  ```java
  public class Person {
      private String name;
      private int age;
      
      // Constructeur personnalisé avec paramètres
      public Person(String n, int a) {
          name = n;
          age = a;
      }
  }
  ```

**4. Le mot clé ``this`` :**

En Java, le mot-clé `this` est utilisé pour faire référence à l'instance actuelle de la classe dans laquelle il est utilisé. Il permet de distinguer entre les attributs de la classe et les paramètres ou variables locales portant le même nom. 

Voici quelques exemples pour illustrer l'utilisation du mot-clé `this` :

**a. Référence à un attribut de classe :**
```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name; // Utilisation de "this" pour référencer l'attribut de la classe
    }
}
```

**b. Éviter les ambiguïtés :**
```java
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;   // Utilisation de "this" pour référencer l'attribut de la classe
        this.height = height; // Évite l'ambiguïté avec les paramètres du constructeur
    }
}
```



**4. Constructeurs Chaînés :**
- Un constructeur peut appeler un autre constructeur de la même classe à l'aide du mot-clé `this`.
- Cela permet de réutiliser le code d'initialisation et d'éviter la duplication.
- Exemple de constructeurs chaînés :
  ```java
  public class Person {
      private String name;
      private int age;
      
      public Person(String n) {
          this(n, 0); // Appelle le constructeur avec deux paramètres
      }
      
      public Person(String n, int a) {
          name = n;
          age = a;
      }
  }
  ```

**5. Utilisation des Constructeurs :**
- Pour créer un objet avec un constructeur personnalisé, utilisez le mot-clé `new` suivi du nom du constructeur.
- Exemple d'utilisation des constructeurs :
  ```java
  public class Main {
      public static void main(String[] args) {
          Person person1 = new Person("Alice", 25);
          Person person2 = new Person("Bob");
      }
  }
  ```


