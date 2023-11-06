


public class Vache extends Animal {
    
    private int nbTache ;


    public int getNbTache()
    {
        return this.nbTache;
    }

    public Vache(String nom , int poids , int nb)
    {
        super(nom , poids);
        this.nbTache = nb ;
    }


    @Override
    public void crier()
    {
        System.out.println("Crier .....Vache ");
    }


    @Override 
    public  String toString()
    {
        String chaine = "La vache "+ this.name + " de poids " + this.poids + "kg ";

        return chaine;
    }

}
