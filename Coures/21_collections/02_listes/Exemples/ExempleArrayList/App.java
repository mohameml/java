import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void afficherArrayList(ArrayList<Integer> l) {

        for (int i = 0; i < l.size(); i++) {
            System.out.printf("l[%d]=%d \n", i, l.get(i));
        }

    }

    public static void main(String[] args) {
        // On définti une Liste dynamique :

        ArrayList<Integer> l = new ArrayList<Integer>();

        // On ajout des élements :
        l.add(2);
        l.add(1);
        l.add(4);
        l.add(0);

        // On parcour les élements :

        /*
         * 
         * Méthode 1 : Boucle foreach :
         */
        int j = 0;
        for (int i : l) {
            System.out.printf("l[%d]=%d\n", j, i);
            j++;
        }
        System.out.println("");

        /*
         * Méthode 2 : Boucle for
         */

        for (int i = 0; i < l.size(); i++) {
            System.out.printf("l[%d]=%d \n", i, l.get(i));
        }
        System.out.println("");

        // trie les élemnts :

        Collections.sort(l);
        afficherArrayList(l);
    }

}
