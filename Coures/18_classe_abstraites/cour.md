# cour 18 :les Classes Abstraites en Java


### 1.Définition :
Les classes abstraites sont un concept fondamental de la programmation orientée objet en Java. Elles permettent de créer des structures de base pour des classes dérivées, en fournissant une implémentation partielle et en forçant les sous-classes à compléter l'implémentation. 

- Une classe abstraite est une classe qui ne peut pas être instanciée directement. Elle sert de modèle pour d'autres classes.
- Elle peut contenir des méthodes abstraites (sans implémentation) et des méthodes concrètes (avec implémentation).
- Une classe abstraite peut être utilisée comme superclasse pour créer des sous-classes spécialisées.

### 2.Déclaration d'une Classe Abstraite :

- Pour déclarer une classe abstraite, utilisez le mot-clé `abstract` avant le mot-clé `class`.
- Une classe abstraite peut contenir des champs, des constructeurs et des méthodes, tout comme une classe normale.

   ```java
   abstract class Forme {
       // Champs, constructeurs et méthodes
   }
   ```

### 3.Méthodes Abstraites :
   - Une méthode abstraite est une méthode déclarée sans implémentation dans une classe abstraite.
   - Les sous-classes doivent fournir une implémentation pour les méthodes abstraites, sinon elles deviennent à leur tour des classes abstraites.

   ```java
   abstract class Forme {
       // Méthode abstraite sans implémentation
       public abstract double calculerAire();
   }
   ```

### 4.Utilisation des Classes Abstraites :**
   - Les classes abstraites servent de modèles pour des classes dérivées.
   - Vous ne pouvez pas créer d'instances directes de classes abstraites.
   - Les sous-classes doivent implémenter toutes les méthodes abstraites héritées.

   ```java
   class Cercle extends Forme {
       private double rayon;

       public Cercle(double rayon) {
           this.rayon = rayon;
       }

       
       public double calculerAire() {
           return Math.PI * rayon * rayon;
       }
   }
   ```



### RQ
   - Les classes abstraites sont particulièrement utiles lorsque vous avez des classes partageant un comportement commun, mais nécessitant des implémentations spécifiques.
   - Les classes abstraites facilitent la maintenance et la réutilisation du code en établissant une hiérarchie de classes.

