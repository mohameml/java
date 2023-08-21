public class Compte {

    // classe qui répresente un compte bancaire

    // Les attributs
    public double solde;

    // Un construcuteur

    public Compte(double solde) {
        this.solde = solde;
    }

    // Les Méthodes

    public void deposer(double montant) {
        // cette fonction gére les versements

        this.solde += montant;

    }

    public void retirer(double montant) {
        this.solde -= montant;
    }

    public void afficher() {
        System.out.println("Votre solde : " + this.solde + "Euro");
    }

}
