# cour 05 : Les opérations

### I. Les opérations en JAVA :

En Java, vous pouvez effectuer diverses opérations sur les données, qu'il s'agisse de calculs mathématiques, de manipulations de chaînes de caractères ou d'opérations logiques. Voici quelques-unes des opérations de base que vous pouvez effectuer en Java :

1. **Opérations Mathématiques** :
   - Addition (`+`)
   - Soustraction (`-`)
   - Multiplication (`*`)
   - Division (`/`)
   - Modulo (`%`) - renvoie le reste de la division

2. **Opérations de Comparaison** :
   - Égal : '==': compare les valeures , '===': compare les valeures et les types
   - Différent (`!=`)
   - Inférieur (`<`)
   - Inférieur ou égal (`<=`)
   - Supérieur (`>`)
   - Supérieur ou égal (`>=`)

3. **Opérations Logiques** :
   - ET logique (`&&`)
   - OU logique (`||`)
   - NON logique (`!`)

4. **Opérations sur les Chaînes de Caractères** :
   - Concaténation de chaînes (`+`)
   - Comparaison de chaînes (`.equals()` ou `==` pour la référence)

5. **Opérations sur les Bits** :
   - ET (`&`)
   - OU (`|`)
   - OU exclusif (`^`)
   - Décalage à gauche (`<<`)
   - Décalage à droite (`>>`)
   - Décalage à droite non signé (`>>>`)

6. **Opérations d'Assignation** :
   - Affectation simple (`=`)
   - Affectation avec opération (`+=`, `-=`, `*=`, `/=`, etc.)


7. **Opérations Ternaires** :
   - Opérateur ternaire (`condition ? valeurSiVrai : valeurSiFaux`)

8. **Opérations d'Incrémentation et de Décrémentation** :
    - Incrémentation (`++`)
    - Décrémentation (`--`)

### II. La difference entre : Post-incrémentation(a++) et Pré-incrémentation(++a)

En Java, `a++` et `++a` sont deux opérations d'incrémentation qui augmentent la valeur d'une variable `a` de 1. Cependant, il y a une différence subtile dans le moment où l'incrémentation est effectuée et dans la valeur renvoyée par l'expression.

1. **a++ (Post-incrémentation)** :
   - L'opérateur `a++` est appelé post-incrémentation.
   - La valeur actuelle de la variable `a` est utilisée dans l'expression avant que l'incrémentation soit effectuée.
   - Après l'incrémentation, la valeur de `a` est augmentée de 1.

Exemple :

```java
int a = 5;
int result = a++;
// À ce stade, result vaut 5 et a vaut 6
```

2. **++a (Pré-incrémentation)** :
   - L'opérateur `++a` est appelé pré-incrémentation.
   - L'incrémentation de la variable `a` est effectuée avant que la valeur soit utilisée dans l'expression.
   - La valeur de `a` est augmentée de 1 avant d'être utilisée.

Exemple :

```java
int a = 5;
int result = ++a;
// À ce stade, result vaut 6 et a vaut 6
```


### RQ :

pour calcluer a^b en JAVA on uitilse la Méthode .pow() de la classe Math 

```java 
int base = 3 ;

int exposant = 2 ;

int result = Math.pow(base , exposant);


```