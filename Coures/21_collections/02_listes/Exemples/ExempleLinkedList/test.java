import java.util.LinkedList;
import java.util.Iterator;


public class test {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        


        LinkedList<String> ldc = new LinkedList<String>();
 
        
        // on ajout des élements :
        ldc.addFirst("sidi1");
        ldc.addFirst("sidi2");
        ldc.addFirst("sidi3");
        ldc.addFirst("sidi4");
        ldc.addLast("sidi5");




        // parcour :


        for(String str : ldc)
        {
            System.out.println(str);
        }




        System.err.println("la taill de votre ldcc est : " + ldc.size());

        // on supp le 1ere élment :
        ldc.removeFirst();


        // parcour à ll'aide d'un Iterator :

        Iterator<String>  itr = ldc.iterator();

        while(itr.hasNext())
        {
            String str = itr.next();
            
            System.out.println(str);
        }


        // la taille denotre linkedlist :

        System.err.println("la taill de votre ldcc est : " + ldc.size());


    }
}
