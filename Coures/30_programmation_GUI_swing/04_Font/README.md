# cour 4 : **``Font``:**

## 1. **Introduction:**



>La classe `Font` dans `java.awt` est utilisée pour représenter et gérer les polices de caractères dans les applications Java. 

- Elle est principalement utilisée pour définir l'apparence du texte dans les composants graphiques tels que les JLabels, les JTextAreas, les JButtons ..etc


- La classe `Font` représente une police de caractères dans Java, spécifiant des détails tels que :
    
    -  ``la famille de polices`` (Times New Roman, Arial, etc.), 
    
    - ``la taille de la police``  
    
    - ``le style`` (gras, italique, etc.).




## 2 .**Constructeur :`Font`** 
        

- **Description :**
    
    >Le constructeur `Font` permet de créer une nouvelle instance de la classe `Font` en spécifiant les caractéristiques de la police de caractères.


- **Syntaxe :**

    ```java
    public Font(String nomPolice, int style, int taillePolice)
    ```

    - `nomPolice` : La famille de police à utiliser. Cela peut être le nom de la police système ou un nom générique tel que "Serif", "SansSerif" ou "Monospaced".
    
    - `style` : Le style de la police. Il peut être spécifié en utilisant les constantes prédéfinies dans la classe `Font`, Les styles possibles sont :
        - `Font.PLAIN` : Police standard sans style particulier.
        - `Font.BOLD` : Police en gras.
        - `Font.ITALIC` : Police en italique.
        - `Font.BOLD + Font.ITALIC` : Police en gras et en italique.
    
    - `taillePolice` : La taille de la police, spécifiée en points.

- **Exemple :**

    ```java
    import java.awt.Font;

    public class Main {
        public static void main(String[] args) {
            // Création d'une police de caractères "Arial" en gras et de taille 12 points
            Font police = new Font("Arial", Font.BOLD, 12);

            // Affichage des informations sur la police
            System.out.println("Famille de police : " + police.getFamily());
            System.out.println("Style de police : " + police.getStyle());
            System.out.println("Taille de police : " + police.getSize());
        }
    }
    ```



## 3. **Principales méthodes de la classe Font :**

1. **``getFamily()`` :** Renvoie le nom de la famille de polices de caractères.

    Exemple :
    ```java
    String fontName = myFont.getFamily();
    ```

2. **``getSize()`` :** Renvoie la taille de la police.

    Exemple :
    ```java
    int fontSize = myFont.getSize();
    ```

3. **``getStyle()`` :** Renvoie le style de la police (gras, italique, normal, etc.).

    Exemple :
    ```java
    int fontStyle = myFont.getStyle();
    ```

