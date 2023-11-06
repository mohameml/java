import packages.*;

public class TestAffichageInfixe {
    public static void main(String[] args) {
        ExpAbstraite exp;

        // teste l'expression préfixée 42
        exp = new Constante(42) ;
        System.out.println(exp.toStringInfixe());
    
        // Décommentez la suite des tests au furet à mesure (!) de votre avancement

        // // teste l'expression préfixée *  y  3
        exp = new BinaireMult(new Variable("y"), new Constante(3)) ;
        System.out.println(exp.toStringInfixe());

        // teste l'expression préfixée * + x x 5
        exp = new BinaireMult(
                new BinairePlus(
                    new Variable("x"),
                    new Variable("x")
                    ),
                new Constante(5)
                );
        System.out.println(exp); // et pas toStringInfixe; juste comme ça

        // teste l'expression préfixée * -3.5 sin + a b
        exp = new BinaireMult(
                new Constante(-3.5),
                new UnaireSin(
                    new BinairePlus(
                        new Variable("a"),
                        new Variable("b")
                        )
                    )
                );
        System.out.println(exp);
    }
}
