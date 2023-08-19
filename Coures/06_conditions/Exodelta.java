
public class Exodelta {
    /*
     * Dans ce exercice on écrit un programme qui prendre comme arguments a, b et c
     * 
     * et il résoudre l'équation de seconde dégree : aX**2 + bX + c = 0
     * 
     */

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // la méthode parseInt de la classe Integer permet de converti : String-->
                                           // int
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int x = 0;

        if (a == 0) {
            // si a= 0 alos x = -c/b
            x = -c / b;
            System.out.println("la solution est x = " + x);
        } else {
            int delta = (int) Math.pow((double) b, (double) 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Il n'y a pas de solutions réelles pour votre équation !!!!!!");

            } else if (delta == 0) {
                // il y'a une seulle solution x = -b/2a
                x = -b / (2 * a);
                System.out.println("lasolution est x = " + x);

            } else {
                // il y'a deux solution
                int sqrt_delta = (int) Math.pow((double) delta, (double) 1 / 2);
                int x1 = (-b + sqrt_delta) / (2 * a);
                x = (-b - sqrt_delta) / (2 * a);
                System.out.println("L'ensemble de soultion est  : " + "{" + x1 + "," + x + "}");
            }
        }

    }

}
