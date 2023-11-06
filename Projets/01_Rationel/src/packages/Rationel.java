public class Rationel
{
    // les attributs :
    private int num ;
    public int getNum()
    {
        return this.num;
    }

    public void setNum(int n)
    {
        this.num = n ;
    }


    private int denom ;

    public int getDenom()
    {
        return this.denom;
    }

    public void setDenom(int d)
    {
        this.denom = d;
    }
    // les constructeures :

    public Rationel()
    {

    }

    public Rationel(int n , int d) throws ArithmeticException
    {
        this.num = n ;

        if(d==0)
        {
            throw new ArithmeticException("divison par zero n'est pas possible");
        }
        this.denom = d ;


    }

    public Rationel(Rationel r)
    {
        this.num = r.num;
        this.denom = r.denom ;
    }


    // les Méthodes :

    
    public String  toString()
    {
        String chaine = ""+this.getNum()+"/"+this.getDenom();

        return chaine;
    }

    public void mult(Rationel r2)
    {
        this.num = this.num * r2.num;
        this.denom*=r2.denom;

    }

    public void add(Rationel r) 
    {
        this.num = this.num*r.denom + r.num*this.denom;
        this.denom = this.denom*r.denom; 
    }

    // @Override
    // public boolean equals(Rationel other)
    // {
    //     if(other instanceof Rationel)
    //     {
    //         boolean bol = other.getNum()==this.getNum() && other.getDenom()==this.getDenom();
            
    //         return bol ;
    //     }

    //     return false ;
    // }


}