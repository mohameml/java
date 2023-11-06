# cour 28 : **L'API JDBC** (Java Database Connectivity) 


## 0. JDBC (Java Database Connectivity) :

- **Qu'est-ce que JDBC ?:**
    
    - JDBC  est une API Java permettant d'établir des connexions et d'interagir avec des bases de données relationnelles depuis des applications Java. 
    
    - Il fournit un ensemble de classes et d'interfaces permettant d'effectuer des opérations de manipulation de données, d'exécution de requêtes et de transactions avec les bases de données.

![image_jdbc](images/jdbc.jpeg)

- **Les étapes pour utilisér JDBC:**

    - l'utilisation de JDBC pour interagir avec une base de données nécessite plusieurs étapes pour établir une connexion, exécuter des requêtes et gérer les résultats. 

    - **Étapes de l'utilisation de JDBC :**

        1. **Enregistrement du pilote (driver) JDBC :**
            
            - l'enregistrement du pilote JDBC sert à informer la JVM (Java Virtual Machine) que votre application utilise un pilote spécifique pour interagir avec une base de données particulière, comme Oracle, SQLite, MySQL, etc.

            - Charger le pilote JDBC approprié en utilisant `Class.forName()`. Par exemple :
                ```java
                Class.forName("nom_du_pilote_JDBC"); // il faut installer le pilote 
                ```
            - ou **pour Oracle :**
                ```java
                try 
                {
                    DriverManager.registerDriver(new  oracle.jdbc.driver.OracleDriver ()
                );
                ... 
                }catch( SQLException e) 
                {
                    e. printStackTrace ();
                }                
                
                ```

        2. **Connexion avec la base de données :**

            - Établir une connexion à la base de données en fournissant l'URL de connexion, le nom d'utilisateur et le mot de passe. Par exemple :
                

                ```java
                String url = "jdbc:mysql://localhost:3306/ma_base_de_donnees";
                String utilisateur = "utilisateur";
                String motDePasse = "mot_de_passe";

                Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
                ```

        3. **Description et création d'une requête :**

            - Créer une déclaration (Statement) ou une PreparedStatement pour écrire la requête SQL. Par exemple :
                ```java
                Statement statement = connexion.createStatement();
                // ou
                PreparedStatement preparedStatement = connexion.prepareStatement("SELECT * FROM table WHERE condition = ?");
                ```

        4. **Exécution de la requête :**   
            - Utiliser la méthode appropriée pour exécuter la requête SQL précédemment créée. Par exemple :
                ```java
                ResultSet resultat = statement.executeQuery("SELECT * FROM ma_table");
                // ou
                preparedStatement.setString(1, "valeur_condition");
                ResultSet resultat = preparedStatement.executeQuery();
                ```

        5. **Récupération du résultat et traitement des données :**
            - Parcourir le résultat retourné par la requête et traiter les données. Par exemple :
                ```java
                while (resultat.next()) {
                    // Traitement des données, récupération des valeurs des colonnes
                    int id = resultat.getInt("id");
                    String nom = resultat.getString("nom");
                    // Effectuer des opérations avec les données récupérées
                }
                ```

        6. **Fermeture de la connexion :**
            - Une fois les opérations terminées, il est important de fermer la connexion à la base de données pour libérer les ressources. :
                ```java
                connexion.close();
                ```

        Ces étapes sont essentielles pour établir une connexion, exécuter des requêtes SQL et gérer les résultats lors de l'utilisation de JDBC avec Java pour interagir avec une base de données. Elles garantissent également une bonne gestion des ressources et évitent les fuites de mémoire.

        ### Remarque :

         - Assurez-vous d'inclure le pilote JDBC approprié dans votre projet. Pour MySQL, le pilote JDBC est souvent `mysql-connector-java-x.x.jar`.


## 1. **Pilote de BD :**


- **Définition :**

    - **Un pilote de base de données:** est un composant logiciel qui agit comme une interface entre **une application** et **une base de données**. 
    
    - Il permet à l'application d'envoyer des requêtes, de recevoir des résultats et de gérer les opérations de la base de données.

    - Pour établir une connexion à une base de données, vous avez besoin d'un pilote (ou driver en anglais) spécifique pour le langage de programmation ou le système de gestion de base de données que vous utilisez. 


