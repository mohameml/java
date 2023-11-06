import java.util.PriorityQueue;
import java.util.Iterator;


public class test {
    

    public static void main(String[] args) {
        

        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        

        p.add(12);
        p.add(5);
        p.add(20);



        for(Integer i : p)
        {
            System.out.println(i);
        }


        System.out.println("la taille de p est :"  + p.size());
        // récupere l'élment de priorité le plus éleve :

        int e = p.poll();
        System.out.println("la tàche le plus priorité est " + e);
               
        System.out.println("la taille de p est :"  + p.size());



        // la fonction peek 

        System.out.println("la tache le plus prioritére mnt est : " + p.peek());
    }

}
