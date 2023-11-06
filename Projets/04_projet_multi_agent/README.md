# projet_java : **Simulation Orientée-Objet de systèmes multiagents**

- **Date limite :**
    * La date limite de rendu est fixée au **vendredi 17 novembre 2023, 19h**






## 1. Les différentes tâches

### Partie I : **simulation des Balles** (``facile``)


- **Q1** : 
    
    * Créez une classe ``Balls`` composée de quelques balles placées sur le plan à des coordonnées ad hoc. 
    
    * Ajoutez les méthodes suivantes (plus si nécessaire) :
        - ``void translate(int dx, int dy)`` : translate toutes les balles ;
        - ``void reInit()`` : remet toutes les balles à leur position initiale ;

    
    * redéfinissez la méthode ``public String toString()`` pour qu’elle retourne une chaine de caractères avec les positions de toutes les balles.

    * Créez ensuite une classe ``TestBalls``, munie d’une méthode ``main``, qui crée une instance de Balls et utilise
    les méthodes ci-dessus pour modifier/afficher les coordonnées des balles.


- **Q2** :
    
    * Ecrivez une classe ``BallsSimulator`` qui réalise l’interface ``Simulable`` .


- **Q3** : 

    * Reprenez votre simulateur pour afficher les balles dans la fenêtre graphique. 



- **Q4** : 

    * animez les balles pour qu’elles rebondissent sur les bords de la fenêtre pour toujours rester visibles.




### Partie II : **automates cellulaires :** (``Moyenne``)


- **Le jeu de la vie de Conway:**

    - **Q5** : Développez un simulateur graphique du jeu de la vie de Conway.


- **Le jeu de l’immigration:**

    - **Q6** :   Développez un simulateur graphique du jeu de l’immigration.


- **Le modèle de Schelling :**

    - **Q7** : Développez un simulateur graphique du modèle de Schelling .



### Partie III : **Un modèle d’essaims : les boids** (``Difficle``)


- **Q8** : Implantez un simulateur de boids.


- **Q9** : Implantez les classes ``Event`` et ``EventManager`` .


- **Q10** : Intégrez un gestionnaire d’évènements à votre simulateur.


- **Q11** : Créez quelques groupes de boids aux comportements différents. 


- **Q12** : faire interagir les groupes de boids  entre eux.



## 2. Régelse s à respecter: 

- respecter le coding style Java :

- noms de variables explicites, 

- les aspects « techniques » de votre code devront être commentés, pour en faciliter la compréhension ;

- le principe d’encapsulation devra être respecté : masquage des attributs, garantie de l’intégrité des
états des objets, principe de délégation ;

- utilisez l’héritage pour factoriser tout code nécessaire à plusieurs objets, et spécifiez des méthodes
abstraites dans les classes de haut niveau  ;






## 3. Rendu du projet  ( sur ``teide``)


- **code source** 

- **compte rendu : pdf en 4 pages aux max**




## 4. **L'intérface `Simulable`:**

- Objet de simulation pour être associée à une interface graphique de type ``GUISimulator``.

- **méthodes:**

    - ``void next()`` :Avance la simulation d'un pas de temps.

    - ``void restart()`` : Remet le simulateur dans son état initial.

## 5. **la classe  ``GUISimulator``:**


- **Définition:**

    -  Cette classe est une fenêtre graphique permettant d'afficher et de contrôler une simulation.

    - La fenêtre contient un panneau d'affichage sur lequel des éléments graphiques peuvent être placés.
    
    - Cette classe est aussi munie de boutons de contrôle d'une simulation. 

    - Elle est associée à un simulateur, objet de type ``Simulable``, avec lequel elle interagit en réponse aux interactions de l'utilisateur:

        - ``la méthode next()`` de ce simulateur est invoquée suite à un clic sur le bouton ``Suivant`` de l'interface graphique, ou bien à intervalles réguliers si la ``lecture`` a été démarrée.

        - ``la méthode restart()`` est elle invoquée suite à un clic sur le bouton ``Début``.


