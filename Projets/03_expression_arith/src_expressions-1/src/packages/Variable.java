package packages;

public class Variable extends ExpAbstraite 
{
    private String nom ;
    
    public String getNom()
    {
        return this.nom;
    }


    public Variable(String var)
    {
        this.nom = var ;
    }

    @Override
    public String toStringInfixe()
    {
        return this.nom;
    }

    @Override
    public double evaluer(Env env)
    {
        return env.getHashMap().get(nom);

    }

    @Override
    public ExpAbstraite calculerDerivee()
    {
        return new Constante(1);      
    }
}
