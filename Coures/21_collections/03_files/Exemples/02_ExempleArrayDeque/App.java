import java.util.ArrayDeque;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();

        adq.addFirst(2);
        adq.addFirst(14);
        adq.addFirst(0);

        Iterator<Integer> it = adq.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // la méthode push

        System.out.println("------ Pile ------");
        ArrayDeque<Integer> pile = new ArrayDeque<Integer>();

        pile.push(3);
        pile.push(2);
        pile.push(5);
        pile.push(0);
        Iterator<Integer> ptrPile = pile.iterator();

        while (ptrPile.hasNext()) {
            System.out.println(ptrPile.next());
        }
    }
}
