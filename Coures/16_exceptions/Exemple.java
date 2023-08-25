import java.util.*;

public class Exemple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Quelle est votre age : ");
            int age = scanner.nextInt();

            System.out.println("Votre age est :" + age);

        } catch (InputMismatchException e) {
            System.out.println("Errure :" + e.getMessage());
            e.printStackTrace();
            System.out.println("Exception est :" + e);

            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause : " + cause.getMessage());
            }

        } finally {
            scanner.close();
        }
    }

}
