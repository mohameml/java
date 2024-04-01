

Un JTextField est un composant graphique de base de Java Swing permettant à l'utilisateur de saisir du texte à partir du clavier. Voici un exemple simple d'utilisation de JTextField :

```java
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");

        // Créer un JTextField avec une colonne de largeur
        JTextField textField = new JTextField(20);

        // Ajouter le JTextField à la fenêtre
        frame.add(textField);

        // Configurer la taille de la fenêtre et rendre visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

Dans cet exemple, nous avons créé une fenêtre Swing simple avec un JTextField. La largeur du JTextField est définie sur 20 colonnes (ce qui affecte la largeur du champ de texte, mais pas le nombre de caractères qu'il peut contenir). Vous pouvez saisir du texte dans ce champ en exécutant le programme.