import com.Zoo;
import com.Animal;
import com.Canard;
import com.Vache;
import java.util.LinkedList;

public class  Test_zoo_Ensimag
{
    
    public static void main(String[] args)
    {
        Zoo zoo_ensimag = new Zoo("ensimag");
        // zoo_ensimag.ajouteAnimal(new Animal("Marie",56));
        // zoo_ensimag.ajouteAnimal(new Animal("Matthieu",70));
        // zoo_ensimag.ajouteAnimal(new Animal("Matthieu",80));
        // zoo_ensimag.ajouteAnimal(new Animal("Akram",67));
        // zoo_ensimag.ajouteAnimal(new Animal("Thang",78));
        // zoo_ensimag.ajouteAnimal(new Animal("Karine",67));
        // zoo_ensimag.ajouteAnimal(new Animal("Nicolas", 65));
        // zoo_ensimag.ajouteAnimal(new Animal("Djamel",78));


        // on ajout des nouveaux animaux de type spécifiques :
        zoo_ensimag.ajouteAnimal(new Canard("Canard 1",40 , "noir"));
        zoo_ensimag.ajouteAnimal(new Canard("Canard 2",42 , "bleu"));
        zoo_ensimag.ajouteAnimal(new Vache("vache1",100 , 6));


        zoo_ensimag.crier();


        Canard c1 = new Canard("popi" , 16 , "noir");
        System.out.println(c1.toString());


        double Toatl = calculNourriTotal(zoo_ensimag);

        System.out.println("Le cout total de votre zoo en 1j est : "+ Toatl); 
    }


    public static double  calculNourriTotal(Zoo z)
    {
        float sum = 0 ;
        LinkedList<Animal> animaux = z.getAnimaux();
        for(Animal a : animaux)
        {
            double n = a.calculNourriture();
        
            if( n == -1)
            {
                System.out.println("Erreur ..... ");
            }
            else 
            {
                sum+=n;
            }
        }

        return sum ;
    }





}