

public class Vegetable {
    
    private String name ;

    private Color col ;


    public String getName()
    {
        return this.name;
    }

    public Color getColor()
    {
        return this.col;
    }



    public Vegetable(String name , Color col)
    {
        this.name = name ;
        this.col = col ;
    }


    @Override
    public String toString()
    {
        return String.format("Vegetable(name = %s , coleur = %s )" ,this.name , this.col.getName() );


    }


}
