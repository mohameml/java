package packages;

abstract public class ExpAbstraite
{
    // une Méthode abstarite
    abstract public  String toStringInfixe();

    /**
     * 
     * @param env : la classe env 
     * 
     * @return 
     *  - le rôle est de calculer la valeur de l’expression en fonction des valeurs des variables
        - stockées dans l’environnement env passé en paramètre
     * 
     */
    abstract public double evaluer(Env env);



    // 
    abstract public  ExpAbstraite calculerDerivee();


    // méthode toString : 
    @Override
    public String toString()
    {
        String chaine = "Je suis une expression et me voila en notation infixée :"+this.toStringInfixe() ;
    
        return chaine ;
    }

}