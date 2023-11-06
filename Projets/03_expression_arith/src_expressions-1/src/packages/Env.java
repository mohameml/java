package packages;
import java.util.HashMap;


public class Env
{
     
    // private int valeur ;

    // private String nom ;
    
    private HashMap<String , Double> dict = new HashMap<>() ;

    public HashMap<String , Double> getHashMap()
    {
        return this.dict;
    }

    public Env()
    {
        
    }



    // associer(nom : String , valeur : double )

    public void associer(String nom ,double  val)
    {
        dict.put(nom , val);
    }


    // obtenirValeur(nom : String) : int 

    public double  obtenirValeur(String nom)
    {
        return dict.get(nom);
    }

    // toString() : String 
    @Override
    public String toString()
    {
        return dict.toString();
    }






}