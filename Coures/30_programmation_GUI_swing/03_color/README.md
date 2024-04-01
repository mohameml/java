# cour 03 : **``Color:``**


## 1. **Description:**


>En Java, la classe `Color` est utilisée pour représenter et manipuler les couleurs , elle se trouve dans le package ``java.awt``. 
    

- Cette classe offre plusieurs façons de définir une couleur, notamment en utilisant des constantes prédéfinies pour les couleurs de base comme le rouge (`RED`), en spécifiant les valeurs RGB (rouge, vert, bleu), ou en utilisant des valeurs hexadécimales. 
    


## 2. **Constructeur :**


>En Java, la classe `Color` possède plusieurs constructeurs pour créer des instances de couleurs. 


1. **Constructeur avec les composantes RGB :**

   ```java
   public Color(int red, int green, int blue)
   ```
   Ce constructeur crée une nouvelle instance de `Color` en spécifiant les composantes rouge, verte et bleue de la couleur. Les valeurs `red`, `green` et `blue` doivent être des entiers compris entre 0 et 255.


2. **Constructeur avec les composantes RGBA :**
   ```java
   public Color(int red, int green, int blue, int alpha)
   ```
   Ce constructeur est similaire au premier, mais permet également de spécifier une composante alpha (transparence) de la couleur. La valeur `alpha` doit également être un entier compris entre 0 et 255, où 0 représente une transparence totale et 255 une opacité totale.

3. **Constructeur avec une couleur existante :**
   ```java
   public Color(Color color)
   ```
   Ce constructeur crée une nouvelle instance de `Color` en copiant les valeurs de couleur d'une instance existante comme   `Color.RED`, `Color.BLUE`, `Color.GREEN`.

4. **Constructeur avec  une valeur hexadécimale:**

    ```java
    public Color(int rgb)
    ```

    Dans ce constructeur, la valeur `rgb` est un entier représentant la couleur en format hexadécimal. Les 8 premiers bits correspondent à la composante rouge, les 8 bits suivants à la composante verte, et les 8 derniers bits à la composante bleue.



## 3. **Exemple:**

```java
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Définition de la couleur rouge en utilisant la constante prédéfinie RED
        Color color1 = Color.RED;

        // Définition de la couleur bleue avec des valeurs RGB
        Color color2 = new Color(0, 0, 255);

        // Définition de la couleur verte avec une valeur hexadécimale
        Color color3 = new Color(0x00FF00);

        System.out.println("Color 1: " + color1);
        System.out.println("Color 2: " + color2);
        System.out.println("Color 3: " + color3);
    }
}
```



```
Color 1: java.awt.Color[r=255,g=0,b=0]
Color 2: java.awt.Color[r=0,g=0,b=255]
Color 3: java.awt.Color[r=0,g=255,b=0]
```
