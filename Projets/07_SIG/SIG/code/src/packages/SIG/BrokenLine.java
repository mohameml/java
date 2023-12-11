package packages.SIG;

import java.util.LinkedList;



import packages.fourni.SimpleDrawer;

public class BrokenLine extends Geometry {

    /*
     * commen on applique souvcent des méthodesd de add et remove donc ce meiux
     * de choisir linkedList car la complexite des ces méthodes sont 0(1) , 0(1)
     * 
    */
    LinkedList<Point> line ;


    public BrokenLine(String nom ,Point p1 , Point p2)
    {
        super(nom);
        line = new LinkedList<>();
        line.add(p1);
        line.add(p2);
    }

    public BrokenLine(Point p1 , Point p2)
    {
        super();
        line = new LinkedList<>();
        line.add(p1);
        line.add(p2);
    }
    



    public void add(Point p)
    {
        /*------ dé compléxite O(1) -------- */
        line.addLast(p);
    }


    public void removeFirst()
    {
         /*------ dé compléxite O(1) -------- */

        if(line.size() == 2)
        {
            throw new IllegalAccessError("on ne peut pas supprimer un élment du BrohenLine ");
        }
        else
        {
            line.removeFirst();
        }
    }


    // @Override
    // public  Point getBarycenter()
    // {
    //     /*on définti deux variables pour le point barycentre de line  */
    //     int x = 0 ;
    //     int y = 0 ;

    //     /*------ la compléxite O(n) avec n la taille du linkedlist line -------- */

    //     for(Point p : line)
    //     {
    //         x+=p.getX();
    //         y+=p.getY();
    //     }

    //     x=x/line.size();
    //     y =y/line.size();

    //     return  new Point(x,y);
    // }



    @Override
    public  Point getBarycenter()
    {
        /*on définti deux variables pour le point barycentre de line  */
        int x = 0 ;
        int y = 0 ;

        /*------ la compléxite O(n^2) avec n la taille du linkedlist line -------- */

        LinkedList<Point> lineSansRédo = new LinkedList<>();

        for(Point p : line)
        {
            if(!lineSansRédo.contains(p))
            {
                x+=p.getX();
                y+=p.getY();
                lineSansRédo.add(p);
            }

        }

        x=x/lineSansRédo.size();
        y =y/lineSansRédo.size();

        return  new Point(x,y);
    }



    @Override
    public String toString()
    {
        String chaine = ""+this.getNom()+":\n";


      /*------ dé compléxite O(n) avec n la taille du linkedlist line -------- */
        for(Point p : line)
        {
            chaine+="\t"+p.toString()+"\n";
        }


        return chaine ;
    }


    @Override
    public   void drawGeo(SimpleDrawer simpleDrawer)
    {

        for (int i = 0; i < this.line.size() -1 ; i++) {
            Point p1 = this.line.get(i);
            Point p2 = this.line.get(i+1);

            simpleDrawer.drawLineSegment(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            
        }

    }


}
