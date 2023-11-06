import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;







public class test {




    public static String  trouvreCles(HashMap<String , Integer>  dict , int value)
    {

        for(Map.Entry<String, Integer> entry : dict.entrySet())
        {
            if(entry.getValue().equals(value))
            {
                return entry.getKey();
            }
        }
        
        return "None";
    }


    public static void main(String[] args) {
        
        HashMap<String , Integer> dict = new HashMap<String , Integer>();

        dict.put("sidi1" , 12);
        dict.put("sidi2" , 13);
        dict.put("sidi3" , 14);
        dict.put("sidi4" , 20);

        System.out.println(dict);

        // init de Saccner :
        Scanner sc = new Scanner(System.in);

        // la fonbction get : 

        System.out.printf("écrire votre nom ici : ");
        String nom = sc.nextLine();

        if(dict.get(nom)==null)
        {
            System.out.println("Désolle !!!!!!");
        }
        else 
        {
            System.out.printf("l'age de %s  est : %d \n" , nom , dict.get(nom));
        }
    
    
        
        sc.close();



        // la fonction remove :

        dict.remove("sidi1");
        System.out.println(dict);

        //  containsKey / containsValue 

        boolean b1 = dict.containsKey("sidi1");
        System.out.println(b1);

        boolean b2 = dict.containsValue(20);

        if(b2)
        {
            System.out.println("oui et c'est le personne " + trouvreCles(dict, 20));
        }
    }
    
}
