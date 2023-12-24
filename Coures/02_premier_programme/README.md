# Cour 02 : Mon premier programme en java 

```java
// Mon premier programme en java 

class MainApp 
{
    public static void main(String[] args)
    {
        System.out.println("Bonjur tout le mond! ");
    }
}

```

1.**Déclaration de la classe** :
   ```java
   class MainApp
   ```

Le code commence par déclarer une classe Java appelée "MainApp". En Java, chaque programme doit être écrit à l'intérieur d'une classe. Le nom de la classe doit correspondre au nom du fichier source Java.

2. Méthode main :
   ```java
   public static void main(String[] args)
   ```

La méthode "main" est la méthode principale d'un programme Java. Lorsque vous exécutez un programme Java, le programme commence par exécuter la méthode "main". Elle doit être définie avec exactement cette signature pour que le programme puisse être exécuté.

   - "public": C'est un modificateur d'accès qui indique que la méthode est accessible depuis n'importe où dans le programme.
   - "static": C'est un modificateur de méthode qui signifie que la méthode appartient à la classe plutôt qu'à une instance spécifique de la classe. Cela permet d'appeler directement la méthode sans avoir à créer d'objet de la classe.
   - "void": C'est le type de retour de la méthode "main". "void" signifie que la méthode ne renvoie pas de valeur.
   - "main": C'est le nom de la méthode principale. C'est le point de départ du programme.

3. Paramètre "args" :
   ```java
   (String[] args)
   ```
   "args" est le nom du paramètre de la méthode "main". C'est un tableau de chaînes de caractères (strings) qui peut être utilisé pour passer des arguments à votre programme au moment de l'exécution. Dans ce cas, il n'est pas utilisé, mais il est souvent utilisé pour recevoir des arguments en ligne de commande.

4. Instructions dans la méthode main :
   ```java
   System.out.println("Bonjour tout le monde ! ");
   ```
   Cette ligne de code utilise la classe "System" pour afficher le message "Bonjour tout le monde !" sur la console.

   - "System": C'est une classe Java intégrée qui fournit des méthodes et des propriétés pour interagir avec le système.
   - "out": C'est un objet de type "PrintStream" qui représente le flux de sortie standard (la console).
   - "println": C'est une méthode de l'objet "out" qui affiche une chaîne de caractères suivie d'un saut de ligne.

Ainsi, lorsque vous exécutez ce programme, la méthode "main" sera appelée, et la chaîne de caractères "Bonjour tout le monde ! " sera affichée sur la console.