package packages;

abstract public class ExpBinaire extends ExpAbstraite{

    protected ExpAbstraite opGauche ;
    
    protected ExpAbstraite  opDroite ;

    protected String opérateur ;


    // un constructeur : 
    public ExpBinaire(ExpAbstraite opg , ExpAbstraite opd , String op)
    {
        this.opGauche = opg ;
        this.opDroite = opd;
        this.opérateur = op;
    }


    @Override
    public String toStringInfixe()
    {
        String chaine = "( " + this.opGauche.toStringInfixe() +  this.opérateur + this.opDroite.toStringInfixe() + " )";
        return chaine ;
    }

    @Override
    public double evaluer(Env env)
    {
        if(opérateur=="+")
        {
            double res = this.opGauche.evaluer(env)  + this.opDroite.evaluer(env);
            env.getHashMap().put(this.toStringInfixe(),res);
            return res ; 
        }
        else 
        {
            double res = this.opGauche.evaluer(env)  * this.opDroite.evaluer(env);
            env.getHashMap().put(this.toStringInfixe(),res);
            return res ; 

   
        }
    }







}
