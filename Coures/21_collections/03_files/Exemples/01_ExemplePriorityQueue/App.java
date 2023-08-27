import java.util.PriorityQueue;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // on instance un PriorityQueur :

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // on ajout des élements :
        // RQ : on ne peut pas ajouter null
        pq.add(155);
        pq.add(8);
        pq.add(0);
        pq.add(-14);
        pq.add(365);

        Iterator<Integer> ptr = pq.iterator();

        while (ptr.hasNext()) {
            System.out.println(ptr.next());
        }

        // on récupere l'élemnt le plus priortére
        System.out.println(pq.poll());

        System.out.println("");

        // file de priorité de String :
        PriorityQueue<String> fileStr = new PriorityQueue<String>();

        // on ajoute les élemnts :
        fileStr.add("Nebil");
        fileStr.add("Ahmed");
        fileStr.add("Khaled");

        Iterator<String> ptrFileStr = fileStr.iterator();

        while (ptrFileStr.hasNext()) {
            System.out.println(ptrFileStr.next());
        }

    }
}
