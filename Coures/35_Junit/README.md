# cour 35 : **Junit**

## 1. **Introduction:**


- **Les tests unitaires:**

    Les tests unitaires sont une pratique de développement logiciel consistant à écrire des petits tests automatisés qui vérifient le bon fonctionnement d'une unité de code, généralement une méthode ou une fonction, de manière isolée. L'objectif principal des tests unitaires est de s'assurer que chaque partie du code fonctionne correctement individuellement.


- concepts clés liés aux tests unitaires :

    - **Unité de Code :** Une unité de code est la plus petite partie testable d'une application. Il peut s'agir d'une fonction, d'une méthode, d'une classe, ou même d'une petite partie d'une classe.

    - **Isolation :** Les tests unitaires sont conçus pour être exécutés de manière isolée, ce qui signifie qu'ils ne dépendent pas du contexte global de l'application et ne sont pas affectés par l'exécution d'autres tests.

    - **Automatisation :** Les tests unitaires sont automatisés, ce qui signifie qu'ils peuvent être exécutés régulièrement avec peu ou pas d'intervention humaine. Cela facilite l'intégration continue et la détection précoce des erreurs.

    - **Répétabilité :** Les tests unitaires doivent être reproductibles. Cela signifie que chaque fois que vous exécutez un test, il doit donner le même résultat s'il n'y a pas eu de changements dans le code testé.

- **Junit:**

    JUnit, d'autre part, est un framework de test unitaire pour le langage de programmation Java. Il fournit des annotations et des méthodes pour faciliter la création et l'exécution de tests unitaires en Java. Les développeurs utilisent JUnit pour structurer et automatiser leurs tests, facilitant ainsi la vérification constante de la qualité du code.


- **Exemple de test unitaire avec JUnit en Java :**

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void testAddition() {
        MyMath math = new MyMath();
        int result = math.add(2, 3);
        assertEquals(5, result);
    }
}
```

Dans cet exemple, la méthode `testAddition` vérifie que la méthode `add` de la classe `MyMath` renvoie correctement la somme de deux nombres.

 
## 2. **utiliser JUnit 5 (Jupiter) dans un projet Maven:**

- **Ajouter la dépendance Junit:**

pour utiliser JUnit 5 (Jupiter) dans un projet Maven, vous devez spécifier la dépendance correspondante dans le fichier `pom.xml`. Voici comment le faire :

```xml
<dependencies>
    <!-- JUnit 5 (Jupiter) -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.1</version> <!-- Remplacez par la version la plus récente -->
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.1</version> <!-- Remplacez par la version la plus récente -->
        <scope>test</scope>
    </dependency>
