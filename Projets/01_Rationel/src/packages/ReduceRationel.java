


public class ReduceRationel {
    

    // une classe pour les  Rationnels irréductibles :

    // les attributs :

    private int num ;
    private int denom ;

    // les getters et les setteres :

    public int getNum()
    {
        return this.num;
    }

    public void setNum(int n)
    {
        this.num=n ;
    }



    public void setDenom(int d)
    {
        this.denom = d;
    }
    public int getDenom()
    {
        return this.denom;
    }



    //  les constructeurees :

    public ReduceRationel(int n , int  d)
    {
        if(pgcd(n,d)==1)
        {
            this.num = n;
            this.denom = d;
        }
        else 
        {
            int pgcd = pgcd(n,d);
            this.num = n/pgcd;
            this.denom = d/pgcd;
        }

    }






    // des fonctions utiles :

    public static int  pgcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }
        

        return  pgcd(b , a%b) ;
    }



    public void mult(ReduceRationel r2)
    {
        this.num = this.num * r2.num;
        this.denom*=r2.denom;

    }
}
