# cour 11 : Encapsulation en POO

**1.Le Principe d'Encapsulation en POO**

- **L'encapsulation** est l'un des quatre piliers de la programmation orientée objet (POO), les autres étant **l'abstraction**, **l'héritage** et **le polymorphisme**. 

L'encapsulation consiste à regrouper les données et les méthodes qui opèrent sur ces données dans une seule unité, appelée classe. Cela permet de cacher les détails internes et de fournir une interface de communication contrôlée avec l'extérieur.

**2.Les avantages de l'encapsulation :**

a. **Protection des données** : L'encapsulation protège les données internes d'une classe en les rendant privées (private). Cela empêche l'accès direct et non autorisé à ces données depuis l'extérieur.

b. **Contrôle d'accès** : En définissant les méthodes d'accès (getters) et de modification (setters) appropriées, vous pouvez contrôler comment les données internes sont consultées et modifiées depuis l'extérieur.

c. **Modularité** : L'encapsulation permet de diviser le code en modules distincts, ce qui facilite la maintenance, la réutilisation et les mises à jour.

**3.Exemple d'encapsulation en Java :**

Considérons l'exemple d'une classe `Person` qui représente une personne avec un nom et un âge. Utilisons l'encapsulation pour garantir un accès contrôlé à ces données :

```java
public class Person {
    private String name; // Donnée privée
    private int age;     // Donnée privée

    public String getName() {
        return name; // Méthode d'accès
    }

    public void setName(String newName) {
        name = newName; // Méthode de modification
    }

    public int getAge() {
        return age; // Méthode d'accès
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge; // Méthode de modification
        }
    }
}
```

Dans cet exemple, nous avons déclaré les données `name` et `age` en tant que variables privées. Les méthodes `getName()` et `getAge()` sont des méthodes d'accès qui permettent de récupérer les valeurs de ces données. Les méthodes `setName()` et `setAge()` sont des méthodes de modification qui permettent de mettre à jour ces valeurs, en appliquant des contrôles appropriés (comme la vérification de l'âge positif).

Grâce à cette encapsulation, nous pouvons contrôler comment les données de la classe `Person` sont consultées et modifiées depuis l'extérieur. Par exemple :

```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```


