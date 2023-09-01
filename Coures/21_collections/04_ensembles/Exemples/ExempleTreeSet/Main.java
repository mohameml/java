import java.util.TreeSet;

import java.util.Iterator;
import java.util.SortedSet;

public class Main {

    public static void afficheTreeSet(SortedSet<Integer> tree) {

        Iterator<Integer> it = tree.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println("");

    }

    public static void main(String[] args) {
        // on instancie un TreeSet
        TreeSet<Integer> ABR = new TreeSet<Integer>();

        // on ajoute des élements :

        ABR.add(1);
        ABR.add(12);
        ABR.add(5);
        ABR.add(2);
        ABR.add(10);

        // on percour le ABR

        afficheTreeSet(ABR);
        // on supprime 12
        ABR.remove(12);
        afficheTreeSet(ABR);

        // les méthodes : contains

        if (ABR.contains(13)) {
            System.out.println("Cette TreeSet contient 13");
        } else {
            System.out.println("Cette TreeSet ne  contient pas 13");

        }

        // les méthodes first et last :

        int theFisrt = ABR.first();
        int thelast = ABR.last();

        System.out.println("The first in the ABR is " + theFisrt);
        System.out.println("The last in the ABR is " + thelast);

        // les méthodes de Extraction :

        SortedSet<Integer> exempleHeadSet = ABR.headSet(5);
        afficheTreeSet(exempleHeadSet);

        SortedSet<Integer> exempleTielSet = ABR.tailSet(2);
        afficheTreeSet(exempleTielSet);

        SortedSet<Integer> exempleSuBSet = ABR.subSet(2, 10);
        afficheTreeSet(exempleSuBSet);
    }

}
