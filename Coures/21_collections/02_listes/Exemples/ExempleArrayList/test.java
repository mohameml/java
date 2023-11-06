import java.util.ArrayList;
import java.util.Iterator;

public class test {

    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<String>();


        // l'ajout des élemenst :
        l.add("sidi1");
        l.add("sidi2");
        l.add("sidi3");
        l.add("sidi4");
        l.add("sidi5");
        l.add("sidi6");


        // afficher les élements :

        for(int i =0 ; i< l.size() ;i++)
        {
            System.out.printf("l[%d] = %s \n" , i , l.get(i));
        }


        // la fonction size() :
        System.out.println("la taille de L est : " + l.size());

        // la fonction get :

        int indice = 1 ;

        String chaine = l.get(indice); // pour récupere l'élement d'indice égale à 1 .

        System.out.println(chaine);


        // la fonction set( int index , E elem ) :

        l.set(1 , "khaled");

        System.out.println(l.get(1));


        // la fonction remove( int index) :

        l.remove(0);
        System.out.println(l.get(0));


        // la méthode contains <-> en python in :

        boolean b = l.contains("sidi3");

        System.out.println(b);




        // boucle foreach :


        for(String str : l)
        {
            System.out.println(str);
        }


        // la boucle Iterator 

        Iterator<String>  itr = l.iterator(); // on defint un iterator sur notre objet  

        while(itr.hasNext())
        {
            String str = itr.next();
            System.out.println(str);
        }


    }
    
}
