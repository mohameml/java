import java.lang.ArithmeticException;

public class testRational {

    public static void main(String[] args) {

        try {
            Rational r = new Rational(3, 2);

            System.out.printf("r est un nombre rationel : n=%d , d=%d \n", r.getenum(), r.getdenom());
            System.out.println(r.toString());

            // création d'un autre rational :
            Rational r2 = new Rational(1, 0);
            System.out.println(r2.toString());

        } catch (RationalException e) {
            System.out.println("Errure :" + e.getMessage());
        }

        // Test de la Méthode mul :

        try {
            Rational r1 = new Rational(2, 3);
            Rational r2 = new Rational(1, 2);

            // Test de mult
            r1.mult(r2);
            System.out.println("r1*r2 =" + r1);

            // Testt de add
            r1.add(r2);
            System.out.println("r1+r2 = " + r1);

            // Test de la classe ReduceRational :
            ReduceRational r3 = new ReduceRational(10, 12);
            System.out.println(r3.toString());
        } catch (RationalException e) {
            System.out.println("Errure : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errure :" + e.getMessage());
        }

    }

}
