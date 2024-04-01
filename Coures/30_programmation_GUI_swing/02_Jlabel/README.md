# cour 02 : **``Jlabel :``**



## 1. **Introduction :**

- **Définiton:**
    
    >Un label (`JLabel` dans Swing) est un composant utilisé pour afficher du texte ou une icône dans une interface graphique. 
    
    - Il est principalement utilisé pour **afficher des informations statiques**, des descriptions ou des titres à l'utilisateur.


- **Constructeur: `JLabel(String text)`**

    - **Définition :** Crée un label avec le texte spécifié.
    - **Signature :** `public JLabel(String text)`
    - **Exemple :**
        ```java
        Jframe frame = new JFrame()
        
        JLabel label = new JLabel("Exemple de texte dans le label");
        
        frame.add(label)
        ```



## 2.  **méthodes:**


### 2.1 `setIcon(Icon image)` :

- **Définition :** Définit l'icône à afficher dans le label.

- **Signature :** `public void setIcon(Icon image)`

- **Rôle :** Associe une icône spécifiée au label.

- **Exemple :**
    ```java
    ImageIcon icon = new ImageIcon("chemin/vers/image.png");
    JLabel label = new JLabel();
    label.setIcon(icon);
    ```

### 2.2 **`setText(String text)` :**

- **Définition :** Modifie le texte affiché dans le label.

- **Signature :** `public void setText(String text)`

- **Rôle :** Met à jour le texte du label avec le texte spécifié.

- **Exemple :**
    ```java
    JLabel label = new JLabel("Ancien texte");
    label.setText("Nouveau texte");
    ```

### 2.3 `setIconTextGap(int iconTextGap)` 

- **Description :**

    >Cette méthode permet de spécifier la distance, en pixels, entre l'icône et le texte affichés dans un label. 
    
    - En ajustant cette valeur, vous pouvez contrôler l'espacement entre l'icône et le texte pour améliorer la mise en page visuelle du label.

- **Signature :**
    ```java
    public void setIconTextGap(int iconTextGap)
    ```


- **Exemple :**
    ```java
    JLabel label = new JLabel("Exemple de label");
    Icon icon = new ImageIcon("chemin/vers/icone.png");
    label.setIcon(icon);
    label.setIconTextGap(10); // Définit l'espace entre l'icône et le texte à 10 pixels
    ```



### 2.4  `setVisible(bool)`

- **Role:**

    >La méthode `setVisible(boolean visible)` de la classe `JLabel` permet de définir la visibilité du composant. Lorsqu'elle est appelée avec `true`, le composant devient visible et lorsqu'elle est appelée avec `false`, le composant devient invisible.

- **Signature :**

    ```java
    public void setVisible(boolean visible)
    ```







## 3. **Exemple complet :**

- **Main.java :**

    ```java
    import javax.swing.ImageIcon;
    import javax.swing.JFrame;
    import javax.swing.JLabel;




    public class Main {
        public static void main(String[] args) {


            // lables :
            JLabel label = new JLabel();
            label.setText("---- Page d'accueil : -------");       
            label.setIcon(new ImageIcon("images/programmation.png"));


            

            // frame : 

            JFrame frame = new JFrame("the second frame in my live");
        
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000,1000);
            frame.add(label);            
        }    
    }

    ```




![alt text](images/image.png)













