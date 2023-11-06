package packages;

public class BinairePlus extends ExpBinaire 
{
    public BinairePlus(ExpAbstraite c1 , ExpAbstraite c2 )
    {
        super(c1,c2,"+");
    }


    @Override
    public ExpAbstraite calculerDerivee()
    {
        ExpAbstraite der = new BinairePlus(opGauche.calculerDerivee(), opDroite.calculerDerivee());

        return der;
            
        
        
    }

}
