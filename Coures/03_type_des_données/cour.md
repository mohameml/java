# cour 03 : Les type de donées 


## 1.Types de Données Primitifs

Les types de données primitifs sont des types de base intégrés dans le langage Java. Ils stockent des valeurs directement et ont une taille fixe en mémoire. Voici les principaux types de données primitifs en Java :

1. **byte** : Occupe 8 bits en mémoire. Utilisé pour stocker de petits entiers signés. Plage : -128 à 127.

2. **short** : Occupe 16 bits en mémoire. Utilisé pour stocker des entiers signés. Plage : -32,768 à 32,767.

3. **int** : Occupe 32 bits en mémoire. Utilisé pour stocker des entiers signés. Plage : -2^31 à 2^31 - 1.

4. **long** : Occupe 64 bits en mémoire. Utilisé pour stocker de grands entiers signés. Plage : -2^63 à 2^63 - 1.

5. **float** : Occupe 32 bits en mémoire. Utilisé pour stocker des nombres à virgule flottante simple précision.

6. **double** : Occupe 64 bits en mémoire. Utilisé pour stocker des nombres à virgule flottante double précision.

7. **char** : Occupe 16 bits en mémoire. Utilisé pour stocker un caractère Unicode.

8. **boolean** : Utilisé pour représenter les valeurs booléennes `true` ou `false`.

## 2.Types de Données de Référence

Les types de données de référence sont utilisés pour stocker des références aux objets en mémoire. Contrairement aux types primitifs, les types de référence ne stockent pas directement les valeurs, mais des adresses mémoire où les objets sont stockés. Voici quelques types de données de référence en Java :

1. **Classes** : Les classes sont des modèles pour la création d'objets. Elles définissent la structure, le comportement et les attributs d'un objet.

2. **Interfaces** : Les interfaces définissent des contrats que les classes doivent implémenter. Elles permettent d'atteindre l'abstraction et de définir des comportements communs.

3. **Tableaux** : Les tableaux sont utilisés pour stocker des collections d'éléments du même type. Les tableaux peuvent être unidimensionnels ou multidimensionnels.

4. **Énumérations** : Les énumérations définissent un ensemble fini de valeurs constantes nommées. Elles sont utiles pour représenter des ensembles de choix prédéfinis.

## 3. Conversion de Types

La conversion de types, également appelée "cast", permet de convertir une valeur d'un type de données à un autre. Il existe deux types de conversions : conversion implicite (promotion) et conversion explicite (cast). La conversion implicite se produit lorsque le type source peut être converti en type cible sans perte de données. La conversion explicite nécessite un cast explicite et peut entraîner une perte de données.

```java
int x = 10;
double y = x; // Conversion implicite

double a = 5.7;
int b = (int) a; // Conversion explicite
```





## RQ : Les bases de nombres classiques : 

* decimale     (0 à 9)     : 1233 ou 12_33
* binaire      (0 à 1)     : 0b111
* Octale       (0 à 7)     : 0755
* hexadecimale (0 à F)     : 0x123


# 4. Les carcecters spéciaux : 

* \n : nouvelle ligne
* \t : tabulation
* \r : retour chariot : 
    Le caractère de retour de chariot ("\r") est utilisé pour déplacer le curseur au début de la ligne actuelle, sans sauter à la ligne     suivante. Cela signifie que si vous affichez du texte en utilisant "\r", le texte suivant que vous afficherez écrasera le contenu actuel de la ligne sans passer à une nouvelle ligne.
* \b : retour arriére
* \f : nouvelle page 
* \' : pour protége '
* \" : pour protége "
* \x12 : un nombre hexadecimale
* \012 : un nombre Ocatle