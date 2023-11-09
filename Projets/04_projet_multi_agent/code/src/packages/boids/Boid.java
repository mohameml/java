package packages.boids;
import java.awt.Point;
import java.util.ArrayList;

import java.util.Random;


public class Boid {

    // -- pour génere des points aleatoire :
    Random random = new Random();



    /*----------------------------------- les attributs : -------------------------------- */

    /* les positions de boids : */    
    private Vecteur position = new Vecteur(random.nextInt(600) , random.nextInt(800))   ;
    
    // private Vecteur position ;

    // private Point position = new Point(200,200) ;

    /* la vitesse de boid : */
    private Vecteur vitesse = new Vecteur(random.nextInt(800) , random.nextInt(800)); // valeur par défaut pour la simulation par défaut 
    // private Vecteur vitesse ; // valeur par défaut pour la simulation par défaut 

    

    /* l'accéleration de boids : */
    private Vecteur accéleration = new Vecteur(0,0) ;


    /* la norma de la vitesse  maximale */
    private static  double normeVitesseMax = 20;

    /* la distance de boid : pour connaitre les voisinages de ce boid  */
    private static double distance = 50 ;

    // /* la force maximale  */
    // private static double forceMax = 0.1;


    /* les voisins :  */

    ArrayList<Boid> voisins = new ArrayList<>();


    

    /*-----------------------------------  les acsesseur ------------------------------------ */

    /*  getPosition : */
    public Vecteur getPosition()
    {
        return this.position;
    }

    public Vecteur getVitesse()
    {
        return this.vitesse;
    }

    public Vecteur getAccéleration()
    {
        return this.accéleration;
    }


    /* la méthode getVoisins: */
    public ArrayList<Boid> getVoisins()
    {
        return this.voisins;
    }


    /*-------------------------------  les constructeures : ----------------------------------- */

    public Boid()
    {
        this.vitesse.setNorme((double)random.nextInt(4));
    }

    public Boid(Point p , Point v)
    {

        this.position = new Vecteur((int)p.getX(), (int)p.getY());
        this.vitesse = new Vecteur((int)v.getX(), (int)v.getY());

    }

    public Boid(Boid b)
    {
        this.position = new Vecteur(b.getPosition());
        this.vitesse = new Vecteur(b.getVitesse());
        this.accéleration = new Vecteur(b.getAccéleration());

    }



    /*--------------------------------- des méthodes de manipulation :------------------------  */

    /* --------------- la méthode calculDistance : ----------------------- */



    public static double calculDistance(Point p1 , Point p2)
    {
        double x = Math.pow(p2.getX() - p1.getX(), 2);
        double y = Math.pow(p2.getY() - p1.getY(), 2);

        double d = Math.sqrt(x+y);

        return d ;
    }






    /* la méthode update pour modéliser le mouvement du boid : update position , vitesse ,accéleration   */

    public void upadet(double L , double l , ArrayList<Boid> boids)
    {


        // mis à jour de l'accéleration du boid :

        //Point p1 = this.Alignement();
        Vecteur v2 = this.Cohésion(boids);
        // Point p3 = this.Séparation();

        this.accéleration.add(v2);

        this.position.add(this.vitesse);
        
        // mis à jour de la vitesse de boid : 
        this.vitesse.add(this.accéleration);
        this.vitesse.limite(Boid.normeVitesseMax);

        // mis à jour de la postion du boid : 


        // les efets de bord : 
        this.bord(L, l);



        // this.accéleration.setPoint(0, 0);
        

    }




    /* méthode pour les effets de bors : */

    public void bord( double L, double l)
    {
        double x = this.position.getPoint().getX();
        double y = this.position.getPoint().getY() ;


        if(x > L)
        {
            x = 0 ;     
        }
        else if( x < 0 )
        {
            x = L ;
        }


        if( y > l)
        {
            y = 0 ;     
        }
        else if(y < 0 )
        {
            y = l ;
        }    
    
        this.position.setPoint((int)x, (int)y);
    
    }


    /*----------------------------------- les 3 principes de system de boids :  -------------------- */


    /*-------------------------------- Cohésion un agent se dirige vers la position moyenne (centre de masse) des ses voisins :------------- */


    public Vecteur Cohésion(ArrayList<Boid> boids)
    {
        Vecteur v = new Vecteur((int)this.getPosition().getPoint().getX(),(int)this.getPosition().getPoint().getY());

        int total = 1 ;

        for(Boid boid : boids)
        {
            double dis = calculDistance(this.position.getPoint() , boid.getPosition().getPoint());
            // System.out.println("dis = " + dis);

            if( !boid.equals(this) && dis < Boid.distance)
            {
                // System.out.println("je suis la et je suis le boid "+boid.getPosition()+ " mnt nous somme dans le boid "+this.position);
                v.add(boid.getPosition());
                total++;
            }
        }

        if(total > 0)
        {
            // System.out.println("total = "+total);
            double c = (double)1/total;

            v.mult(c);

            v.sub(this.position);

            v.setNorme(Boid.normeVitesseMax);


            v.sub(this.vitesse);


            // v.limite(Boid.forceMax);




            // System.out.println("au fin de bloc if v = "+v);
        }

        // System.out.println(v);
        // System.out.println(v);
        // System.out.println();

        // System.out.println(" Avant return v = "+v);
        return v;
    }


    /* ------------------------------ Alignement un agent tend à se déplacer dans la même direction que ses voisins : ------------- */

    // public Point Alignement()
    // {
    //     /* l'idéde ici que le boid , il calcule la vitesse moyenne de ses voissois et change sa vitesse vers la vitesse moyenne de ses voisins  */
    //     Point point = new Point(0,0);

    //     int total = this.voisins.size();

    //     for(Boid boid : this.voisins)
    //     {
    //         add(point , boid.getVitesse());
    //     }

    //     if(total > 0)
    //     {
    //         mult(point, 1/ total);

    //     }


    //     return point;
    // }






    /* ---------------------- Séparation les agents trop proches se repoussent, pour éviter les collisions : ------------------- */

    // public Point Séparation()
    // {

    // }




    @Override
    public boolean equals(Object objet)
    {
        if(objet instanceof Boid)
        {
            Boid boid = (Boid)objet;
            
            return this.position.getPoint().equals(boid.getPosition().getPoint());   
        }

        return false ;
    }
}
