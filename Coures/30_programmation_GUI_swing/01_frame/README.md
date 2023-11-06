# cour 30 : Swing


## 1. **Introduction** :

- **Définition:**

    - Swing est une bibliothèque graphique pour le développement d'interfaces utilisateur (GUI) en Java. 

    - Elle fait partie du kit de développement logiciel Java (JDK) et offre une plateforme robuste pour la création d'applications graphiques interactives.


- **GUI (Graphical User Interface) :** 
    
    - *Une interface utilisateur graphique:* permet à l'utilisateur d'interagir avec un programme via des éléments graphiques tels que fenêtres, boutons, menus déroulants, boîtes de dialogue, etc. Swing facilite la création de ces éléments graphiques.


- **Composants Swing :** 
    
    - Swing propose une grande variété de composants : 
        
        - des fenêtres (JFrame), 
        
        - des boutons (JButton), 
        
        - des zones de texte (JTextField), 
        
        - des menus (JMenu) ..etc 



- **Portabilité :** 
    
    - L'un des principaux avantages de Swing est sa portabilité. 
    
    - Les applications développées avec Swing sont indépendantes de la plateforme, ce qui signifie qu'elles peuvent fonctionner sur différentes plates-formes sans modifications majeures.




## 2. **frames** : 

### 2.1 la classe `JFrame` :

- **Définition :**
    
    - `JFrame` est une classe de Swing, située dans le package `javax.swing`. 
    
    - Elle représente une fenêtre avec des bordures, des barres de titre et des boutons de contrôle pour minimiser, maximiser et fermer. 
    
    - Elle est un composant essentiel pour la création d'applications GUI avancées en Java.

    - Le rôle principal de la classe `JFrame` est de fournir une fenêtre rectangulaire où vous pouvez ajouter d'autres composants graphiques (boutons, zones de texte, panneaux, etc.) pour créer des interfaces utilisateur interactives.


- **Principales méthodes :**

    0. **Constructeurs :**
        - `JFrame()`: Constructeur par défaut pour créer un objet `JFrame`.
        - `JFrame(String title)`: Constructeur pour définir le titre de la fenêtre.

        - **Exemple :**
            ```java
            JFrame frame = new JFrame("Ma Fenêtre");
            ```



    1. `setVisible(boolean b)` :
        - **Définition :** Cette méthode permet de rendre la fenêtre visible ou invisible en fonction de la valeur booléenne fournie.
        - **Signature :** `public void setVisible(boolean b)`
        - **Rôle :** Lorsque cette méthode est appelée avec `true`, la fenêtre devient visible. Si elle est appelée avec `false`, la fenêtre devient invisible.
        - **Exemple :**
            ```java
            JFrame frame = new JFrame("Ma Fenêtre");
            frame.setVisible(true); // Rend la fenêtre visible
            ```

    2. `setTitle(String title)` :
        - **Définition :** Cette méthode permet de définir le titre de la fenêtre.
        - **Signature :** `public void setTitle(String title)`
        - **Rôle :** Cette méthode affecte le titre de la fenêtre avec la chaîne de caractères fournie en argument.
        - **Exemple :**
            ```java
            frame.setTitle("Ma Fenêtre Principale"); // Définit le titre de la fenêtre
            ```

    3. `setSize(int width, int height)` :
        - **Définition :** Cette méthode détermine la taille de la fenêtre en pixels.
        - **Signature :** `public void setSize(int width, int height)`
        - **Rôle :** Elle définit la largeur et la hauteur de la fenêtre en pixels.
        - **Exemple :**
            ```java
            frame.setSize(800, 600); // Définit la taille de la fenêtre à 800x600 pixels
            ```

    4. `setIconImage(Image image)` :
        - **Définition :** Cette méthode définit l'icône associée à la fenêtre.
        - **Signature :** `public void setIconImage(Image image)`
        - **Rôle :** Elle associe une image donnée en argument à l'icône de la fenêtre.
        - **Exemple :**
            
            ```java
                ImageIcon image = new ImageIcon("../images/logo_ensimag.png");

                frame.setIconImage(image.getImage());  // Définit l'icône de la fenêtre

            ```

    5. `getContentPane()` :
        - **Définition :** Cette méthode retourne le conteneur de contenu de la fenêtre.
        - **Signature :** `public Container getContentPane()`
        - **Rôle :** Elle renvoie le conteneur où les composants graphiques de la fenêtre sont ajoutés.
        - **Exemple :**
            ```java
            Container contentPane = frame.getContentPane();
            ```

    6. `setBackground(Color bgColor)` :

        - **Définition :** Cette méthode définit la couleur de fond de la fenêtre.

        - **Signature :** `public void setBackground(Color bgColor)`
            
        - **Rôle :** Elle définit la couleur de fond de la fenêtre en utilisant l'objet Color fourni.
        
        
        - **Exemple :**
            ```java
                    frame.getContentPane().setBackground(new Color(0xFFFFFF)); // Définit la couleur de fond de la fenêtre en bleu
            ```



    7. `setDefaultCloseOperation(int operation)` :
        
        - **Rôle :** 
            - permet de définir le comportement par défaut de la fenêtre lorsque l'utilisateur tente de la fermer en cliquant sur le bouton de fermeture de la fenêtre (la croix dans le coin supérieur droit de la fenêtre).

        - **Signature :**
            ```java
            public void setDefaultCloseOperation(int operation)
            ```

            - Le paramètre `operation` est une constante entière qui indique le comportement souhaité :

                - `JFrame.DO_NOTHING_ON_CLOSE` : Lorsque l'utilisateur tente de fermer la fenêtre, rien ne se produit. La fenêtre reste ouverte.
                
                - `JFrame.HIDE_ON_CLOSE` : La fenêtre est cachée mais reste en mémoire. Elle peut être rendue visible à nouveau.
                
                - `JFrame.DISPOSE_ON_CLOSE` : La fenêtre est fermée, libérant ainsi les ressources utilisées par la fenêtre. Cela ne ferme pas l'application complète, mais seulement la fenêtre spécifique.
                
                - `JFrame.EXIT_ON_CLOSE` : L'application entière se ferme lorsque la fenêtre est fermée.

        - **Exemple :**
            ```java
            JFrame frame = new JFrame("Ma Fenêtre");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quitte l'application lorsque la fenêtre est fermée
            ```

    8. - **`pack()`:**

        - La méthode `pack()` est utilisée pour dimensionner la fenêtre (JFrame) pour qu'elle s'adapte à la taille naturelle de ses composants. 
        
        - Cela est utile après avoir ajouté des composants à une fenêtre pour qu'elle ajuste sa taille pour les afficher correctement.

        - **Signature :**
            ```java
            public void pack()
            ```

        - **Exemple :**

            ```java
            import javax.swing.*;

            public class JFrameExample {
                public static void main(String[] args) {
                    JFrame frame = new JFrame("Exemple de JFrame");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // Ajoute des composants au JFrame
                    
                    frame.pack(); // Redimensionne la fenêtre pour s'adapter aux composants ajoutés
                    frame.setVisible(true);
                }
            }
            
            ```