- **Exemples :** 
  
  - **ODBC (Open Database Connectivity) :** Un pilote ODBC est utilisé pour établir une connexion à diverses bases de données en utilisant un langage de requête standardisé.
  
  - **JDBC (Java Database Connectivity) :** C'est un pilote pour Java, permettant aux programmes Java d'interagir avec différentes bases de données relationnelles.
  
  - **ODP.NET (Oracle Data Provider for .NET) :** Spécifique à la plateforme .NET, il facilite la connexion aux bases de données Oracle.

  - **SQLite JDBC Driver :** Utilisé pour établir des connexions à une base de données SQLite via Java.


- Chaque pilote est conçu pour être compatible avec un type spécifique de base de données ou pour fonctionner avec un langage de programmation particulier. Ils fournissent les outils nécessaires pour accéder, manipuler et gérer les données stockées dans une base de données, le tout en respectant les protocoles et les normes établies pour la communication entre l'application et la base de données.


## 2. **Structure générale de l'URL JDBC :**

- La structure générale d'une URL de connexion en JDBC varie en fonction du Système de Gestion de Base de Données (SGBD) auquel vous vous connectez. 

- **Structure générale de l'URL JDBC :**

    ```
    jdbc:<sous-protocole>:<compléments>
    ```

    - `<sous-protocole>` : Dépend du SGBD (par exemple, `mysql`, `oracle`, `sqlite`, etc.).
    - `<compléments>` : Informations spécifiques au SGBD, telles que l'hôte, le port, le nom de la base de données, etc.


- **URL pour SQLite :**

    - L'URL pour SQLite spécifie directement le chemin vers le fichier de base de données SQLite.

    ```java
    String urlSQLite = "jdbc:sqlite:/chemin/vers/votre/fichier.db";
    ```

- **URL pour MySQL :**

    - L'URL pour MySQL comprend des informations sur l'hôte, le port et le nom de la base de données.

    ```java
    String urlMySQL = "jdbc:mysql://localhost:3306/nom_de_votre_base_de_données";
    ```

- **URL pour Oracle :**

    - L'URL pour Oracle contient des détails sur le serveur, le port et le nom de la base de données.

    ```java
    String urlOracle = "jdbc:oracle:thin:@ordinateur:port:base";

    // Exemple :

    String urlOracleexemple = "jdbc:oracle:thin:@oracle1.ensimag.fr:1521:nom_bd";
    ```






## 3. Connexion Sur ``sqlite`` :


