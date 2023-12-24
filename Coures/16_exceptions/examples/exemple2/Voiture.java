public class Voiture {

    String marke ;
    int vitesse;

    public Voiture(String marke , int v) throws voitureException
    {
        this.marke = marke;

        if(v < 0 )
        {
            throw new voitureException("la vitesse d'une voiture ne peut pas étre négative ..\n");
        }
        this.vitesse = v ;

    }



    @Override 
    public String toString()
    {
        String chaine = String.format("la voiture de marque %s est de vitesse %d ", this.marke , this.vitesse);

        return chaine;
    }
}