</dependencies>
```

Assurez-vous d'inclure ces dépendances dans la section `<dependencies>` de votre fichier `pom.xml`. La première dépendance (`junit-jupiter-api`) contient les annotations et les assertions de JUnit 5, tandis que la deuxième dépendance (`junit-jupiter-engine`) contient le moteur d'exécution de JUnit 5.


- **Ajouter le plugin Surefire :**

Pour ajouter le plugin Maven Surefire, qui est utilisé pour exécuter les tests dans un projet Maven, vous devez ajouter la configuration du plugin dans la section `<build>` de votre fichier `pom.xml`. Voici un exemple de configuration typique pour le plugin Surefire :

```xml
<build>
    <plugins>
        <!-- Plugin Maven Surefire pour l'exécution des tests -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version> <!-- Remplacez par la version la plus récente -->
            <configuration>
                <!-- Inclure les classes de test dans la recherche des classes de test -->
                <includes>
                    <include>**/*Test.java</include>
                    <include>**/*Tests.java</include>
                    <include>**/*TestCase.java</include>
                </includes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

Assurez-vous d'inclure cette configuration à l'intérieur de la balise `<project>` dans votre fichier `pom.xml`. Remplacez la version du plugin par la version la plus récente disponible sur le [site Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/).

Cette configuration du plugin Surefire indique à Maven de rechercher les classes de test correspondantes aux motifs spécifiés (`*Test.java`, `*Tests.java`, `*TestCase.java`) dans le répertoire `src/test/java` de votre projet et de les exécuter lors de la phase de test.







Une fois que vous avez ajouté ces dépendances, Maven téléchargera automatiquement les bibliothèques JUnit nécessaires lors de la compilation et de l'exécution des tests.

Voici un exemple simple de classe de test utilisant JUnit 5 :

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
    }
}
```

Assurez-vous que vos tests utilisent les annotations et les assertions de JUnit 5, comme illustré dans cet exemple. Vous pouvez exécuter ces tests avec la commande Maven :

```bash
mvn test
```

Cela exécutera tous les tests de votre projet.
 
## 3. **un exemple simple de test unitaire:**

Commençons par créer un exemple simple de test unitaire en utilisant JUnit. 
Dans cet exemple, nous allons créer une classe avec une méthode, puis écrire un test pour cette méthode en utilisant les annotations JUnit, la fonction `assertEquals`, un nom de méthode significatif, et nous assurer que la méthode est `void`.

Supposons que nous ayons une classe `Calculator` avec une méthode `add` que nous voulons tester.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

Maintenant, créons un test pour cette classe à l'aide de JUnit.

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    // Définir un test avec l'annotation @Test
    @Test
    void testAddition() {
        // Initialiser la classe à tester
        Calculator calculator = new Calculator();

        // Appeler la méthode à tester
        int result = calculator.add(3, 4);

        // Utiliser assertEquals pour vérifier le résultat attendu
        assertEquals(7, result);
    }
}
```

Explications :

- **Annotation `@Test`:** Indique que la méthode est un test unitaire.

- **Nom de la Méthode `testAddition`:** Un nom significatif décrivant le comportement que vous testez.

- **Type de Retour `void`:** Les méthodes de test ne renvoient généralement rien (`void`). Si le test réussit, il se termine sans erreur. Si le test échoue, une exception est levée.

- **Visibilité `default`:** Dans l'exemple, la visibilité de la méthode est la visibilité par défaut (package-private), ce qui signifie qu'elle n'est accessible qu'à partir du même package. C'est souvent suffisant pour les tests unitaires.

- **Fonction `assertEquals`:** Compare le résultat de la méthode testée avec une valeur attendue. Si les deux valeurs ne sont pas égales, le test échoue.

En exécutant ce test, JUnit appelle la méthode `testAddition`, qui crée une instance de `Calculator`, appelle la méthode `add`, et utilise `assertEquals` pour comparer le résultat avec la valeur attendue. Si les valeurs ne correspondent pas, le test échoue, sinon, il réussit.


## 4. **Les fonctions des Assertions:**

Les fonctions  des Assertions telles que `assertEquals`, `assertNotNull`, `assertTrue`, etc., font partie du framework JUnit et sont utilisées pour effectuer des vérifications et des assertions dans les tests unitaires. 


- **`assertEquals(expected, actual)` :**
   - Vérifie que deux valeurs sont égales. Si elles ne le sont pas, le test échoue.
   ```java
   assertEquals(5, result);
   ```

- **`assertNotEquals(expected, actual)` :**
   - Vérifie que deux valeurs ne sont pas égales. Si elles le sont, le test échoue.
   ```java
   assertNotEquals(5, result);
   ```

- **`assertNull(object)` :**
   - Vérifie qu'un objet est nul. Si ce n'est pas le cas, le test échoue.
   ```java
   assertNull(someObject);
   ```

- **`assertNotNull(object)` :**
   - Vérifie qu'un objet n'est pas nul. Si c'est le cas, le test échoue.
   ```java
   assertNotNull(someObject);
   ```

- **`assertTrue(condition)` :**
   - Vérifie qu'une condition est vraie. Si ce n'est pas le cas, le test échoue.
   ```java
   assertTrue(result > 0);
   ```

- **`assertFalse(condition)` :**
   - Vérifie qu'une condition est fausse. Si ce n'est pas le cas, le test échoue.
   ```java
   assertFalse(result < 0);
   ```

- **`assertSame(expected, actual)` :**
   - Vérifie que deux références pointent vers le même objet. Si elles ne le font pas, le test échoue.
   ```java
   assertSame(expectedObject, actualObject);
   ```

- **`assertNotSame(expected, actual)` :**
   - Vérifie que deux références ne pointent pas vers le même objet. Si elles le font, le test échoue.
   ```java
   assertNotSame(expectedObject, actualObject);
   ```

- **`fail()` :**
   - Force l'échec du test. Utile pour indiquer qu'une partie du code ne doit pas être atteinte.
   ```java
   if (someCondition) {
       fail("This part of the code should not be reached.");
   }
   ```

- **`assertThrows(expectedException, executable)` (JUnit 5) :**
   - Vérifie qu'une exception spécifique est levée lors de l'exécution d'un bloc de code.
   ```java
   assertThrows(MyException.class, () -> myObject.someMethod());
   ```

Ces fonctions aident à spécifier les conditions que vous attendez dans vos tests et à signaler automatiquement les problèmes lors de l'exécution des tests. Vous pouvez choisir la fonction appropriée en fonction de la vérification que vous souhaitez effectuer dans votre test unitaire.


## 5. **Tester une méthode qui leve une Exception:**

Avec JUnit 5, la gestion des exceptions a été simplifiée avec l'assertion `assertThrows`. Voici comment vous pouvez tester une méthode qui lève une exception avec JUnit 5 en fournissant plus de détails :

Supposons que vous ayez une classe `MyClass` avec une méthode `divide` qui lance une exception `ArithmeticException` si la division par zéro est tentée :

```java
public class MyClass {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
```

Voici comment vous pouvez écrire un test pour cette méthode avec JUnit 5 :

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyClassTest {

    @Test
    public void testDivideByZero() {
        MyClass myClass = new MyClass();

        // Utilisation de assertThrows pour spécifier l'exception attendue
            assertThrows(ArithmeticException.class, 
                () ->   {
                            myClass.divide(10, 0);
                        }
            );
    }
}
```

Dans cet exemple :

- `assertThrows` spécifie l'exception attendue (`ArithmeticException`) et le code qui doit lever cette exception.
- Vous pouvez stocker l'exception capturée dans une variable si vous souhaitez vérifier des détails supplémentaires.
- Vous pouvez utiliser des assertions supplémentaires pour vérifier des détails spécifiques de l'exception, comme son message.

