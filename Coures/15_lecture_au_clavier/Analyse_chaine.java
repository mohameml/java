import java.util.Scanner;

public class Analyse_chaine {


    public static void main(String[] args) {

    String exprString = "Ceci est un exemple.";
    Scanner sc = new Scanner(exprString);
    
    while (sc.hasNext()) {
        String mot = sc.next(); // Lire un mot à la fois
        System.out.println(mot);
    }
    
    sc.close(); // N'oubliez pas de fermer le Scanner à la fin de son utilisation
    }
    
}
