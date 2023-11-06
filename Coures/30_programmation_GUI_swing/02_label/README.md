# cour 02 : label 

## 1. Introduction :


- **Définiton:**
    
    - Un label (`JLabel` dans Swing) est un composant utilisé pour afficher du texte ou une icône dans une interface graphique. 
    
    - Il est principalement utilisé pour **afficher des informations statiques**, des descriptions ou des titres à l'utilisateur.

- **Rôle et importance :**
    
    - Les labels jouent un rôle crucial dans l'interaction avec l'utilisateur.
    
    - Ils permettent de fournir des informations, des descriptions ou des instructions visuelles. 
    
    - Les labels servent à identifier et décrire d'autres composants de l'interface utilisateur. Par exemple, un label peut être utilisé pour décrire le but d'une zone de texte, le titre d'une fenêtre, des informations sur des boutons, etc.

- **Concepts essentiels :**

    - **Texte :** Les labels peuvent afficher du texte statique.

    - **Icônes :** En plus du texte, les labels peuvent afficher des icônes.
    
    - **Alignement :** Vous pouvez définir l'alignement du texte ou de l'icône à l'intérieur du label.
    
    - **Style du texte :** Il est possible de définir le style du texte (gras, italique, etc.) pour un label.


- **Exemple :**

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


## 2. la classe `Jlabel`: 

- La classe `JLabel` de Swing est utilisée pour afficher du **texte** ou des **icônes** dans une interface graphique. 

- **les principales méthodes:** 

    1. `JLabel(String text)`:

        - **Définition :** Crée un label avec le texte spécifié.
        - **Signature :** `public JLabel(String text)`
        - **Rôle :** Initialise un label avec le texte donné.
        - **Exemple :**
            ```java
            JLabel label = new JLabel("Exemple de texte dans le label");
            ```

    2. `setIcon(Icon image)` :

        - **Définition :** Définit l'icône à afficher dans le label.
        - **Signature :** `public void setIcon(Icon image)`
        - **Rôle :** Associe une icône spécifiée au label.
        - **Exemple :**
            ```java
            ImageIcon icon = new ImageIcon("chemin/vers/image.png");
            JLabel label = new JLabel();
            label.setIcon(icon);
            ```

    3. `setText(String text)`
        - **Définition :** Modifie le texte affiché dans le label.
        - **Signature :** `public void setText(String text)`
        - **Rôle :** Met à jour le texte du label avec le texte spécifié.
        - **Exemple :**
            ```java
            JLabel label = new JLabel("Ancien texte");
            label.setText("Nouveau texte");
        ```

    4. `setIconTextGap(int iconTextGap)` 

        - **Signature :**
            ```java
            public void setIconTextGap(int iconTextGap)
            ```

        - **Rôle :**

            - Cette méthode permet de spécifier la distance, en pixels, entre l'icône et le texte affichés dans un label. 
            
            - En ajustant cette valeur, vous pouvez contrôler l'espacement entre l'icône et le texte pour améliorer la mise en page visuelle du label.

        - **Exemple :**
            ```java
            JLabel label = new JLabel("Exemple de label");
            Icon icon = new ImageIcon("chemin/vers/icone.png");
            label.setIcon(icon);
            label.setIconTextGap(10); // Définit l'espace entre l'icône et le texte à 10 pixels
            ```


## 3. **`positionnement ` :**

### 3.1 **Introduction:**


- **Le positionnement** dans un composant `JLabel` (ou tout autre composant graphique) se réfère à la manière dont ce composant est disposé ou positionné à l'intérieur d'un conteneur, tel qu'une fenêtre.


- Le positionnement d'un composant `JLabel` implique le placement de ce composant à des coordonnées spécifiques à l'intérieur d'un conteneur parent, déterminant ainsi où il apparaîtra à l'écran.


- on peut discuter de manière générale des idées de positionnement interne et externe par rapport à l'agencement visuel des éléments d'une étiquette (`JLabel`) au sein d'un conteneur :

    - **la notion de positionnement interne:** se réfère à la manière dont le contenu (texte, icône) est disposé à l'intérieur de la JLabel, 
    
    - **le positionnement externe:** se réfère à la place de la JLabel au sein du conteneur (fenêtre, panneau), qui est généralement géré par les gestionnaires de disposition ou des méthodes de positionnement absolu.


