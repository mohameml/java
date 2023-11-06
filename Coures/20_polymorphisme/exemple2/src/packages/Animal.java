package packages ;

public class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void crier() {
        System.out.println("Je ne sais pas comment crier !");
    }

    public void crier(String raison) {
        System.out.print("Je vais crier car " + raison);
        crier();
    }

    public String toString() {
        return "Mon nom est " + nom + ". Je suis un Animal ";
    }
}
