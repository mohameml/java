
package packages ;
public class UnaireSin extends ExpUnaire
{


    public UnaireSin(ExpAbstraite op)
    {
        
        super(op,"sin");
    }

    @Override
    public ExpAbstraite calculerDerivee()
    {
        return new BinaireMult(op.calculerDerivee(), new UnaireCos(op));
    }

}