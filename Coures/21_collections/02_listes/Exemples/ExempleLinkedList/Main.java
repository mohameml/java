import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // definr une liste chaineé : LinkedList

        LinkedList<Integer> ldc = new LinkedList<Integer>();

        // On ajout des élemnts :
        ldc.add(1);
        ldc.add(2);
        ldc.add(4);

        // on affiche les élemnts :

        for (int i : ldc) {
            System.out.print(i + "-> ");
        }
        System.out.println("");

        // optimisation de parcour :

        ListIterator<Integer> ptr = ldc.listIterator();

        while (ptr.hasNext()) {
            System.out.println(ptr.next());
        }

    }

}
