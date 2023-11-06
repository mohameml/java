package packages;

public class Prof extends Animal {
    private int nbEtudiants;

    public Prof(String nom, int nbEtudiants) {
       super(nom);
       setNbEtudiants(nbEtudiants);
    }

    public void setNbEtudiants(int nbEtudiants) {
        if(nbEtudiants < 0) {
            throw new IllegalArgumentException("nbEtudiants négatif !");
        }
    }

    @Override
    public void crier() {
        System.out.println("Grrrr !");
    }

    @Override
    public String toString() {
        return super.toString() + "de type Prof. " + " J'ai " + nbEtudiants + " étudiants";
    }
}