### 2.2 `Color` en java :

- pour définir des couleurs, vous avez plusieurs options : 

    - **Constantes prédéfinies de la classe Color :** 
        
        - Ces constantes comprennent des couleurs standard comme `Color.RED`, `Color.BLUE`, `Color.GREEN`.

        - **Exemple :**
        ```java
            frame.getContentPane().setBackground(Color.RED); // Définit la couleur de fond en rouge
        ```

    - **Valeurs RGB :** 
        
        - Vous pouvez spécifier une couleur en utilisant les valeurs RGB (Rouge, Vert, Bleu) en utilisant le constructeur de la classe `Color` qui prend en paramètre les valeurs RGB comprises entre 0 et 255 pour chaque composante.

        - **Exemple :**

        ```java
        Color myColor = new Color(100, 150, 200); // Définit une couleur personnalisée en RGB
        frame.getContentPane().setBackground(myColor);
        ```

    -  **Valeurs hexadécimales :** 

        - Pour définir une couleur à l'aide de valeurs hexadécimales, vous pouvez utiliser un format hexadécimal, par exemple `0xFF0000` pour le rouge,     `0x00FF00` pour le vert et `0x0000FF` pour le bleu. Ces valeurs représentent respectivement les composantes Rouge, Vert et Bleu d'une couleur.

        - **Exemple :**
                    
            ```java
                Color hexColor = new Color(0xFF4500); // Définit une couleur à l'aide de la valeur hexadécimale
                frame.getContentPane().setBackground(hexColor);
            ```

### 2.3 **héritage de `JFrame` :**


- Hériter de la classe `JFrame` en créant une classe personnalisée, telle que `MyFrame`, offre une approche structurée et modulaire pour la création d'une fenêtre graphique. 


- **Importance :**

    1. **Modularité et organisation :** En créant une classe distincte (`MyFrame`), vous isolez la logique de votre fenêtre dans une classe dédiée, ce qui facilite la gestion de son comportement et de son apparence.

    2. **Réutilisation du code :** Si vous avez plusieurs fenêtres avec un comportement ou une apparence similaires, hériter de `JFrame` pour créer une classe de fenêtre personnalisée permet une réutilisation facile du code.

- **Exemple :**

    ```java
    import javax.swing.JFrame;

    public class MyFrame extends JFrame {
        public MyFrame(String title) {
            super(title); // Appel du constructeur de la classe parente (JFrame) avec le titre
            // Autres configurations ou initialisations peuvent être faites ici
            this.setSize(800, 600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Autres configurations de la fenêtre
        }
    }
    ```

- **Avantages :**

    1. **Clarté du code :** L'héritage permet de séparer la logique spécifique de la fenêtre de la logique générale de l'application, rendant le code plus lisible et modulaire.

    2. **Facilité de maintenance :** Les modifications apportées à la logique de la fenêtre peuvent être effectuées au sein de la classe `MyFrame` sans affecter le reste de l'application.

    3. **Réutilisation du code :** Si vous avez besoin de créer plusieurs fenêtres avec des caractéristiques similaires, la classe `MyFrame` peut être réutilisée sans dupliquer le code.

