import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez votre taille : ");
        double taille = scanner.nextDouble();

        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Taille : " + taille);

        scanner.close();
    }
}
