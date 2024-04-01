# cour 05 : **Style de Text**


## 1. **Style d'écriture de Text dans ``JLabel``:**

### 1.1 **la méthode ``setForeground(Color bg)``**

- **Description:**

    >La méthode `setForeground(Color fg)` de la classe `JLabel` est utilisée pour définir la couleur du texte affiché à l'intérieur du composant `JLabel`.

- **Signature :**

    ```java
    public void setForeground(Color fg)
    ```


- **Exemple d'utilisation :**

    ```java
    import javax.swing.*;
    import java.awt.Color;

    public class JLabelSetForegroundExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Exemple de JLabel avec setForeground");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Texte coloré");
            label.setForeground(Color.RED); // Définit la couleur du texte en rouge

            frame.add(label);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }
    }
    ```



### 1.2 **la méthode `setFont(Font f)`:**

- **Description:**

    >La méthode `setFont(Font font)` de la classe `JLabel` est utilisée pour définir la police de caractères (``Font``) à utiliser pour afficher le texte à l'intérieur du composant `JLabel`.

- **Signature :**

    ```java
    public void setFont(Font font)
    ```

- **Exemple d'utilisation :**

    ```java
    import javax.swing.*;
    import java.awt.Font;

    public class JLabelSetFontExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Exemple de JLabel avec setFont");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Texte avec une police spécifique");
            Font myFont = new Font("Arial", Font.BOLD, 18); // Création d'une police de caractères
            label.setFont(myFont); // Affectation de la police au JLabel

            frame.add(label);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }
    }
    ```