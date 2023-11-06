package packages;


public class PangolinALongueQueue extends Pangolin {
    private int longueurQueue;

    public PangolinALongueQueue(String nom, int nbEcailles, int longueurQueue) {
        super(nom, nbEcailles);
        this.longueurQueue = longueurQueue;
    }

    @Override
    public crier() {
        System.out.print("Qeyyyoouuuu "); // partie spécifique
        super.crier();                    // partie commune (réutilisation)
    }

    @Override
    public String toString() {
        return super.toString()
            + "\nMais je suis aussi un Pangolin spécial : en plus, j'ai une queue de "
            + longueurQueue + " cm !";
    }
}