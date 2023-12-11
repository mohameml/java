
### Qu. 1 (Geometry)
ras

### Qu. 2 (Point)
- ras sur la classe. 
- Pour le barycentre vous pouvez renvoyer `this` ou une copie `new Point(this.x, this.y)`, les deux réponses sont acceptées.
La seconde version est préférable d'un point de vue encapsulation, mais comme un `Point` est ici non mutable la première est ok.

### Qu. 3 (test)
ras

### Qu. 4 (whoami)
l'idée est d'utiliser un attribut de classe (`static`) pour garder un compteur courant dans la classe `Geometry`, incrémenté à chaque appel au constructeur.

### Qu. 5 (BrokenLine)
- Choix de la collection: séquence, doublons acceptés, donc: `List<Point>`. Insertion/suppression en `O(1)` si on choisit une `LinkedList<Point>`.
- Constructeur: avec deux `Point` en paramètre; vérifier qu'ils sont non null
- bien de gérer les cas particuliers via des exceptions (au moins mettez un commentaire sinon)
- barycentre: version naïve, for each sur tous les points; `O(n)`

### Qu. 6 (test)
ras

### Qu. 7 (barycentre pas naïf)
- Pour éviter les doublons, une solution est d'ajouter tous les points dans un ensemble `Set<Point>` sur lequel on peut calculer comme précédemment
- on peut utiliser un `HashSet<Point>`, coût total en `O(2n)`
- bien redéfinir `equals` et `hashCode` dans la classe `Point`


### Qu. 8 (SIG: choix collections)
Les entités seront stockées dans deux collections:
- `Map<String, Geometry>` pour garantir l'unicité des noms et retrouver les géométries par leur nom. Par d'ordre alphabétique demandé donc `HashMap` suffit, mais `TreeMap` accepté (veinards, `String` implémente déjà `Comparable` sinon c'était pour votre pomme).
- `List<Geometry>` pour l'affichage dans l'ordre de création. 

### Qu. 9 (SIG)
- ras. Tout en `O(1)` sauf l'affichage.
- juste, bien gérer le cas où on cherche à ajouter avec un nom déjà présent.
- pour les itérateurs, réutiliser les itérateurs des collections.

### Qu. 10 (test)
tas

### Qu. 11 (dessin)
- `Geometry` implémente `Drawable`
- redéfinition de la méthode `draw` dans `Point` et `BrokenLine` (plus facile avec un itérateur?)
- `SIG` implémente `Drawable` et sa méthode `draw` fait juste un for each sur la séquence des géométries.

### Qu. 12 (géométries bien composées)
- l'exam est plus long que dur; si vous arrivez là c'est que vous êtes super balaise, donc débrouillez-vous!
- on peut juste imagine une classe `MultiGeometry` qui hérite de `Geometry` est possède une collection de `Geometry`. Voilà, faites.

### Qu. 13 (cygne)
Les talents artistiques n'étaient pas évalués en tant que tels, mais ça fait sourire quand on corrige une copie. Et si vous vous posez la question, oui on a vu quelques cygnes en 2h.