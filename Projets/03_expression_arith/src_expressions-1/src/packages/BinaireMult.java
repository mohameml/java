package packages;

public class BinaireMult extends ExpBinaire 
{
    public BinaireMult(ExpAbstraite c1 , ExpAbstraite c2 )
    {
        super(c1,c2 ,"*");
    }    



    @Override
    public ExpAbstraite calculerDerivee()
    {
        ExpAbstraite der =  new BinairePlus( 
                                        new BinaireMult(opGauche.calculerDerivee(), opDroite), 
                                        new BinaireMult(opGauche, opDroite.calculerDerivee())
                                        
        );   
    
        
        return der ;
    }
}
