# cour 04 : **Buttons**

## 1. **Introduction**

- **Définition:**
    
    - Le composant `JButton` dans Java Swing est un bouton graphique interactif qui peut être cliqué pour déclencher des actions dans une interface utilisateur.

    - Un `JButton` est un composant Swing utilisé pour créer des boutons interactifs dans une interface graphique Java. 
    
    - Il peut être cliqué par l'utilisateur pour déclencher des actions associées.


- **Caractéristiques :**

    - **Texte ou Icône :** Un `JButton` peut afficher du texte, des icônes ou les deux.
   
    - **Écouteurs d'événements :** Permet de réagir à des événements tels que les clics de souris (`ActionListener`).
   
    - **Personnalisable :** Peut être personnalisé avec des polices, des couleurs, des bords, des images, etc.
   
    - **Comportement standard :** Gère les interactions utilisateur standard, comme le survol et le clic.

## 2. **la classe `JButton`:**


- **Définition:**

    - La classe `JButton` est un composant graphique de Java Swing, héritée de la classe `AbstractButton`, utilisée pour créer des boutons interactifs dans une interface utilisateur. 


    - Un `JButton` est un composant graphique qui représente un bouton interactif permettant à l'utilisateur de déclencher des actions dans une interface graphique Java.



- **Principales méthodes :**

    1. **Constructeur : `JButton(String text)`**
        - **Rôle :** Crée un bouton avec un texte spécifié.
        - **Signature :** `public JButton(String text)`
        - **Exemple :** 
        ```java
        JButton button = new JButton("Cliquez-moi");
        ```

    2. **`addActionListener(ActionListener listener)`:**


        - **Rôle :**
            
            - La méthode `addActionListener(ActionListener listener)` de la classe `JButton` permet d'ajouter **un écouteur d'événements** pour détecter les clics sur le bouton. 

            - L'interface `ActionListener` est utilisée pour gérer les événements liés à des actions, en particulier le clic sur le bouton.

            - Lorsque le bouton reçoit un clic, tous les écouteurs enregistrés sont notifiés et la méthode `actionPerformed(ActionEvent e)` de l'`ActionListener` est appelée.
        
        - **Signature :**
            ```java
            public void addActionListener(ActionListener listener)
            ```


        - **Utilisation:**

            -  **Implementation de l'interface ActionListener:**    

                ```java
                import java.awt.event.ActionEvent;
                import java.awt.event.ActionListener;
                import javax.swing.JButton;
                import javax.swing.JFrame;

                public class MyFrame extends JFrame implements ActionListener{
                    

                    JButton button ;

                    public MyFrame(int L , int l)
                    {
                        // label :


                        button = new JButton();
                        button.setBounds(100,100,250,100);
                        button.addActionListener(this);

                        // frame :
                        this.setSize(l ,L);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.setVisible(true);
                        this.setLayout(null);
                        this.add(button);
                        this.add(label);
                    }



                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if(e.getSource()==button)
                        {
                            //System.out.println("Hello world from the buton:");
                            label.setVisible(true);
                            // button.setEnabled(false);
                        }
                    }



                }
                
                ```

            
            - **expression lambda :**

                ```java
                import java.awt.event.ActionEvent;
                import java.awt.event.ActionListener;
                import javax.swing.JButton;
                import javax.swing.JFrame;

                public class MyFrame extends JFrame implements ActionListener{
                    

                    JButton button ;

                    public MyFrame(int L , int l)
                    {
                        // label :


                        button = new JButton();
                        button.setBounds(100,100,250,100);
                        button.addActionListener( e-> System.out.println("Button :!!!"));

                        // frame :
                        this.setSize(l ,L);
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.setVisible(true);
                        this.setLayout(null);
                        this.add(button);
                        this.add(label);
                    }

                }
                
                ```






    3. **`setText(String text)`**
        - **Rôle :** Définit le texte du bouton.
        - **Signature :** `public void setText(String text)`
        - **Exemple :** 
        ```java
        button.setText("Nouveau texte du bouton");
        ```

    4. **`setIcon(Icon icon)`**
        - **Rôle :** Définit une icône pour le bouton.
        - **Signature :** `public void setIcon(Icon icon)`
        - **Exemple :** 
        ```java
        ImageIcon icon = new ImageIcon("chemin/vers/icone.png");
        button.setIcon(icon);
        ```

    5. **`setEnabled(boolean enabled)`**
        - **Rôle :** Active ou désactive le bouton.
        - **Signature :** `public void setEnabled(boolean enabled)`
        - **Exemple :** 
        ```java
        button.setEnabled(false); // Désactive le bouton
        ```



    6. **`setBounds()`**
        - **Rôle :** Définit la position et la taille du bouton dans le conteneur parent.
        - **Signature :** `public void setBounds(int x, int y, int width, int height)`
        - **Exemple :** `button.setBounds(100, 100, 250, 100);` définit la position x=100, y=100 et la taille de 250x100 pixels.




    7. **`setFocusable(false)`**
        - **Rôle :** Désactive pu active la possibilité de sélectionner le bouton avec le clavier.
        - **Signature :** `public void setFocusable(boolean focusable)`
        - **Exemple :** 
            ```java
            button.setFocusable(false); // empêche le bouton d'être sélectionné avec le clavier.
                    
            ```


    8. **`setHorizontalTextPosition()`**
        - **Rôle :** Définit la position horizontale du texte par rapport à l'icône (s'il y en a une).
        - **Signature :** `public void setHorizontalTextPosition(int textPosition)`
        - **Exemple :** 

            ```java
            button.setHorizontalTextPosition(JButton.CENTER); // place le texte au centre par rapport à l'icône.

            ```

    9. **`setVerticalTextPosition()`**
        - **Rôle :** Définit la position verticale du texte par rapport à l'icône (s'il y en a une).
        - **Signature :** `public void setVerticalTextPosition(int textPosition)`
        - **Exemple :** 

            ```java
            button.setVerticalTextPosition(JButton.CENTER); //  positionne le texte en bas par rapport à l'icône.

            ```

    10. **`setFont():`**
        - **Rôle :** Définit la police de caractères pour le texte du bouton.
        - **Signature :** `public void setFont(Font font)`
        - **Exemple :** 
            ```java
            button.setFont(new Font("Comic Sans", Font.ITALIC, 20)); // applique la police "Comic Sans" en italique avec une taille de 20.
            
            ```

    11. **`setIconTextGap()`**
        - **Rôle :** Définit l'espacement entre l'icône et le texte.
        - **Signature :** `public void setIconTextGap(int iconTextGap)`
        - **Exemple :** `

            ```java
            button.setIconTextGap(5); //  établit un espacement de 5 pixels entre l'icône et le texte.

            ```
    12. **`setForeground()`**
        - **Rôle :** Définit la couleur du texte du bouton.
        - **Signature :** `public void setForeground(Color fg)`
        - **Exemple :** `button.setForeground(Color.BLUE);` définit la couleur du texte en bleu.

    13. **`setBackground()`**
        - **Rôle :** Définit la couleur de l'arrière-plan du bouton.
        - **Signature :** `public void setBackground(Color bg)`
        - **Exemple :** `button.setBackground(Color.YELLOW);` définit la couleur d'arrière-plan en jaune.

    14. **`setBorder()`**
        - **Rôle :** Définit une bordure pour le bouton .
        - **Signature :** `public void setBorder(Border border)`
        - **Exemple :** 
            ```java
            button.setBorder(new LineBorder(Color.RED, 5)); //  définit une bordure de ligne rouge de 5 pixels d'épaisseur.
        ```


## 3. Afficher `JLabel` à partir `JButton`:

- Pour afficher un `JLabel` après un clic sur un `JButton`, vous pouvez utiliser `JButton.addActionListener` pour déclencher l'affichage d'un `JLabel`.


- **la méthode `setVisible` :**

    - **Role:**

        - La méthode `setVisible(boolean visible)` de la classe `JLabel` permet de définir la visibilité du composant. Lorsqu'elle est appelée avec `true`, le composant devient visible et lorsqu'elle est appelée avec `false`, le composant devient invisible.

    - **Signature :**

        ```java
        public void setVisible(boolean visible)
        ```

    - **Exemple d'utilisation :**

        Dans l'exemple ci-dessous, on utilise `setVisible` pour rendre un `JLabel` visible ou invisible lorsqu'un bouton est cliqué :

        ```java
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        public class JLabelSetVisibleExample {
            public static void main(String[] args) {
                JFrame frame = new JFrame("Exemple JLabel setVisible");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton button = new JButton("Cliquez pour afficher le label");
                JLabel label = new JLabel("Label à afficher");

                label.setVisible(false); // Le JLabel est initialement invisible

                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        label.setVisible(true); // Rend le JLabel visible après le clic sur le bouton
                    }
                });

                frame.setLayout(null); // Pour un positionnement absolu
                button.setBounds(50, 50, 250, 30);
                label.setBounds(50, 100, 250, 30);

                frame.add(button);
                frame.add(label);
                frame.setSize(400, 200);
                frame.setVisible(true);
            }
        }
        ```

        Dans cet exemple, lorsque le bouton est cliqué, la méthode `label.setVisible(true)` est appelée, rendant ainsi le `JLabel` visible dans la fenêtre.