### 3.2 **Positionnement Interne dans JLabel :**



-  **Texte et icône :**

    - **Texte :** Le positionnement interne dans une JLabel concerne principalement l'alignement et le positionnement du texte à l'intérieur de l'étiquette. Cela peut être contrôlé en utilisant des méthodes telles que `setHorizontalAlignment()` et `setVerticalAlignment()` pour gérer l'alignement horizontal et vertical du texte.
    - **Icône :** Si une icône est associée à la JLabel, il est possible de définir l'emplacement de l'icône par rapport au texte à l'aide de méthodes comme `setIconTextGap()`.

- **Positonnemt de Text par rapport à l'icon:**
    
    -  les méthodes `setHorizontalTextPosition` et `setVerticalTextPosition`  sont utilisées pour définir la position du texte par rapport à l'icône dans le label.

    

    - **Rôles :**
        
        - La méthode `setHorizontalTextPosition(int textPosition)` permet de définir la position horizontale du texte par rapport à l'icône  à l'intérieur du JLabel.

        - La méthode `setVerticalTextPosition(int textPosition)` est utilisée pour définir la position verticale du texte par rapport à l'icône  à l'intérieur du JLabel. 

    
    - **Signature :**

    ```java
    public void setHorizontalTextPosition(int textPosition);
    public void setVerticalTextPosition(int textPosition)

    ```

    - **Exemple :**

        ```java
        import javax.swing.JLabel;
        import javax.swing.SwingConstants;

        public class JLabelExample {
            public static void main(String[] args) {
                JLabel label = new JLabel("Texte");  

                label.setHorizontalTextPosition(JLabel.CENTE); 
                label.setVerticalTextPosition(JLabel.TOP); 
            
            }
        }
        ```


- **Positionnement de l'icon et texte dans le label :**

- `setHorizontalAlignment(int alignment):`

    - **Définition :** Définit l'alignement horizontal du texte ou de l'icône dans le label.

    - **Signature :** `public void setHorizontalAlignment(int alignment)`

    - **Rôle :** Aligne le texte ou l'icône horizontalement selon les constantes `SwingConstants.LEFT`, `SwingConstants.CENTER`, ou `SwingConstants.RIGHT`.

    - **Exemple :**
        ```java
        JLabel label = new JLabel("Alignement à gauche");
        label.setHorizontalAlignment(SwingConstants.LEFT);
        
        ```

