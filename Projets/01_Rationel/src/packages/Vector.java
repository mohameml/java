public class Vector {
    
    // les attributs :
    private Rationel[] elements ;
    private int nombre;


    // constructuer :

    /*

    classe Vector représentant : 
            - un vecteur de rationnels .
            - de dimension fixée à la  création
            - ayant pour attribut un tableau d’éléments de type Rational.
         

    */

    public Vector(int n , Rationel[] tab)
    {
        this.nombre = n;
        this.elements = new Rationel[nombre];

        for(int i =0 ; i<tab.length ; i++)
        {
            this.elements[i] = tab[i];
        }
        
    }



    // la méthoe toString 
    @Override
    public String toString()
    {
        String chaine = "[";

        for(int i=0 ; i<this.elements.length -1 ;i++)
        {
            chaine+=this.elements[i].toString()+",";
        }
            
        chaine+=this.elements[this.elements.length -1].toString();

        chaine+="]";

        return chaine ;
    } 


    /*
    méthode void set(int i, Rational r) :
            - modifie le i ème rationnel du vecteur 
            - de telle sorte qu’il vaille désormais r (une erreur est levée si i excède la dimension du vecteur).


    */

    void set(int i , Rationel r)
    {
        if(i>=this.elements.length)
        {
            throw new ArrayIndexOutOfBoundsException("i dépasse la cadre des accées de la table ");
        }
        else
        {
            this.elements[i] = new Rationel(r) ;

        }
    }



    /*
     * 
     * Rational get(int i) :
     *      - prenant en paramètre un entier i 
     *      - et renvoyant le rationnel correspondant à la i ème composante du vecteur 
     *      - ou une erreur si i excède la dimension  du vecteur.
     * 
     * 
     */

    Rationel get(int i)
    {
        if(i>=this.elements.length)
        {
            throw new ArrayIndexOutOfBoundsException("i dépasse la cadre des accées a la table");
        }
        else
        {
            Rationel elme = new Rationel(this.elements[i]);
            return elme;
        }
    }



    /*
     * 
     * Ajoutez à la classe Vector :
     *      - une méthode de multiplication par un rationnel. 
     *      - Cette méthode prend en paramètre un Rational, 
     *      - et multiplie toutes les composantes du vecteur par ce rationnel.
     * 
     * 
     */

     void mult(Rationel r)
     {
        for(Rationel r2 : this.elements)
        {
            r2.mult(r);
        }
     }




     /*
      * 
    Ajoutez une méthode add  :
        -  additionnant un Vector donné en paramètre à l’objet de type Vector sur lequel elle est invoquée. 
        - La méthode échoue si le vecteur passé en  paramètre n’est pas de même dimension que le vecteur sur lequel la méthode est appelée.



    */

    void add(Vector other)
    {
        if(other.elements.length!=this.elements.length)
        {
            throw new IllegalArgumentException("On ne peut pas ajhouter deux vecteures de tailles différentes ");
        }
        else
        {
            for(int i=0 ; i<other.elements.length;i++)
            {
                this.elements[i].add(other.elements[i]);
            }
        }
    }
}
