# cour 6 : Les conditions en JAVA 

Les conditions en Java permettent de prendre des décisions dans le code en fonction de certaines conditions spécifiées. Les structures de contrôle conditionnelles vous permettent d'exécuter des blocs de code en fonction de la véracité ou de la fausseté d'expressions booléennes.

Voici un résumé des principales structures de contrôle conditionnelles en Java, avec des exemples :

1. **Instruction `if` :**
   L'instruction `if` exécute un bloc de code si une condition est vraie.

   Exemple :

   ```java
   int age = 18;
   if (age >= 18) {
       System.out.println("Vous êtes majeur.");
   }
   ```

2. **Instruction `if-else` :**
   L'instruction `if-else` exécute un bloc de code si la condition est vraie et un autre bloc de code si la condition est fausse.

   Exemple :

   ```java
   int age = 15;
   if (age >= 18) {
       System.out.println("Vous êtes majeur.");
   } else {
       System.out.println("Vous êtes mineur.");
   }
   ```

3. **Instruction `if-else if-else` :**
   L'instruction `if-else if-else` permet de gérer plusieurs conditions et d'exécuter le bloc de code correspondant à la première condition vraie.

   Exemple :

   ```java
   int note = 75;
   if (note >= 90) {
       System.out.println("Très bien");
   } else if (note >= 80) {
       System.out.println("Bien");
   } else if (note >= 70) {
       System.out.println("Assez bien");
   } else {
       System.out.println("Pas terrible");
   }
   ```

4. **Opérateur ternaire :**
   L'opérateur ternaire (`condition ? valeurSiVrai : valeurSiFaux`) permet de retourner une valeur en fonction d'une condition.

   Exemple :

   ```java
   int age = 20;
   String message = (age >= 18) ? "Majeur" : "Mineur";
   System.out.println("Statut : " + message);
   ```

5. **Instruction `switch` :**
   L'instruction `switch` permet d'effectuer différentes actions en fonction de la valeur d'une expression.

   Exemple :

   ```java
   int jour = 3;
   switch (jour) {
       case 1:
           System.out.println("Lundi");
           break;
       case 2:
           System.out.println("Mardi");
           break;
       // ...
       default:
           System.out.println("Jour inconnu");
   }
   ```
### RQ :


En JAVA le **switch** fonction aussi pour les chaine des caractéres.

