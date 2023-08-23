
public class Tableau1D {

    public static void afficherTab1D(int[] tab) {
        for (int elem : tab) {
            System.out.println(elem);
        }
    }

    public static int[] inverserTab1D(int[] tab) {

        int len = tab.length;
        int[] tabInverse = new int[len];

        for (int i = 0; i < len; i++) {
            tabInverse[i] = tab[len - i - 1];
        }

        return tabInverse;

    }

    public static void main(String[] args) {
        // on definit un tableau 1D :

        int tab[] = { 1, 2, 3, 4, 5, 6, 7 };

        // acceder a un élement d'un tablaeux
        System.out.println(tab[0]);

        // Afficher les élements d'un Tableaux

        /*
         * Méthode 1 :
         */

        System.out.println("------- Méthode 1 ---------- ");
        for (int i = 0; i < tab.length; ++i) {
            System.out.println(tab[i]);
        }

        /*
         * Méthode 2 :
         */
        System.out.println("------- Méthode 2 ---------- ");
        for (int elem : tab) {
            System.out.println(elem);
        }

        int[] tabTest = new int[10];
        System.out.println("----- tabTest --------");

        tabTest[0] = 12;
        afficherTab1D(tabTest);

        System.out.println("----- Test de la fonction d'inverse : ---------");
        int[] tabInverse = inverserTab1D(tabTest);
        afficherTab1D(tabInverse);

    }

}
