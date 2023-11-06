

public class Panier<E> 
{
    // classe génerique :

    private E elem ;

    public E get()
    {
        return this.elem;
    }

    Panier(E e)
    {
        this.elem = e ;
    }


    @Override
    public String toString()
    {
        
        return "cette panier contient : " + elem.toString();
    }


    
}
