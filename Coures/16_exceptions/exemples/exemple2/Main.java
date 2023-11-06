public class Main {


    public static void main(String[] args) 
    {

        try 
        {
        Voiture v1 = new Voiture("Toto1",120);
    
        Voiture v2 = new Voiture("Toto2",20);

        System.out.println(v1);
        System.out.println(v2);
    
        }
        catch(ArithmeticException e)
        {
            System.out.println("il y'a une exception ...");
        }
    }
    
}
