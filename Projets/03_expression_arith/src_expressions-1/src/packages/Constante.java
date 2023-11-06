package packages;

public class Constante extends ExpAbstraite
{
    
    private double val ;

    public double getVal()
    {
        return this.val;
    }

    // un constructeur : 

    public Constante(double valeur)
    {
        this.val = valeur ;
    }


    // l'implémentation de la méthode toStringInfixe :

    @Override
    public String toStringInfixe()
    {
        String chaine = ""+this.val;

        return chaine ;
    }

    @Override
    public double evaluer(Env env)
    {
        
        env.getHashMap().put(""+this.val ,this.val);

        return this.val ;
    }

    @Override
    public ExpAbstraite calculerDerivee()
    {
        
        return new Constante(0);
    }
}
