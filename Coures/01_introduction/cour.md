# Cour 01 : introduction à JAVA 

## 1.Définition 

**JAVA** est un langage entièrement orienté objet, ce qui signifie que tout en Java est un objet avec des attributs (variables) et des méthodes (fonctions) pour interagir avec ces objets. La programmation orientée objet permet d'organiser le code de manière modulaire et facilite la réutilisation du code.


## 2.Comment compiler MonProgramme.java :

Pour compiler un programme Java, vous aurez besoin du kit de développement Java (JDK) installé sur votre système. Le JDK contient tous les outils nécessaires pour développer et compiler des programmes Java.

Voici les étapes pour compiler un programme Java :

1. **Installez le JDK :** : 
```bash
sudo apt install openjdk-11-jre
```

2. **Compilez le code Java :** Utilisez la commande `javac` pour compiler votre programme Java :

```bash
javac MonProgramme.java
```

Si le code Java est correct et qu'il n'y a pas d'erreurs, cette commande générera un fichier `MonProgramme.class`, qui contient le bytecode Java compilé.

3. **Exécutez le programme :** Après la compilation, vous pouvez exécuter votre programme en utilisant la commande `java` suivie du nom de la classe principale (celle qui contient la méthode `main`).

```bash
java MonProgramme
```


### RQ : 

N'oubliez pas que chaque classe que vous créez dans votre programme Java doit être définie dans un fichier distinct avec le nom de la classe suivi de l'extension `.java`. Par exemple, si vous avez plusieurs classes dans votre programme, chacune d'elles doit être définie dans un fichier séparé, mais vous n'aurez besoin de compiler que le fichier contenant la classe principale (celle avec la méthode `main`).