- **Constructors:**

    - ``GUISimulator(int width, int height, java.awt.Color bgColor)`` :
        
        - Crée une nouvelle fenêtre graphique ne contenant qu'un panneau d'affichage d'une taille fixée par les arguments.

    
    - ``GUISimulator(int width, int height, java.awt.Color bgColor, Simulable simulator):``

        - Crée une nouvelle fenêtre graphique contenant un panneau d'affichage d'une taille fixée par les arguments, et associée à un objet Simulable qui répondra aux évènement ``next`` et ``restart``.

- **Méthodes:**

    - ``void addGraphicalElement(GraphicalElement e):``  
        - Ajoute un élément graphique dans la zone de simulation.

    - ``void addItemToList(java.lang.String item):``
        
        - Ajoute un item à la liste des configurations possibles Dessine le selecteur si il ne l'était pas

    - ``int	getPanelHeight():``
        
        - Retourne la hauteur du panneau d'affichage.

    - ``int	getPanelWidth():``
        
        - Retourne la largeur du panneau d'affichage.

    - ``void reset():``
        - Enlève tous les éléments graphiques de la zone de simulation.

     - ``void	resizePanel(int panelWidth, int panelHeight):``
        
        - Redimensionner le panel de simulation aux dimensions voulues

    - **``void	setSimulable(Simulable simulator):**
        - Associe un objet Simulable à cette interface graphique.

    - ``void setWarning(boolean warning):``
        
        - Afficher ou non dans la console si un pas met plus de temps que la durée maximale qu'on lui accorde




## 6. **Calss `Oval`:**

- **Définition:**
    
    - Classe permettant de dessiner un élément ovale dans la fenêtre graphique.

- **Constructors:**

    - ``Oval(int x, int y, java.awt.Color drawColor, java.awt.Color fillColor, int size):``
        - Crée un nouvel élément circulaire.

    - ``Oval(int x, int y, java.awt.Color drawColor, java.awt.Color fillColor, int width, int height):``
        - Crée un nouvel élément ovale.

- **Méthodes:**

    - ``int getX():``

    - ``int	getY():``

    - ``void paint(java.awt.Graphics2D g2d):``
        - Dessine un élément graphique dans la fenêtre graphique.

    -  ``void translate(int tx, int ty):``
        - Translate l'élément graphique.


## 7.  **Class ``Rectangle``:**

- **Définition:**

    - Classe permettant de dessiner un élément rectangulaire dans la fenêtre graphique.

- **Constructors:**


    - ``Rectangle(int x, int y, java.awt.Color drawColor, java.awt.Color fillColor, int size):``

        - Crée un nouvel élément carré.

    - ``Rectangle(int x, int y, java.awt.Color drawColor, java.awt.Color fillColor, int width, int height):``
        
        - Crée un nouvel élément rectangulaire.

- **méthodes:**

    - ``int getX():``

    - ``int	getY():``

    - ``void paint(java.awt.Graphics2D g2d):``
        - Dessine un élément graphique dans la fenêtre graphique.

    -  ``void translate(int tx, int ty):``
        - Translate l'élément graphique.

## 8. **Class  ``Text``:**

- **Définition:**
    
    - Classe permettant d'afficher un texte dans la fenêtre graphique.

- **Constructors:**

    - ``Text(int x, int y, java.awt.Color c, java.lang.String text):``
        - Crée un nouvel élément de texte.

- **méthodes:**

    - ``int getX():``

    - ``int	getY():``

    - ``void paint(java.awt.Graphics2D g2d):``
        - Dessine un élément graphique dans la fenêtre graphique.

    -  ``void translate(int tx, int ty):``
        - Translate l'élément graphique.


### RQ :

- **Interface GraphicalElement:**
    - Les classes réalisant cette interface permettent de dessiner un élément graphique dans la fenêtre graphique.