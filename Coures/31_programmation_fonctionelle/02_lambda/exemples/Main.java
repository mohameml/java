import java.util.Arrays;

@FunctionalInterface
interface FonctionAUnArgumentEntier {
    public int f(int x);
}

public class Main {


    public static int[] map(int[] tab, FonctionAUnArgumentEntier lambda) 
    {
        int[] resultat = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            resultat[i] = lambda.f(tab[i]);
        }
        return resultat;
    }
    public static void main(String[] args) {
        
        // programmation fonctionelle en java :

        int[] tableau = {1, 2, 3, 4, 5};

        FonctionAUnArgumentEntier carre = new FonctionAUnArgumentEntier() {
            public int f(int x) {return x * x;}
        };

        FonctionAUnArgumentEntier carrenv = x -> x * x; // une expréssion lambda 

        FonctionAUnArgumentEntier cube = new FonctionAUnArgumentEntier() {
            public int f(int x) {return x * x * x;}
        };
        System.out.println(Arrays.toString(tableau));
        System.out.println(Arrays.toString(map(tableau, carre)));
        System.out.println(Arrays.toString(map(tableau, carrenv)));

        System.out.println(Arrays.toString(map(tableau, cube)));
        System.out.println(Arrays.toString(map(tableau, x -> x*x*x)));

    }




}
