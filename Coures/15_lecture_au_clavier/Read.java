import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) throws Exception {

        BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));

        // On test :
        System.out.print("Quelle est votre nom :");
        String name = clavier.readLine();

        System.out.println(name);

        // On tset mnt Scanner
        Scanner sc = new Scanner(System.in);

        // ...

        System.out.print("Quelle est votre age : ");
        int nombre = sc.nextInt();
        sc.nextLine(); // Consommer le caractère de nouvelle ligne restant

        System.out.print("Quelle est votre nom : ");
        String nom = sc.nextLine();

        System.out.printf("Votre nom est %s et votre age est %d\n", nom, nombre);

        sc.close();

    }

}
