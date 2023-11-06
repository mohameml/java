# cour 14 : les Paquets (Packages) en Java


**1.Définiton :**

- les paquets (packages) sont utilisés pour organiser et regrouper des classes, interfaces et autres éléments connexes en modules logiques. 

- Les paquets jouent un rôle essentiel dans la gestion de la structure et de la hiérarchie des classes dans les projets Java. 

- Ils aident à éviter les conflits de noms et à améliorer la lisibilité et la maintenance du code.

- Cette structuration a trois intérêts :

    - permettre la modularité, séparation plus claire des différentes parties de l'application ;
    - éviter les conflits de noms (en fournissant un espace de nommage) ;
    - limiter la visibilité des classes.


**2. Visibilté :**

- La visibilité en Java fait référence à la portée des classes, méthodes, champs (variables de classe), et constructeurs dans un programme Java. 

- Elle détermine quelles parties du code peuvent accéder à ces éléments et quelles parties ne le peuvent pas. 

- En Java, il existe quatre niveaux de visibilité, définis à l'aide de modificateurs d'accès :

1. **Public (`public`) :**
   - Les éléments déclarés comme `public` sont accessibles depuis n'importe quel endroit dans le code, y compris en dehors du package (l'unité de regroupement des classes en Java).
   - C'est le niveau de visibilité le plus permissif.

   Exemple :
   ```java
   public class MaClasse {
       public int monChamp;
       public void maMethode() {
           // Le code peut être accédé de n'importe où.
       }
   }
   ```

2. **Protégé (`protected`) :**
   - Les éléments déclarés comme `protected` sont accessibles depuis la classe elle-même, les sous-classes (y compris celles situées dans d'autres packages), et les classes du même package.
   - Les éléments `protected` sont souvent utilisés dans le contexte de l'héritage.

   Exemple :
   ```java
   public class MaClasse {
       protected int monChamp;
       protected void maMethode() {
           // Le code peut être accédé depuis les sous-classes et les classes du même package.
       }
   }
   ```

3. **Par défaut (package-private) :**
   - Si aucun modificateur d'accès n'est spécifié (c'est-à-dire, aucun mot-clé comme `public`, `protected`, ou `private`), la visibilité par défaut s'applique.
   - Les éléments avec une visibilité par défaut sont accessibles uniquement depuis les classes du même package.

   Exemple :
   ```java
   class MaClasse {
       int monChamp;  // Équivalent à "package-private"
       void maMethode() {
           // Le code peut être accédé uniquement depuis les classes du même package.
       }
   }
   ```

4. **Privé (`private`) :**
   - Les éléments déclarés comme `private` sont accessibles uniquement depuis la classe elle-même. Ils ne sont pas visibles en dehors de la classe.
   - C'est le niveau de visibilité le plus restrictif.

   Exemple :
   ```java
   public class MaClasse {
       private int monChamp;
       private void maMethode() {
           // Le code ne peut être accédé que depuis la classe elle-même.
       }
   }
   ```


- **Tableau qui résume la visibilité :**

| Niveau de Visibilité | Classes des Autres Paquetages | Sous-Classes | Autres Classes, Même Paquetage | Intérieur de la Classe |
|-----------------------|------------------------------|-------------|--------------------------------|------------------------|
| public (+)           | ✔                          | ✔           | ✔                            | ✔                    |
| protected (#)        | ✘                          | ✔           | ✔                            | ✔                    |
| Par défaut ()        | ✘                          | ✘           | ✔                            | ✔                    |
| private (-)          | ✘                          | ✘           | ✘                            | ✔                    |


- ✔ : accès possible (lecture et écriture)

- ✘ : accès interdit (lecture et écriture)


**3. Déclaration de Paquets:**

Pour déclarer une classe dans un paquet, vous utilisez la déclaration `package` au début du fichier source de la classe. Par exemple, si vous voulez déclarer une classe `MaClasse` dans le paquet `com.monprojet`, vous pouvez le faire comme ceci :

```java
package com.monprojet;

public class MaClasse {
    // ...
}
```

**4.Importation de Paquets:**

Pour utiliser des classes d'autres paquets, vous devez les importer dans votre code. Vous pouvez utiliser l'instruction `import` pour importer une classe spécifique ou un paquet entier. Par exemple :

```java
import java.util.ArrayList;
import java.util.List;
```



**5. Paquets Standard:**

Les paquets standard en Java, également appelés bibliothèques standard ou API (Application Programming Interface), sont des ensembles de classes et de packages pré-définis qui font partie intégrante de la plateforme Java. 

Voici quelques-uns des paquets standard les plus couramment utilisés en Java :

- ``java.lang``:

Ce paquet est automatiquement importé dans tous les programmes Java, ce qui signifie que vous n'avez pas besoin d'importer explicitement ses classes. Il contient des classes de base qui sont largement utilisées dans la programmation Java, telles que `String`, `Object`, `System`, `Math`, etc.

- ``java.util`` :

Ce paquet contient diverses classes et interfaces liées aux utilitaires, aux collections, aux dates et heures, aux entrées/sorties, et plus encore. Parmi les classes populaires de ce paquet, on trouve `ArrayList`, `HashMap`, `Date`, `Calendar`, `Scanner`, etc.

- ``java.io``:

Ce paquet fournit des classes pour les opérations d'entrée/sortie (I/O), telles que la lecture et l'écriture de fichiers, les flux d'entrée et de sortie, les sérialisations, etc. Des classes comme `File`, `FileInputStream`, `FileOutputStream`, `BufferedReader`, `BufferedWriter`, etc., font partie de ce paquet.



- ``java.awt et javax.swing:``

Ces paquets sont utilisés pour la création d'interfaces graphiques (GUI). `java.awt` contient des classes pour la création d'éléments d'interface utilisateur de base, tandis que `javax.swing` offre des composants plus avancés et modernes.

- ``java.math:``

Ce paquet fournit des classes pour la manipulation de valeurs numériques de grande précision (arbitraire). Il inclut des classes telles que `BigInteger` (entiers de grande taille) et `BigDecimal` (nombres à virgule flottante de grande précision).



### RQ :**Conventions de Nommage:**

Les noms de paquets Java sont généralement écrits en minuscules pour éviter les problèmes de portabilité entre systèmes d'exploitation. Les noms de paquets doivent être des identifiants valides en Java.

### RQ :

- Dès qu'une classe fait partie d'un paquetage, elle change de nom et porte en préfixe le nom du paquetage:

Ainsi par exemple, la classe ``Pangolin`` ci-dessus s'appelle désormais ``fr.ensimag.animaux.Pangolin`` (par exemple ).

-  Pour utiliser cette classe, il faut donc :
    
    - soit utiliser son nom complet (on dit aussi nom qualifié) ``fr.ensimag.animaux.Pangolin`` ;

    -  soit ajouter en début de fichier  une instruction d'importation de la classe : ``import fr.ensimag.animaux.Pangolin`` ,Si cette ligne est présente au début du fichier, alors on pourra utiliser le nom court (``Pangolin``) dans tout le fichier.