- `setVerticalAlignment(int alignment):`

    - **Définition :** Définit l'alignement vertical du texte ou de l'icône dans le label.

    - **Signature :** `public void setVerticalAlignment(int alignment)`

    - **Rôle :** Aligne le texte ou l'icône verticalement selon les constantes `SwingConstants.TOP`, `SwingConstants.CENTER`, ou `SwingConstants.BOTTOM`.

    - **Exemple :**
        ```java
        JLabel label = new JLabel("Alignement en haut");
        label.setVerticalAlignment(SwingConstants.TOP);
        ``





### 3.3 **Positionnement Externe de la JLabel dans un Conteneur :**


- **Gestionnaires de disposition (Layout Managers) :**

    - Le positionnement externe de la JLabel dans un conteneur est déterminé par le conteneur lui-même et par les gestionnaires de disposition utilisés.


    -   **Les Layout Managers (gestionnaires de mise en page):** sont des classes en Java ``Swing`` utilisées pour définir la manière dont les composants graphiques (tels que les boutons, les étiquettes, les champs de texte .. etc) sont disposés à l'intérieur d'un conteneur, comme une fenêtre (JFrame).

    
    - Ils permettent de contrôler la disposition, la taille et l'alignement des composants dans une interface graphique. Chaque gestionnaire de mise en page a ses propres règles d'organisation et d'agencement des composants.







- **Positionnement absolu :** 
    
    - Dans le cas du positionnement absolu, le positionnement externe peut être contrôlé en définissant les coordonnées et les dimensions spécifiques de la JLabel via la méthode `setBounds()` .

    - `frame.setLayout(null)` est une méthode souvent utilisée pour positionner les composants de manière absolue dans un conteneur Swing, tel qu'un JFrame. Lorsque vous définissez le LayoutManager d'un conteneur à `null`, vous désactivez essentiellement le gestionnaire de mise en page par défaut. Cela signifie que vous êtes responsable de définir explicitement la position (coordonnées x et y) et la taille des composants que vous ajoutez à ce conteneur.


    - **la méthode `setBounds()`:**

        - La méthode `setBounds(int x, int y, int width, int height)` est utilisée pour définir la position et les dimensions d'un composant, tel qu'un `JLabel` dans Java Swing.

        - **Signature :**

            ```java
            public void setBounds(int x, int y, int width, int height)
            ```

            - Cette méthode prend quatre paramètres :
            - `x` : La coordonnée x qui représente la position horizontale du coin supérieur gauche du composant par rapport à son conteneur parent.
            - `y` : La coordonnée y qui représente la position verticale du coin supérieur gauche du composant par rapport à son conteneur parent.
            - `width` : La largeur du composant.
            - `height` : La hauteur du composant.


    - **Exemple d'utilisation avec `JLabel` :**

        ```java
        import javax.swing.*;

        public class JLabelSetBoundsExample {
            public static void main(String[] args) {
                JFrame frame = new JFrame("Exemple de JLabel avec setBounds");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(null); // Désactivation du Layout Manager par défaut

                JLabel label = new JLabel("Mon JLabel");
                label.setBounds(50, 50, 150, 30); // Position (50, 50) et taille (150, 30) du JLabel

                frame.add(label);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        }
        ```




### **RQ :**

- Il est important de noter que l'utilisation de `setBounds` pour placer les composants de manière absolue est déconseillée, car cela peut rendre l'interface utilisateur moins adaptable. L'utilisation des Layout Managers est généralement préférée pour créer des interfaces flexibles et adaptables à différents environnements et tailles d'écran.







## 4. **Background du Label:**

### 4.1 **Définition :**

- Le **background** d'un composant graphique tel qu'un ``JLabel`` fait référence à la zone d'arrière-plan de ce composant.

- **Pour un JLabel**, le background correspond à la zone derrière le texte affiché, celle qui n'est pas occupée par le texte ou une éventuelle icône. Il s'agit de la zone sur laquelle la couleur de fond est appliquée.


### 4.2 **Changement du couleur du Background :**


- La couleur du **background** peut être modifiée à l'aide de la méthode `setBackground(Color bg)` dans Java Swing. 

- Cette méthode permet de définir la couleur de cette zone d'arrière-plan du JLabel. 

- Par défaut, le fond d'un JLabel est transparent, mais il peut être rendu opaque en utilisant la méthode `setOpaque(true)`. Cela signifie que le fond sera visible et aura la couleur définie par `setBackground`, au lieu de laisser le fond du conteneur parent apparaître à travers le JLabel.





- **la méthode `setBackground(Color bg)` :**

    -  **Rôle :**

        - La méthode `setBackground` est utilisée pour définir la couleur de fond d'un composant, telle que `JLabel`.

    - **Signature :**

        ```java
        public void setBackground(Color bg)
        ```




- **la méthode `setOpaque(boolean isOpaque)` :**

    - **Rôle :**
        
        - La méthode `setOpaque` est utilisée pour déterminer si un composant doit rendre sa zone de fond opaque ou transparent.

    - **Signature :**

        ```java
        public void setOpaque(boolean isOpaque)
        ```


- **Exemple d'utilisation :**

    ```java
    import javax.swing.*;

    public class JLabelOpaqueExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Changer l'opacité d'un JLabel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Fond opaque");
            label.setBackground(Color.GREEN);
            label.setOpaque(true); 

            frame.add(label);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }
    }
    ```


## 5. **Style d'écriture de Text dans JLabel:**

### 5.1 **la méthode ``foreground(Color bg)``**

- La méthode `setForeground(Color fg)` de la classe `JLabel` est utilisée pour définir la couleur du texte affiché à l'intérieur du composant `JLabel`.

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

### 5.2  **changer le sytle de l'écriture:**

#### 5.2.1 : la classe `Font`:

- **Définition :**

    - La classe `Font` dans `java.awt` est utilisée pour représenter et gérer les polices de caractères dans les applications Java. 

    - Elle est principalement utilisée pour définir l'apparence du texte dans les composants graphiques tels que les JLabels, les JTextAreas, les JButtons ..etc


    - La classe `Font` représente une police de caractères dans Java, spécifiant des détails tels que :
        
        -  la famille de polices (Times New Roman, Arial, etc.), 
        
        - la taille de la police et 
        
        - le style (gras, italique, etc.).


- **Principales méthodes de la classe Font :**

    1. **Constructeur :** 
        
        - La classe `Font` possède plusieurs constructeurs permettant de créer des instances de `Font` en spécifiant différents paramètres tels que le nom de la police, le style et la taille.

        - **Exemple de constructeurs :**
            ```java
            Font myFont = new Font("Times New Roman", Font.BOLD, 14);
            Font anotherFont = new Font("Arial", Font.PLAIN, 12);
            ```

    2. **getFamily() :** Renvoie le nom de la famille de polices de caractères.

        Exemple :
        ```java
        String fontName = myFont.getFamily();
        ```

    3. **getSize() :** Renvoie la taille de la police.

        Exemple :
        ```java
        int fontSize = myFont.getSize();
        ```

    4. **getStyle() :** Renvoie le style de la police (gras, italique, normal, etc.).

        Exemple :
        ```java
        int fontStyle = myFont.getStyle();
        ```
### 5.2.2 **la méthode `setFont(Font f)`:**

- La méthode `setFont(Font font)` de la classe `JLabel` est utilisée pour définir la police de caractères (Font) à utiliser pour afficher le texte à l'intérieur du composant `JLabel`.

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


### 6. **Les Bordures de Labells:**

### 6.1 **Définition :**

- **Les bordures** dans les composants graphiques, tels que le ``JLabel``, font référence à la zone entourant le composant, permettant de délimiter visuellement son contour ou de le séparer des autres composants.

- Les bordures sont utilisées pour ajouter des détails visuels, améliorer l'esthétique et la lisibilité de l'interface utilisateur, ainsi que pour fournir des indications visuelles sur les limites et la séparation entre les composants.

### 6.2 **la classe ``Border``:**

- La classe `javax.swing.border.Border` est une classe abstraite dans Java Swing, utilisée pour définir les différentes bordures qui peuvent être appliquées aux composants graphiques pour leur donner une apparence visuelle spécifique.



- `LineBorder` :

    - La classe `javax.swing.border.LineBorder` est utilisée pour créer une bordure simple sous forme de lignes droites autour d'un composant graphique dans une interface utilisateur Java Swing.


    - **Constructeurs de LineBorder :**

        - **`LineBorder(Color color)` :** Crée une bordure de ligne avec une couleur spécifiée.
        
        - **`LineBorder(Color color, int thickness)` :** Crée une bordure de ligne avec une couleur et une épaisseur (thickness) spécifiées.

        - Une bordure simple de lignes droites.
    
    - **Exemple d'utilisation :**

        ```java
        import javax.swing.*;
        import javax.swing.border.LineBorder;
        import java.awt.Color;

        public class LineBorderExample {
            public static void main(String[] args) {
                JFrame frame = new JFrame("Exemple de LineBorder");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Bordure de ligne");
                label.setBorder(new LineBorder(Color.BLACK, 2)); // Bordure de ligne noire de 2 pixels

                frame.add(label);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        }
        ```


### 6.3 la méthode `setBorder():`

- La méthode `setBorder(Border border)` de la classe `JLabel` permet de définir une bordure pour le composant JLabel. 

- Cette bordure peut être une des différentes classes héritant de `javax.swing.border.Border`, telles que `LineBorder`, `EtchedBorder`, `BevelBorder`, etc.


- **Signature :**

```java
public void setBorder(Border border)
```


- **Exemple d'utilisation avec `LineBorder` :**

```java
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class JLabelSetBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de setBorder avec JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Texte avec bordure");
        label.setBorder(new LineBorder(Color.BLACK, 2)); // Ajout d'une bordure de type LineBorder

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
```























