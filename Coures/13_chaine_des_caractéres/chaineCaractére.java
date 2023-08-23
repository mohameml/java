
public class chaineCaractére {

    public static void main(String[] args) {
        String chaine1 = "Bonjour";
        String chaine2 = "tout le mond !!";

        System.out.println(chaine1 + " " + chaine2);

        // version de concatantion optimisé
        System.out.println(chaine1.concat(" ").concat(chaine2));

        // Test de la Méthode substring() :
        System.out.println("----- substring() ------");
        String chaine = "la vie est belle";
        System.out.println(chaine.substring(3, 10));

        // Test de la Méthode split()
        System.out.println("----- Test de split() ------------");
        String chaineSplit = "pomme,orange,banana,ananase";

        String[] fruits = chaineSplit.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Test de formatage :

        System.out.println("-------- Test de String.format()");
        String name = "Sidi";
        int age = 22;

        String affiche = String.format("Je suis %s et j'ai %d ans", name, age);
        System.out.println(affiche);

        System.out.println("----- Test de printf() -----");

        System.out.printf("Bonjour je suis %s et j'ai %d ans \n", name, age);

        // Test de la fonction compareTo :

        String lettre1 = "a";
        String lettre2 = "A";

        System.out.println(lettre1.compareTo(lettre2)); // 32

        // la difference entre une chaine vie et null

        String chaine3; // null
        String chaine4 = ""; // vide et non null
        // System.out.println(chaine3); // null
        System.out.println(chaine4); // ""

    }

}
