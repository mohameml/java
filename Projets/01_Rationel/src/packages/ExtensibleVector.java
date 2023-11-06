public class ExtensibleVector {
    
    /*
     * 
     * Class ExtensibleVector : vecteur de taille dynamique 
     * 
     * 
     * 
     * 
     * 
     */


    static int tampon = 5 ;
    int nbElemnts = 0 ;
    Rationel[] elments = new Rationel[tampon] ;



    // les constructeures :

    public ExtensibleVector(Rationel[] tab)
    {
        
        if(tampon< tab.length)
        {
            // this.elments n'est pas suffiasnt :
            // il faut rédimensionner : Rationel[] elments 

            this.elments = new Rationel[tampon+tab.length];

            for(int i=0;i<tab.length;i++)
            {
                this.elments[i]=tab[i];
            }
            this.nbElemnts+=tab.length;
        }
        else
        {
            
            for(int i=0 ; i<tab.length;i++)
            {
                this.elments[i]=tab[i];
            }

            this.nbElemnts+=tab.length;
        }
        
    }




    // toString :
    @Override
    public String toString()
    {
        String chaine = "[";

        for(int i=0 ; i<this.nbElemnts-1;i++)
        {
            chaine+=this.elments[i].toString()+",";
        }
        chaine+=this.elments[nbElemnts-1].toString();
        chaine+="]";

        return chaine ;
    }




    // la méthode getDimension :
    public int getDimension()
    {
        return this.nbElemnts;
    }

    // la méthode append()

    public void append(Rationel r)
    {
        if(this.elments.length-nbElemnts < 1)
        {
            // on peut pas ajouter un élemnt
            // il faut rédimensionner la tab :

            Rationel[] vector_ancien = this.elments;

            this.elments = new Rationel[nbElemnts + tampon];

            // On ajoute les anciiens élems a this.elments :
            for(int i=0 ; i<vector_ancien.length ; i++)
            {
                this.elments[i]=vector_ancien[i];
            }

            // On ajout le nouveau élment :
            this.elments[nbElemnts] = r;
            nbElemnts++;

        }
        else
        {
            // on peut ajouter un élment :
            this.elments[nbElemnts]= r;
            nbElemnts++ ;
        }
    }

    public Rationel get(int indice)
    {
        if(indice >= this.nbElemnts){
            throw new IndexOutOfBoundsException("indice n'est pas dans le domaine d'accées !!!!!!");
        }
        else{
            return this.elments[indice];
        }
    }



    }
