package fr.exemple;

import fr.exemple.entites.Player;

public class App 
{

    public static int add(int a , int b)
    {
        return a+b ;
    }

    public static void main( String[] args )
    {
        int a = 10 ;
        int b = 15 ;

        int c = add(a,b);

        System.out.println("la somme de a , b est " + c);

        System.out.println("Hello from Main");
        
        System.out.println("======= Player =========");
        Player p = new Player("sidi", 10);

        System.out.println(p);
    
    }
}
