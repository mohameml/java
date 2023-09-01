import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // on définit un HashSet
        HashSet<Integer> hs = new HashSet<Integer>();

        // On ajout les élemnts

        hs.add(12);
        hs.add(21);
        hs.add(23);

        // On parcourir le HashSet

        Iterator<Integer> it = hs.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println("FIN");

    }
}