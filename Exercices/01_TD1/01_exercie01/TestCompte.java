public class TestCompte {

    public static void main(String[] args) {
        // le tset de la classe Compte

        Compte nebil = new Compte(2000.0);

        nebil.afficher();

        // on fait un versement

        nebil.deposer(500.0);
        nebil.afficher();

        // on fait un retrait

        nebil.retirer(1000.0);
        nebil.afficher();
    }

}
