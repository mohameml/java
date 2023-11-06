# cour 03 : Panels 

## 1. Introduction :

- **défintion:**

    - Un `JPanel` en Swing est une classe héritant de `javax.swing.JPanel` qui représente un conteneur léger, flexible et redimensionnable utilisé pour organiser et regrouper d'autres composants graphiques (boutons, étiquettes, champs de texte, etc.) au sein d'une interface utilisateur.


    - Le `JPanel` est utilisé pour organiser visuellement les composants d'une interface graphique. Il peut servir à diviser l'interface en zones logiques, à regrouper des composants similaires, ou à créer des sections distinctes dans une fenêtre Swing.


- **Le rôle principal d'un `JPanel` inclut :**

    - **Organisation des Composants :** Permet de regrouper les composants graphiques dans des sections logiques, facilitant la mise en page et la gestion.
    
    - **Gestion de Conteneurs :** Le `JPanel` peut être contenu dans d'autres conteneurs tels que `JFrame`, `JDialog`, ou un autre `JPanel`.
    
    - **Personnalisation :** Il permet de personnaliser les composants en définissant des arrière-plans, des bordures, des dispositions, etc.


## 2. la classe `JPanel`:



- **Définition :**

    - **La classe `JPanel`:** de Java Swing est un conteneur léger permettant d'organiser et de regrouper des composants graphiques. 

    - La classe `JPanel` est une classe héritant de `javax.swing.JPanel`, utilisée pour créer un conteneur dans une interface graphique Java Swing. Il est léger, flexible et peut contenir d'autres composants graphiques pour organiser visuellement une interface utilisateur.


- **Utilisation :** Le `JPanel` est utilisé pour :

    - **Organiser les composants :** Regroupe et organise les composants graphiques.
    
    - **Créer des sections distinctes :** Permet de diviser l'interface utilisateur en zones logiques.

    - **Personnaliser l'apparence :** Permet de définir des couleurs d'arrière-plan, des dispositions, des bordures, etc.


- **Principales méthodes :**

    1. **Constructeur : `JPanel()`**
        - **Rôle :** Crée un nouveau JPanel sans aucun composant.
        - **Signature :** `public JPanel()`
        - **Exemple :** 
        ```java
        JPanel panel = new JPanel();
        ```

    2. **`add(Component comp)`**
        - **Rôle :** Ajoute un composant au JPanel.
        - **Signature :** `public Component add(Component comp)`
        - **Exemple :** 
        ```java
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Mon label");
        panel.add(label);
        ```

    3. **`setBackground(Color bg)`**
        - **Rôle :** Définit la couleur d'arrière-plan du JPanel.
        - **Signature :** `public void setBackground(Color bg)`
        - **Exemple :** 
        ```java
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        ```

    4. **`setLayout(LayoutManager manager)`**
        - **Rôle :** Définit le `LayoutManager` pour organiser les composants à l'intérieur du JPanel.
        - **Signature :** `public void setLayout(LayoutManager manager)`
        - **Exemple :** 
        ```java
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ```

    5. **`setBorder(Border border)`**
        - **Rôle :** Ajoute une bordure spécifiée au JPanel.
        - **Signature :** `public void setBorder(Border border)`
        - **Exemple :** 
        ```java
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ```

    6. **`setBounds(int x, int y, int width, int height)`:**
        
        - **Role:**La méthode `setBounds(int x, int y, int width, int height)` est  utilisée pour définir la position et la taille d'un composant à l'intérieur de son conteneur.
        
        - **Signature:**
            ```java
            setBounds(int x, int y, int width, int height)
            ```

        - **Exemple:**

            ```java
            import javax.swing.*;

            public class JPanelSetBoundsExample {
                public static void main(String[] args) {
                    JFrame frame = new JFrame("Exemple de setBounds avec JPanel");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel panel = new JPanel();
                    panel.setLayout(null); // Désactivation du Layout Manager pour utiliser setBounds

                    JButton button = new JButton("Mon Bouton");
                    button.setBounds(50, 50, 100, 30); // Position (50, 50) et taille (100, 30) du bouton à l'intérieur du JPanel

                    panel.add(button);
                    frame.add(panel);
                    frame.setSize(300, 200);
                    frame.setVisible(true);
                }
            }
            ```


