package packages.SIG;

import packages.fourni.SimpleDrawer;

public class Point extends Geometry {

    private int x ;
    private int y ;



    public int  getX()
    {
        return x ;
    }

    public int getY()
    {
        return y ;
    }

    public Point(int x , int y)
    {
        super();
        this.x = x ;
        this.y = y ;
    }

    public Point (String nom ,int x , int y)
    {
        super(nom);
        this.x = x ;
        this.y = y ;
    }
    

    @Override
    public String toString()
    {
        return "un Point <c'est tout> : ("+this.x+","+this.y+")";
    }

    @Override
    public Point getBarycenter()
    {
        return this ;
    }



    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Point)
        {
            Point point = (Point)o ;
            return this.getX()==point.getX() && this.getY()==point.getY();
        }

        return false ;
    }

    @Override
    public   void drawGeo(SimpleDrawer simpleDrawer)
    {
        simpleDrawer.drawPoint(this.x, this.y);
    }

}