- Pour établir une connexion à une base de données ``SQLite`` depuis ``Java``, on a les étapes suivantes :



    1. **Téléchargement du pilote JDBC SQLite :** 
        
        - Obtenez le pilote JDBC SQLite (par exemple, SQLite JDBC Driver) depuis le dépôt  (https://mavenlibs.com/maven/dependency/org.xerial/sqlite-jdbc).


    2. **Inclure le pilote dans le projet :** 
        
        - Ajoutez le fichier JAR du pilote SQLite dans le classpath de votre projet. 
        
        - Si vous utilisez un outil de gestion de dépendances comme Maven ou Gradle, vous pouvez spécifier la dépendance du pilote SQLite dans le fichier de configuration du projet.

        - **Exemple Dans le makefile du projet :**

            ```makefile
                all : run

                compile :
                    javac -d ./bin/ ./src/Main.java 

                run : compile

                    java -classpath  ./lib/sqlite-jdbc.jar:./bin Main
        ```
    
- **Exemple de code :**
    -  Voici un exemple de code pour établir une connexion à une base de données SQLite et exécuter une requête SQL simple.

        ```java
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;

        public class ConnexionSQLite {

            public static void main(String[] args) {
                // Chemin vers la base de données SQLite (peut être un chemin absolu ou relatif)
                String url = "jdbc:sqlite:chemin_vers_votre_base_de_donnees.db";

                Connection connexion = null;

                try {
                    // Établir la connexion à la base de données
                    connexion = DriverManager.getConnection(url);

                    System.out.println("Connexion à SQLite établie.");

                    // Créer un objet Statement pour exécuter des requêtes SQL
                    Statement statement = connexion.createStatement();

                    // Exemple : Exécuter une requête SELECT
                    ResultSet resultat = statement.executeQuery("SELECT * FROM ma_table");

                    // Parcourir les résultats et les afficher
                    while (resultat.next()) {
                        // Exemple : récupérer la valeur d'une colonne nommée "nom"
                        String nom = resultat.getString("nom");
                        System.out.println("Nom : " + nom);
                        // Vous pouvez récupérer d'autres colonnes de la même manière
                    }

                    // Fermer les ressources
                    resultat.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    // Fermer la connexion à la base de données
                    try {
                        if (connexion != null) {
                            connexion.close();
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        ```


## 4. **Connexion sur ``MySQL``:**

- Pour établir une connexion à une base de données MySQL depuis Java, on a les étapes suivantes :


    1. **Téléchargement du pilote JDBC MySQL :** 
        
        - Obtenez le pilote JDBC MySQL (MySQL Connector/J) depuis le lien : <br/> [lien](https://bit.ly/3IERbsw)

    2. **Inclure le pilote dans le projet :** 

        - Ajoutez le fichier JAR du pilote MySQL dans le classpath de votre projet. 
        
        - **Exemple dans le makefile du projet :**

            ```makefile
                

            all : run

            compile :
                javac -d ./bin/ ./src/Main.java 

            run : compile

                java -classpath  ./lib/mysql-connector.jar:./bin Main
                
            ```

- **Exemple de code :** Voici un exemple de code pour établir une connexion à une base de données MySQL et exécuter une requête SQL simple.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionMySQL {

    public static void main(String[] args) {
        // Informations de connexion à la base de données MySQL
        String url = "jdbc:mysql://localhost:3306/ma_base_de_donnees"; // Remplacez ma_base_de_donnees par votre nom de base de données
        String utilisateur = "votre_utilisateur";
        String motDePasse = "votre_mot_de_passe";

        Connection connexion = null;

        try {
            // Établir la connexion à la base de données MySQL
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            System.out.println("Connexion à MySQL établie.");

            // Créer un objet Statement pour exécuter des requêtes SQL
            Statement statement = connexion.createStatement();

            // Exemple : Exécuter une requête SELECT
            ResultSet resultat = statement.executeQuery("SELECT * FROM ma_table"); // Remplacez ma_table par le nom de votre table

            // Parcourir les résultats et les afficher
            while (resultat.next()) {
                // Exemple : récupérer la valeur d'une colonne nommée "nom"
                String nom = resultat.getString("nom");
                System.out.println("Nom : " + nom);
                // Vous pouvez récupérer d'autres colonnes de la même manière
            }

            // Fermer les ressources
            resultat.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer la connexion à la base de données
            try {
                if (connexion != null) {
                    connexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
```


## 5. la classe `DriverManger` et `Conncetion` :



### 5.1 Classe `DriverManager` :

- La classe `DriverManager` est responsable de la gestion des pilotes de bases de données dans JDBC, permettant d'établir des connexions avec différentes bases de données.


- **Principales méthodes de la classe `DriverManager` :**

    1. **`registerDriver(Driver driver)` :**
        - **Signature :** `public static synchronized void registerDriver(Driver driver) throws SQLException`
        - **Rôle :** Enregistre un pilote de base de données auprès de `DriverManager`. Le pilote sera ensuite disponible pour établir des connexions.
        - **Exemple :**
            ```java
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            ```

    2. **`getConnection(String url, String user, String password)` :**
        - **Signature :** `public static Connection getConnection(String url, String user, String password) throws SQLException`
        - **Rôle :** Établit une connexion à une base de données en utilisant l'URL de connexion, le nom d'utilisateur et le mot de passe.
        - **Exemple :**
            ```java
            String url = "jdbc:mysql://localhost:3306/database";
            String user = "username";
            String password = "password";
            Connection connection = DriverManager.getConnection(url, user, password);
        ```

### 5.2 Classe `Connection` :


- La classe `Connection` représente une session ouverte avec une base de données. Elle permet d'exécuter des requêtes et de gérer les transactions.


- **Principales méthodes de la classe `Connection` :**

    1. **`createStatement()` :**
        - **Signature :** `public Statement createStatement() throws SQLException`
        - **Rôle :** Crée un objet `Statement` pour envoyer des requêtes SQL à la base de données via cette connexion.
        - **Exemple :**
            ```java
            Statement statement = connection.createStatement();
            ```

    2. **`prepareStatement(String sql)` :**
        - **Signature :** `public PreparedStatement prepareStatement(String sql) throws SQLException`
        - **Rôle :** Prépare une instruction SQL paramétrée pour exécution.
        - **Exemple :**
            ```java
            String sql = "SELECT * FROM table WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ```

    3. **`close()` :**
        - **Signature :** `public void close() throws SQLException`
        - **Rôle :** Ferme la connexion à la base de données.
        - **Exemple :**
            ```java
            connection.close();
            ```


    4. **`setAutoCommit` :**

        - **Rôle :** Cette méthode de l'interface `java.sql.Connection` permet de définir le mode autocommit, qui spécifie si chaque instruction SQL est automatiquement validée comme une transaction distincte.

        - **Signature :** `public void setAutoCommit(boolean autoCommit) throws SQLException`
        
        - **Exemple :** Pour désactiver le mode autocommit et gérer manuellement la transaction :

            ```java
            Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            connexion.setAutoCommit(false); // Désactiver l'autocommit pour gérer manuellement la transaction
            ```

    5. **`commit` :**

        - **Rôle :** Valide et confirme toutes les modifications effectuées dans une transaction en cours.
        
        - **Signature :** `public void commit() throws SQLException`
        
        - **Exemple :** Pour valider une transaction :

            ```java
            connexion.commit(); // Valider les modifications effectuées dans la transaction
            ```

    
    6. **`rollback` :**

        - **Rôle :** Annule toutes les modifications depuis le début de la transaction en cours.
        
        - **Signature :** `public void rollback() throws SQLException`
        
        - **Exemple :** Pour annuler une transaction en cas d'erreur :

            ```java
            connexion.rollback(); // Annuler toutes les modifications depuis le début de la transaction
            ```

    7. **`setSavepoint` :**

        - **Rôle :** Crée un point de sauvegarde dans une transaction en cours pour permettre un retour à ce point en cas d'erreur.
        
        - **Signature :** `public Savepoint setSavepoint(String name) throws SQLException`
        
        - **Exemple :** Créer un point de sauvegarde dans une transaction :

            ```java
            Savepoint savepoint = connexion.setSavepoint("point_de_sauvegarde");
            ```

    8. **`rollback(Savepoint sv)`** 

        - **Role:** est utilisée pour effectuer un rollback partiel dans une transaction jusqu'au point de sauvegarde spécifié (`Savepoint`). 
        

        - **Signature :**

            ```java
            public void rollback(Savepoint sv) throws SQLException
            ```



        - **Exemple d'utilisation :**

            ```java
            Savepoint mySavepoint = null;

            try {
                // ... Autres opérations dans la transaction avant la création du point de sauvegarde

                mySavepoint = connection.setSavepoint("point_de_sauvegarde");

                // ... Autres opérations dans la transaction après la création du point de sauvegarde

                // Une erreur survient
                throw new SQLException("Erreur quelconque");

            } catch (SQLException e) {
                if (mySavepoint != null) {
                    try {
                        connection.rollback(mySavepoint); // Revenir au point de sauvegarde en cas d'erreur
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
            ```



    9. **`getMetaData()`** 


    - **Role :**

        - Elle renvoie un objet de type `DatabaseMetaData` qui fournit des informations sur la base de données associée à la connexion.
        
        - Cette méthode est utilisée pour obtenir des détails sur la base de données connectée.
    
    - **Signature :**

        ```java
        public DatabaseMetaData getMetaData() throws SQLException
        ```


    - **Exemple d'utilisation :**


        ```java
        Connection connection = DriverManager.getConnection(url, user, password);
        DatabaseMetaData metaData = connection.getMetaData();

        System.out.println("Nom du SGBD : " + metaData.getDatabaseProductName());
        System.out.println("Version du SGBD : " + metaData.getDatabaseProductVersion());
        // Autres détails sur la base de données disponibles via DatabaseMetaData
         ```






## 6. les classes `Statement` et `PreparedStatement` :



### 6.1 Classe `Statement` :

- La classe `Statement` permet d'envoyer des requêtes SQL simples à une base de données et d'obtenir des résultats.

- **Principales méthodes de la classe `Statement` :**

    1. **`executeQuery(String sql)` :**
        - **Signature :** `public ResultSet executeQuery(String sql) throws SQLException`
        - **Rôle :** Exécute une requête SQL qui retourne un objet `ResultSet` contenant les résultats de la requête.
        - **Exemple :**
            ```java
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ma_table");
            ```

    2. **`executeUpdate(String sql)` :**
        - **Signature :** `public int executeUpdate(String sql) throws SQLException`
        - **Rôle :** Exécute une requête SQL (INSERT, UPDATE, DELETE) et retourne le nombre de lignes affectées.
        - **Exemple :**
            ```java
            int rowsAffected = statement.executeUpdate("INSERT INTO ma_table (colonne) VALUES ('valeur')");
        ```

### 6.2 Classe `PreparedStatement` :

- La classe `PreparedStatement` étend `Statement` et permet de créer des requêtes SQL précompilées avec des paramètres.

- **Principales méthodes de la classe `PreparedStatement` :**

    1. **`setX(int parameterIndex, Type value)` (Ex. : `setInt()`, `setString()`, `setDate()`, etc.) :**
        - **Signature :** `public void setX(int parameterIndex, Type value) throws SQLException`
        - **Rôle :** Affecte une valeur à un paramètre dans la requête préparée (utilisé pour des requêtes avec des paramètres).
        - **Exemple :**
            ```java
                PreparedStatement stmt = co.prepareStatement("UPDATE product SET product_name =?  WHERE product_name = ?");

                stmt.setString(1, "nv_produit");
                stmt.setString(2, "P1");
            ```

    2. **`executeQuery()` :**
        - **Signature :** `public ResultSet executeQuery() throws SQLException`
        - **Rôle :** Exécute une requête préparée qui retourne un objet `ResultSet` contenant les résultats.
        - **Exemple :**
            ```java
            ResultSet resultSet = stmt.executeQuery();
            ```

    3. **`executeUpdate()` :**
        - **Signature :** `public int executeUpdate() throws SQLException`
        - **Rôle :** Exécute une requête préparée (INSERT, UPDATE, DELETE) et retourne le nombre de lignes affectées.
        - **Exemple :**
            ```java
            int rowsAffected = stmt.executeUpdate();
            ```


### 6.3 la différence entre `PreparedStatement` et `Statement` :

- La différence principale entre `PreparedStatement` et `Statement` réside dans leur utilisation pour exécuter des requêtes SQL et leur impact en termes de performances, sécurité et commodité.

- **``Statement``** :

    - **Requêtes statiques :** Les objets `Statement` sont utilisés pour exécuter des requêtes SQL statiques et non paramétrées.
    - **Moins sécurisé :** L'utilisation de `Statement` peut être moins sécurisée car elle implique souvent la concaténation de chaînes pour former des requêtes, ce qui expose le code aux attaques par injection SQL si des données non fiables sont utilisées.
    - **Moins performant :** Chaque requête est envoyée au SGBD sans analyse préalable, ce qui peut entraîner une perte de performance pour des requêtes répétitives ou fréquentes car elles ne sont pas précompilées.
    - **Convient pour des requêtes simples et statiques :** C'est utile pour les requêtes simples et fixes, sans paramètres dynamiques.

- **``PreparedStatement``** :

    - **Requêtes paramétrées :** Les objets `PreparedStatement` sont utilisés pour exécuter des requêtes SQL paramétrées, permettant d'insérer des paramètres dans la requête.
    - **Plus sécurisé :** Les `PreparedStatement` utilisent des paramètres, ce qui les rend moins vulnérables aux attaques par injection SQL car les paramètres sont traités séparément des commandes SQL.
    - **Meilleures performances :** Ils offrent des meilleures performances, car ils sont précompilés et optimisés pour être réutilisés avec différentes valeurs de paramètres, réduisant ainsi le temps de traitement pour des requêtes répétitives.
    - **Convient pour des requêtes dynamiques :** C'est particulièrement utile pour les requêtes répétitives ou dynamiques avec des paramètres qui varient.



## 7. La classe `ResultSet` :

- La classe `ResultSet` en Java est utilisée pour représenter les résultats d'une requête SQL exécutée sur une base de données. 


- **les principales méthodes de la classe `ResultSet`:**

    1. **`next()` :**
        - **Signature :** `public boolean next() throws SQLException`
        - **Rôle :** Passe à la ligne suivante du `ResultSet`. Renvoie `true` s'il y a une ligne suivante, sinon `false`.
        - **Exemple :**
            ```java
            // Manipulation des données de la ligne actuelle
                    ResultSet res = stm.executeQuery("SELECT * FROM product");

                    while(res.next())
                    {
                        String query = res.getString("product_name");
                        int prix = res.getInt("product_price");
                        System.out.println(query + " vendu au  prix " + prix + " euros ");
                    }     
            ```

    2. **`getString(int columnIndex)` ou `getString(String columnName)` :**

        - **Signature :** `public String getString(int columnIndex) throws SQLException` ou `public String getString(String columnName) throws SQLException`
        - **Rôle :** Renvoie la valeur de la colonne spécifiée sous forme de chaîne de caractères.
        - **Exemple :**
            ```java
            String nom = resultSet.getString("nom");
            ```

    3. **`getInt(int columnIndex)` ou `getInt(String columnName)` :**
        - **Signature :** `public int getInt(int columnIndex) throws SQLException` ou `public int getInt(String columnName) throws SQLException`
        - **Rôle :** Renvoie la valeur de la colonne spécifiée sous forme de nombre entier (`int`).
        - **Exemple :**
            ```java
            int age = resultSet.getInt("age");
            ```

    4. **`getDouble(int columnIndex)` ou `getDouble(String columnName)` :**
        - **Signature :** `public double getDouble(int columnIndex) throws SQLException` ou `public double getDouble(String columnName) throws SQLException`
        - **Rôle :** Renvoie la valeur de la colonne spécifiée sous forme de nombre à virgule flottante (`double`).
        - **Exemple :**
            ```java
            double prix = resultSet.getDouble("prix");
            ```

    5. **`getMetaData()`:** 

        - **Role:**

            - Elle renvoie un objet de type `ResultSetMetaData` qui fournit des informations sur les colonnes du résultat retourné par la requête SQL.
            - Cette méthode est utilisée pour obtenir des détails sur les colonnes du résultat d'une requête.

        - **Signature :**

            ```java
            public ResultSetMetaData getMetaData() throws SQLException
            ```



        - **Exemple d'utilisation :**

            ```java
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ma_table");

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            System.out.println("Nombre de colonnes : " + columnCount);

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Nom de colonne : " + metaData.getColumnName(i));
                System.out.println("Type de données : " + metaData.getColumnTypeName(i));
                // Autres détails sur les colonnes disponibles via ResultSetMetaData
            }
            ```






### RQ :

- JDBC est une technologie puissante mais nécessite des pratiques sécurisées pour éviter les attaques d'injection SQL. Utilisez des requêtes paramétrées pour éviter les vulnérabilités.


## 8. Les transactions en `JDBC` :

### 8.1 gestion de transactions :

- **``mode autocommit``:**
    
    - une transaction commence automatiquement dès l'ouverture d'une connexion. Par défaut, JDBC est en ``mode autocommit``. 
    
    - Cela signifie que chaque instruction SQL est automatiquement validée et commise dans une transaction distincte. 

    -  Par défaut, chaque instruction SQL est automatiquement validée et confirmée comme une transaction distincte. Cela signifie que chaque instruction `INSERT`, `UPDATE`, ou `DELETE` est automatiquement validée dès qu'elle est exécutée.

- **``mode manuelle`` :** 
    
    - Pour désactiver le mode autocommit et gérer manuellement les transactions, utilisez la méthode `setAutoCommit(false)` de l'interface `java.sql.Connection`. Cela permet de démarrer une transaction et de la gérer manuellement.

    - **Commit :** L'appel à la méthode `commit()` de l'interface `java.sql.Connection` valide et confirme toutes les modifications effectuées dans la transaction en cours. Cela rend les modifications permanentes dans la base de données.

    - **Rollback :** En cas d'erreur ou de besoin d'annuler les modifications dans la transaction en cours, l'appel à la méthode `rollback()` de l'interface `java.sql.Connection` annule toutes les modifications depuis le début de la transaction, la ramenant à son état initial.


    - **Exemple:**


```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ma_base_de_donnees";
        String utilisateur = "votre_utilisateur";
        String motDePasse = "votre_mot_de_passe";

        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            // Désactiver le mode autocommit pour gérer manuellement la transaction
            connexion.setAutoCommit(false);

            Statement statement = connexion.createStatement();

            // Exemple : Opération 1 - Insertion d'une nouvelle entrée
            String operation1 = "INSERT INTO ma_table (colonne1, colonne2) VALUES ('valeur1', 'valeur2')";
            statement.executeUpdate(operation1);

            // Exemple : Opération 2 - Mise à jour d'une entrée existante
            String operation2 = "UPDATE ma_table SET colonne1 = 'nouvelle_valeur' WHERE colonne2 = 'valeur2'";
            statement.executeUpdate(operation2);

            // Valider la transaction
            connexion.commit();
            System.out.println("Transaction validée avec succès.");
        }catch(SQLException e) 
        {
            // En cas d'erreur, annuler la transaction
            if (connexion != null) 
            {
                try 
                {
                    connexion.rollback();
                    System.out.println("La transaction a été annulée en raison d'une erreur.");
                } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                }
            }

            e.printStackTrace();
        } finally 
        {
            // Fermer la connexion
            if (connexion != null) 
            {
                try 
                {
                    connexion.close();
                } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                }
            }
        }
    }
}
```


## 8.2 la classe ``Savepoint :``

- La classe `Savepoint` en Java, située dans le package `java.sql`, est utilisée pour marquer un point de sauvegarde à l'intérieur d'une transaction. 

- Elle permet de revenir à ce point particulier dans la transaction en cas de nécessité d'annuler les opérations effectuées après ce point.

- La classe `Savepoint` n'a pas de méthode pour créer un point de sauvegarde directement. 

- Les points de sauvegarde sont créés à l'aide de la méthode `setSavepoint(String name)` de l'interface `java.sql.Connection`, qui retourne un objet `Savepoint`. 

- Une fois créé, cet objet `Savepoint` est utilisé pour effectuer des rollbacks partiels dans une transaction en appelant la méthode `rollback(Savepoint savepoint)` de l'interface `java.sql.Connection`.

- **Principales méthodes de la classe `Savepoint` :**

    1. **`getSavepointId()` :**
        - **Rôle :** Retourne l'identifiant unique du point de sauvegarde.
        - **Signature :** `int getSavepointId() throws SQLException`
        - **Exemple :** Obtient l'identifiant du point de sauvegarde.

        ```java
        int savepointId = savepoint.getSavepointId();
        ```

    2. **`getSavepointName()` :**
        - **Rôle :** Retourne le nom du point de sauvegarde.
        - **Signature :** `String getSavepointName() throws SQLException`
        - **Exemple :** Obtient le nom du point de sauvegarde.

        ```java
        String savepointName = savepoint.getSavepointName();
        ```






### 8.3 **point de sauvegarde :**


- La fonctionnalité de création de points de sauvegarde (Savepoint) et l'abandon partiel (partial rollback) d'une transaction sont des outils avancés dans la gestion des transactions JDBC.


- **Création d'un point de sauvegarde (`setSavepoint`):**

    - La méthode `setSavepoint(String name)` de l'interface `java.sql.Connection` est utilisée pour définir un point de sauvegarde dans une transaction en cours. 
    - Elle renvoie une instance de `java.sql.Savepoint`.

- **Exemple d'utilisation :**

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavepointExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ma_base_de_donnees";
        String utilisateur = "votre_utilisateur";
        String motDePasse = "votre_mot_de_passe";

        Connection connexion = null;
        Savepoint savepoint = null;

        try {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            connexion.setAutoCommit(false);

            Statement statement = connexion.createStatement();

            // Effectuer des opérations SQL
            statement.executeUpdate("INSERT INTO ma_table (colonne1, colonne2) VALUES ('valeur1', 'valeur2')");

            // Création d'un point de sauvegarde
            savepoint = connexion.setSavepoint("point_de_sauvegarde");

            // Effectuer d'autres opérations SQL
            statement.executeUpdate("UPDATE ma_table SET colonne1 = 'nouvelle_valeur' WHERE colonne2 = 'valeur2'");

            connexion.commit();
            System.out.println("Transaction validée avec succès.");
        } catch (SQLException e) {
            if (connexion != null) {
                try {
                    // Retourner au point de sauvegarde en cas d'erreur
                    connexion.rollback(savepoint);
                    connexion.commit(); // Valider les opérations effectuées jusqu'au point de sauvegarde
                    System.out.println("Transaction annulée jusqu'au point de sauvegarde.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (connexion != null) {
                try {
                    connexion.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
```









## 9. ``Les métadonnées``: `ResultSetMetaData` et `DatabaseMetaData`

### 9.1. **Les  métadonnées: Définition** 

- **Définition:**

    - Les métadonnées en bases de données (BD) sont des données qui décrivent les caractéristiques et les propriétés des données stockées dans la base de données elle-même. 

    - Elles fournissent des informations sur la structure, l'organisation et d'autres détails sur les données.

- **les informations que les métadonnées peuvent fournir:**

    1. **Schéma de la base de données :** Les métadonnées peuvent révéler des informations sur la structure de la base de données, telles que les noms des tables, des vues, des procédures stockées, etc.

    2. **Propriétés des tables :** Elles donnent des détails sur les colonnes de chaque table, y compris les types de données, les contraintes, les clés primaires et étrangères.

    3. **Statistiques :** Les métadonnées peuvent contenir des informations sur les statistiques de la base de données, telles que la taille des tables, le nombre de lignes, les index, les espaces disque utilisés, etc.

    4. **Sécurité :** Elles peuvent contenir des informations sur les autorisations d'accès, indiquant qui a accès à quelles données et avec quelles permissions.

    5. **Historique :** Certaines métadonnées peuvent enregistrer des informations sur les modifications, les mises à jour ou les suppressions effectuées sur les données.





### 9.2 **les métadonnées pour un résultat de requêt: ``ResultSetMetaData``**


- La classe `ResultSetMetaData` en Java, présente dans le package `java.sql`, est utilisée pour obtenir des informations sur les métadonnées du résultat d'une requête, telles que les noms des colonnes, les types de données.


- **Principales méthodes de la classe `ResultSetMetaData` :**

1. **`getColumnCount()` :**
   - **Rôle :** Renvoie le nombre de colonnes dans le résultat de la requête.
   - **Signature :** `int getColumnCount() throws SQLException`
   - **Exemple :**

    ```java
    ResultSetMetaData metaData = resultSet.getMetaData();
    int numberOfColumns = metaData.getColumnCount();
    ```

2. **`getColumnName(int column)` :**
   - **Rôle :** Renvoie le nom de la colonne à l'indice spécifié.
   - **Signature :** `String getColumnName(int column) throws SQLException`
   - **Exemple :**

    ```java
    String columnName = metaData.getColumnName(1); // Obtient le nom de la première colonne
    ```

3. **`getColumnType(int column)` :**
   - **Rôle :** Renvoie le type SQL de la colonne à l'indice spécifié.
   - **Signature :** `int getColumnType(int column) throws SQLException`
   - **Exemple :**

    ```java
    int columnType = metaData.getColumnType(2); // Obtient le type de la deuxième colonne
    ```

4. **`getColumnTypeName(int column)` :**
   - **Rôle :** Renvoie le nom de type de données de la colonne à l'indice spécifié.
   - **Signature :** `String getColumnTypeName(int column) throws SQLException`
   - **Exemple :**

    ```java
    String columnTypeName = metaData.getColumnTypeName(3); // Obtient le nom du type de la troisième colonne
    ```

5. **`isNullable(int column)` :**
   - **Rôle :** Renvoie la possibilité pour la colonne d'accepter les valeurs NULL.
   - **Signature :** `int isNullable(int column) throws SQLException`
   - **Exemple :**

    ```java
    int isNullable = metaData.isNullable(4); // Vérifie si la quatrième colonne accepte les valeurs NULL
    ```


### 9.3 **les métadonnées pour toute la base: ``DatabaseMetaData``**

- La classe `DatabaseMetaData` en Java, située dans le package `java.sql`, est utilisée pour obtenir des informations sur les métadonnées de toute la base de données, y compris des détails sur la base de données elle-même, les tables, les colonnes, les procédures stockées, les contraintes .


- **Principales méthodes de la classe `DatabaseMetaData` :**

1. **`getDatabaseProductName()` :**

   - **Rôle :** Renvoie le nom du SGBD (Système de Gestion de Base de Données).

   - **Signature :** `String getDatabaseProductName() throws SQLException`

   - **Exemple :**

        ```java
        DatabaseMetaData metaData = connection.getMetaData();
        String dbName = metaData.getDatabaseProductName();
        ```

2. **`getDatabaseProductVersion()` :**

   - **Rôle :** Renvoie la version du SGBD.

   - **Signature :** `String getDatabaseProductVersion() throws SQLException`

   - **Exemple :**

        ```java
        String dbVersion = metaData.getDatabaseProductVersion();
        ```

3. **`getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types)` :**

   - **Rôle :** Renvoie un `ResultSet` contenant des informations sur les tables de la base de données.

   - **Signature :** `ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) throws SQLException`

   - **Exemple :**

        ```java
        ResultSet tables = metaData.getTables(null, null, null, new String[] { "TABLE" });
        ```

4. **`getColumns(String catalog, String schemaPattern, String tableName, String columnNamePattern)` :**

   - **Rôle :** Renvoie un `ResultSet` contenant des informations sur les colonnes d'une table spécifique.

   - **Signature :** `ResultSet getColumns(String catalog, String schemaPattern, String tableName, String columnNamePattern) throws SQLException`

   - **Exemple :**

        ```java
        ResultSet columns = metaData.getColumns(null, null, "ma_table", null);
        ```

5. **`getPrimaryKeys(String catalog, String schema, String table)` :**

   - **Rôle :** Renvoie un `ResultSet` contenant des informations sur les clés primaires de la table spécifiée.

   - **Signature :** `ResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException`

   - **Exemple :**

        ```java
        ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, "ma_table");
        ```







