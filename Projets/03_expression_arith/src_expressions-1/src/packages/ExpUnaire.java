package packages ;


public abstract class   ExpUnaire extends ExpAbstraite
{

    protected ExpAbstraite op ;
    protected String opérateur ;

    public ExpAbstraite getOp()
    {
        return this.op;
    }

    public ExpUnaire(ExpAbstraite op , String ope)
    {
        this.op = op ;
        this.opérateur = ope;
    }



    @Override
    public  String toStringInfixe()
    {
        String chaine = this.opérateur+"("+ this.getOp().toStringInfixe() +")";
      return chaine ;   
    }

    @Override
    public double evaluer(Env env)
    {
        if(opérateur=="cos")
        {
            double res =  Math.cos(op.evaluer(env));
            env.getHashMap().put(op.toStringInfixe() , res );
            return res;
        }
        else
        {
            double res =  Math.sin(op.evaluer(env));
            env.getHashMap().put(op.toStringInfixe() , res );
            return res;

        }
    }




}

