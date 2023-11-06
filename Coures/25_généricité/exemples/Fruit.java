

public class Fruit {
    
    private  String name ;
    private int quantité ;

    public String  getName()
    {
        return this.name;
    }

    public int getQuantité()
    {
        return this.quantité;
    }

    public Fruit(String name)
    {
        this.name= name;
    }

    public Fruit(String name , int Q)
    {
        this.name = name ;
        this.quantité = Q ;
    }



    
    @Override
    public String toString()
    {
        return "Fruit :" + this.name + ", " +this.quantité + ".";
    }

}
