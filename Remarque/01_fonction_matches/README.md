# la fonction `matches()` en java 


- En Java, la fonction `matches` est une méthode de la classe `String` qui est utilisée pour vérifier si une chaîne correspond à une expression régulière donnée. 

- Elle retourne un booléen (`true` ou `false`) en fonction de la correspondance de la chaîne avec l'expression régulière spécifiée.


- la signature de la méthode `matches` de la classe `String` :

    ```java
    public boolean matches(String regex)
    ```

    - **Paramètre :** `regex` est une expression régulière, c'est-à-dire un motif de recherche utilisé pour décrire un ensemble de chaînes.
    - **Résultat :** La méthode retourne `true` si la chaîne correspond entièrement à l'expression régulière spécifiée, sinon elle retourne `false`.


- Exemple d'utilisation de la méthode `matches` :

```java
String texte = "Bonjour123";
boolean correspondance = texte.matches("[a-zA-Z]+\\d+");

System.out.println(correspondance); // Résultat : false (car "Bonjour123" contient des lettres et des chiffres)
```

Dans cet exemple, l'expression régulière `[a-zA-Z]+\\d+` est utilisée pour vérifier si la chaîne `texte` contient au moins une lettre suivie par un ou plusieurs chiffres. Comme la chaîne `texte` est "Bonjour123" (une combinaison de lettres et de chiffres), la méthode `matches` retourne `false`.

Il est important de noter que la méthode `matches` vérifie l'ensemble complet de la chaîne par rapport à l'expression régulière. Si une partie de la chaîne correspond à l'expression régulière mais pas toute la chaîne, la méthode retournera `false`.