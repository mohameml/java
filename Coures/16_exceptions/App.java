import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Entrez votre age svp : ");

            int age = scanner.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException("Vous étes mineur !!!!");
            }

        } catch (InputMismatchException e) {
            System.out.println("la sasie d'age est invaliede");
        } finally {
            scanner.close();
        }

    }

}
