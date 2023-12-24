# cour 7 : Les Boucles 



Les boucles sont des structures de contrôle essentielles qui permettent de répéter des instructions ou des blocs de code plusieurs fois, en fonction d'une condition donnée. 

**1. La boucle "for"**
- La boucle "for" est utilisée pour exécuter un bloc de code un nombre prédéfini de fois.
- Sa syntaxe comprend un initialisateur, une condition et une mise à jour, qui sont évalués à chaque itération.
- Exemple :
  ```java
  for (int i = 0; i < 5; i++) {
      // Code à exécuter
  }
  ```

**2. La boucle "while"**
- La boucle "while" exécute un bloc de code tant qu'une condition spécifiée est vraie.
- La condition est vérifiée avant chaque itération, ce qui signifie que le bloc de code peut ne pas être exécuté du tout.
- Exemple :
  ```java
  int count = 0;
  while (count < 10) {
      // Code à exécuter
      count++;
  }
  ```

**3. La boucle "do-while"**
- La boucle "do-while" est similaire à la boucle "while", mais la condition est vérifiée après chaque itération. Cela garantit que le bloc de code est exécuté au moins une fois.
- Exemple :
  ```java
  int num = 0;
  do {
      // Code à exécuter
      num++;
  } while (num < 3);
  ```

**4. Utilisation des mots-clés "break" et "continue"**
- Le mot-clé "break" est utilisé pour sortir prématurément d'une boucle, que ce soit une boucle "for", "while" ou "do-while". Il permet de mettre fin à l'exécution de la boucle et de passer à la suite du programme.
- Le mot-clé "continue" est utilisé pour interrompre l'itération en cours et passer à l'itération suivante de la boucle.
- Exemple d'utilisation de "break" :
  ```java
  for (int i = 0; i < 10; i++) {
      if (i == 5) {
          break; // Sort de la boucle lorsque i atteint 5
      }
      // Code à exécuter
  }
  ```
- Exemple d'utilisation de "continue" :
  ```java
  for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
          continue; // Passe à l'itération suivante si i est pair
      }
      // Code à exécuter pour les valeurs impaires de i
  }
  ```
