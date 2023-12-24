# cour4 : Les Variables 

### 1.Déf :

En Java, une variable est un espace réservé en mémoire qui est utilisé pour stocker des données. Une variable a un nom qui la désigne et un type qui définit le genre de données qu'elle peut contenir. 

Voici un exemple simple de déclaration et d'utilisation d'une variable en Java :

```java
public class ExempleVariable {
    public static void main(String[] args) {
        // Déclaration et initialisation d'une variable entière
        int age = 25;

        // afficher une variable 
        System.out.prinln(age);

        // On peut chager la avleur d'une variable 

        age = 26 ;

        // Déclaration d'une variable de chaîne de caractères
        String nom;

        // Attribution d'une valeur à la variable de chaîne de caractères
        nom = "Jean";

        // Utilisation des variables pour afficher un message
        System.out.println("Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.");
    }
}
```


#### RQ : 
* Les variables en Java peuvent être modifiées (assignées avec de nouvelles valeurs) au cours de l'exécution du programme. 

* JAVA est un langage de typage static 

* Il est recommnadeé d'initalser tjrs les varaiables 

### 2.Covation de nommage :

Les types de convention de nommage les plus couramment utilisés pour les variables sont les suivants :

a. **CamelCase** : Dans la convention CamelCase, chaque mot commence par une majuscule, sauf le premier mot qui commence en minuscule. Cette convention est largement utilisée dans de nombreux langages de programmation.(JAVA , Javascript)

   Exemples :
   - `nomComplet`
   - `ageUtilisateur`
   - `montantTotal`

b. **PascalCase** : La convention PascalCase est similaire à CamelCase, sauf que le premier mot commence également par une majuscule. Cette convention est souvent utilisée pour nommer des classes et des types.(C , C#)

   Exemples :
   - `Personne`
   - `ArticleDeMagasin`
   - `TauxInteret`

c. **Snake Case** : Dans la convention snake_case, les mots sont séparés par des underscores (_) et sont généralement en minuscules. Cette convention est utilisée dans certains langages et environnements, notamment pour les noms de variables et de fonctions.(Python)

   Exemples :
   - `nom_complet`
   - `age_utilisateur`
   - `montant_total`

Ces conventions de nommage ont pour but de rendre le code plus lisible en permettant de distinguer clairement les mots dans les noms de variables, tout en fournissant des indications visuelles sur la structure et le but des éléments du code.



### 3. Porte d'une Variable : 

La portée d'une variable en Java fait référence à la partie du programme où cette variable peut être utilisée et référencée. En d'autres termes, c'est la région du code où la variable est valide et accessible.

Il existe plusieurs niveaux de portée de variable en Java :

1. **Portée de classe (ou portée globale)** : Les variables définies au niveau de la classe (en dehors de toutes les méthodes) ont une portée qui couvre toute la classe. Elles peuvent être utilisées par toutes les méthodes de cette classe.

2. **Portée de méthode (ou portée locale)** : Les variables définies à l'intérieur d'une méthode ont une portée qui se limite à cette méthode. Elles ne sont pas accessibles en dehors de la méthode.

3. **Portée de bloc** : Les variables définies à l'intérieur d'un bloc de code (par exemple, une boucle ou une structure conditionnelle) ont une portée limitée à ce bloc. Elles ne sont pas accessibles en dehors de ce bloc.

Voici un exemple pour illustrer la portée des variables en Java :

```java
public class ExemplePorteeVariable {
    // Portée de classe (globale)
    int variableGlobale = 10;

    public void uneMethode() {
        // Portée de méthode (locale)
        int variableLocale = 20;

        if (variableLocale > 15) {
            // Portée de bloc
            int variableBloc = 30;
            System.out.println(variableBloc);
        }
        // La variableBloc n'est pas accessible ici
        System.out.println(variableLocale);
    }


}
```

#### RQ :

JAVA possede une **garbage collecetr** ie : qui il va se lui meme se charger de supprimer et de liberer la memeoire proprement .


### 4. Les constantes en JAVA :

En Java, une constante est une variable dont la valeur ne peut pas être modifiée une fois qu'elle a été définie. 

Les constantes sont utilisées pour stocker des valeurs qui ne devraient pas changer pendant l'exécution du programme. Dans Java, les constantes sont souvent définies en tant que membres statiques et finaux d'une classe.

Pour déclarer et utiliser des constantes en Java, suivez ces étapes :

a. Définir la constante en tant que membre statique final de la classe. Utilisez le mot-clé `static final` pour déclarer la constante, ainsi que la convention de nommage en lettres majuscules avec des underscores pour séparer les mots.

b. Assigner une valeur à la constante lors de sa déclaration ou dans un bloc d'initialisation statique.

c. Utiliser la constante en référençant son nom dans le code.

Voici un exemple simple de déclaration et d'utilisation d'une constante en Java :

```java
public class ConstantesExemple {
    // Déclaration d'une constante
    public static final double TAUX_INTERET = 0.05;

    public static void main(String[] args) {
        double montant = 1000.0;
        double interet = montant * TAUX_INTERET;

        System.out.println("Montant : " + montant);
        System.out.println("Intérêt : " + interet);
    }
}
```




