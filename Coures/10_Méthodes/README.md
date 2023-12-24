# cour 10 : Les Méthodes 

**Les méthodes** sont des blocs de code qui effectuent des tâches spécifiques et peuvent être réutilisés dans différents endroits du programme. Elles sont essentielles pour organiser et modéliser le comportement des objets dans un programme Java.


**1. Introduction aux Méthodes :**
- Une méthode est un bloc de code qui effectue une action spécifique.
- Les méthodes permettent de regrouper des actions similaires et de les appeler en tant que besoin.
- Les méthodes rendent le code plus lisible, réutilisable et modulaire.

**2. Déclaration de Méthodes :**
- Une méthode est définie dans le corps d'une classe.
- Une méthode a un nom, une liste de paramètres (facultative) et un type de retour.
- Exemple de déclaration de méthode :
  ```java
  public int calculateSum(int a, int b) {
      int sum = a + b;
      return sum;
  }
  ```

**3. Appel de Méthodes :**
- Pour appeler une méthode, utilisez son nom suivi de parenthèses et des arguments (s'il y en a).
- Les méthodes peuvent être appelées à partir de n'importe où dans la classe ou à partir d'autres classes, en fonction de leur visibilité (`public`, `private`, etc.).
- Exemple d'appel de méthode :
  ```java
  int result = calculateSum(5, 10);
  ```

**4. Paramètres et Arguments :**
- Les paramètres sont des valeurs passées à une méthode lors de son appel.
- Les arguments sont les valeurs spécifiques passées aux paramètres lors de l'appel de la méthode.
- Les paramètres permettent à une méthode de recevoir des données et de les traiter.
- Exemple de méthode avec des paramètres :
  ```java
  public double calculateAverage(double[] numbers) {
      // Code pour calculer la moyenne
  }
  ```

**5. Type de Retour :**
- Chaque méthode a un type de retour déclaré, qui indique le type de données que la méthode renverra.
- Une méthode peut renvoyer une valeur en utilisant le mot-clé `return`.
- Si une méthode ne renvoie rien, son type de retour est `void`.
- Exemple de méthode avec type de retour :
  ```java
  public String greet(String name) {
      return "Hello, " + name + "!";
  }
  ```

**6. Méthodes Statiques :**
- Une méthode statique appartient à la classe plutôt qu'à une instance d'objet.
- Elle est déclarée avec le modificateur `static` et peut être appelée directement depuis la classe.
- Exemple de méthode statique :
  ```java
  public static double calculateCircleArea(double radius) {
      return Math.PI * radius * radius;
  }
  ```


**7. Méthodes surchargées :**
- La surcharge de méthode permet de définir plusieurs méthodes ayant le même nom mais des paramètres différents.
- Cela facilite l'utilisation de méthodes similaires avec différentes entrées.
- Exemple de surcharge de méthode :
  ```java
  public int add(int a, int b) {
      return a + b;
  }
  
  public double add(double a, double b) {
      return a + b;
  }
  ```

**9. Méthodes de Manipulation d'Objets :**
- Les méthodes peuvent être utilisées pour modifier l'état interne des objets.
- Cela permet de suivre le principe d'encapsulation en contrôlant l'accès aux attributs de l'objet.
- Exemple de méthode de manipulation d'objet :
  ```java
  public class BankAccount {
      private double balance;
      
      public void deposit(double amount) {
          if (amount > 0) {
              balance += amount;
          }
      }
  }
  ```

**10. méthodes particulières:**

- En Java, il existe plusieurs méthodes particulières que vous pouvez implémenter dans vos classes pour personnaliser leur comportement. 

- Parmi les méthodes particulières les plus couramment utilisées, on trouve `toString`, `equals`, `hashCode`, `compareTo`, et `clone`. 

- **Description des méthodes particulières :**

1. **`toString`** :

  - La méthode `toString` est utilisée pour renvoyer une représentation sous forme de chaîne de l'objet. Elle est principalement utilisée pour afficher des informations significatives sur l'objet. 
  
  - Vous pouvez la redéfinir dans vos classes pour renvoyer une chaîne personnalisée qui décrit l'objet.

   ```java
   @Override
   public String toString() {
       return "Ceci est un objet personnalisé avec des informations spécifiques : " + this.someData;
   }
   ```

2. **`equals`** :

  - La méthode `equals` est utilisée pour comparer deux objets pour déterminer s'ils sont égaux. 
  
  - Vous devez la redéfinir pour comparer les champs de vos objets selon vos propres critères.

   ```java
    @Override
    public boolean equals(Object other) {
        if (other instanceof Votreclass) {
            return ((Votreclass) other).nom.equals(this.nom); // ie : O1==O2 ssi O1.nom==O2.nom
        }
        return false;
    }
   ```

3. **`hashCode`** :
   La méthode `hashCode` est utilisée pour retourner un code de hachage qui identifie un objet. Vous devez la redéfinir lorsque vous redéfinissez la méthode `equals` pour vous assurer que les objets égaux renvoient le même code de hachage.

   ```java
   @Override
   public int hashCode() {
       return Objects.hash(someField);
   }
   ```

4. **`compareTo`** (pour les objets comparables) :
   La méthode `compareTo` est utilisée pour comparer un objet avec un autre et déterminer leur ordre relatif. Elle est généralement utilisée pour trier des objets dans des collections. Vous devez la redéfinir si vous implémentez l'interface `Comparable`.

   ```java
   @Override
   public int compareTo(MonObjet autreObjet) {
       return this.someField - autreObjet.someField;
   }
   ```

5. **`clone`** (pour la copie d'objets) :
   La méthode `clone` est utilisée pour créer une copie de l'objet. Pour permettre la copie d'objets, vous devez implémenter l'interface `Cloneable` et redéfinir la méthode `clone`.

   ```java
   @Override
   public Object clone() throws CloneNotSupportedException {
       return super.clone();
   }
   ```



### RQ : 

Dans la class Principale on uitilse tjrs de Méthodes avce des modificateures `public static`.



