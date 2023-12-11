package packages.SIG;

import packages.fourni.SimpleDrawer;

public abstract class Geometry {
    
    /*----- nom ------ */
    private String nomGeo ;

    /*----- un countere static partager entre toutes les éntités géometriques --------- */
    private static int count = 0 ;

    public static  void setCount(int c)
    {
        count = c ;
    }
    
    /*-------- un constructuern pour initialiser nomGeo --------- */

    public Geometry(String nom)
    {
        this.nomGeo = nom ;
    }

    public Geometry()
    {
        this.nomGeo = "NameAuto"+count ;
        count++;
    }

    /*-------- méthode getName--- -----*/


    /*----  */

    public String getNom()
    {
        return nomGeo ;
    }

    public abstract Point getBarycenter();

    public abstract void drawGeo(SimpleDrawer simpleDrawer);





    @Override
    public String toString()
    {
        return "nom :" + nomGeo ;
    }

}
