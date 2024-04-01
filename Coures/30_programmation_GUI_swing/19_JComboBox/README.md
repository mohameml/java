

Une JComboBox est un composant Swing permettant de créer une liste déroulante déroulante à partir de laquelle les utilisateurs peuvent sélectionner un élément. Voici un exemple simple d'utilisation de JComboBox :

```java
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");

        // Créer un tableau de chaînes pour les éléments de la JComboBox
        String[] options = { "Option 1", "Option 2", "Option 3", "Option 4", "Option 5" };

        // Créer une JComboBox avec les éléments du tableau
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Ajouter la JComboBox à la fenêtre
        frame.add(comboBox);

        // Configurer la taille de la fenêtre et rendre visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

Dans cet exemple, nous avons créé une fenêtre Swing simple avec une JComboBox. Les éléments de la JComboBox sont définis à l'aide d'un tableau de chaînes. L'utilisateur peut sélectionner un élément de la liste déroulante en cliquant dessus et en choisissant parmi les options disponibles.