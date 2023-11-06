package packages ;

public class  UnaireCos extends ExpUnaire
{

    public UnaireCos(ExpAbstraite op)
    {
        super(op ,"cos");
    }


    @Override
    public ExpAbstraite calculerDerivee()
    {
        return new BinaireMult(new BinaireMult(new Constante(-1) , op.calculerDerivee()), new UnaireSin(op));
    }

}