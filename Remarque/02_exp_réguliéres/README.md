# Les expressions régulières (regex) :


- Les expressions régulières (regex) sont des motifs de recherche utilisés pour décrire un ensemble de chaînes de caractères selon un certain schéma. 

- Elles permettent de rechercher, d'analyser et de manipuler des textes en fonction de motifs définis. 

- Les expressions régulières sont largement utilisées dans la programmation pour effectuer des opérations de recherche, de validation ou de remplacement de texte.

- Voici quelques éléments clés des expressions régulières :


- **Symboles de base :**

    - **Caractères littéraux :** Correspondent exactement à eux-mêmes (par exemple, "abc" correspond à la chaîne "abc").

    - **Méta-caractères :** Ils ont une signification spéciale dans une expression régulière, comme `^`, `$`, `.`, `*`, `+`, `?`, etc.


- **Classes de caractères :**

    - `[abc]` : Correspond à un caractère qui est soit "a", "b" ou "c".

    - `[^abc]` : Correspond à un caractère qui n'est ni "a", "b" ni "c".
    
    - `[a-z]` : Correspond à n'importe quelle lettre minuscule de "a" à "z".


- **Quantificateurs :**

    - `*` : Correspond à zéro ou plusieurs occurrences du caractère précédent.

    - `+` : Correspond à une ou plusieurs occurrences du caractère précédent.
    
    - `?` : Correspond à zéro ou une seule occurrence du caractère précédent.
    
    - `{n}` : Correspond à exactement n occurrences du caractère précédent.
    
    - `{n,}` : Correspond à au moins n occurrences du caractère précédent.
    
    - `{n,m}` : Correspond à entre n et m occurrences du caractère précédent.

- **Ancrages :**
    - `^` : Correspond au début d'une ligne.

    - `$` : Correspond à la fin d'une ligne.
    
    - `\b` : Correspond à une frontière de mot.


- **Groupes et Captures :**
    
    - `( )` : Crée un groupe, peut être utilisé pour capturer des sous-parties de la correspondance.


### Exemples :
- `^[A-Za-z]+$` : Correspond à une chaîne entière ne contenant que des lettres.
- `\d{3}-\d{2}-\d{4}` : Correspond à un format de numéro de sécurité sociale (aux États-Unis, par exemple).

