package packages.SIG;
import java.util.Iterator;
import java.util.LinkedList;
import packages.fourni.*;

public class SIG implements Drawable {


    /*
     * ------------------------  Attributs de la classe SIG : --------------------------
    */


    /*------------ linked list : car la méthode add est O(n) et en puls linkedList est ordonée */
    private LinkedList<Geometry> sig ;


    public SIG()
    {

        sig = new LinkedList<>();
    }



    public  boolean nomExits(String nom)
    {
        for(Geometry geo : this.sig)
        {
            if(nom.equals(geo.getNom()))
            {
                return true ;
            }
        }

        return false ;
    }
    

    public void add(Geometry geom)
    {
        String nameGeo = geom.getNom();

        if(this.nomExits(nameGeo))
        {
            // si le nom exister deja il faut lancer une exception 
            throw new IllegalAccessError("le nom est deja existe !!!!");
        }
        else
        {
            sig.addLast(geom);
        }
    }


    public  Geometry getGeometry(String name)
    {
        
        for(Geometry geo : this.sig)
        {
            if(geo.getNom().equals(name))
            {
                return geo;
            }
        }

        return null ;
        

    }


    /*
     * Iterator<String> nameIterator(), qui retourne un itérateur permettant de parcourir les
        noms des entités géométriques du SIG.
    */

    public Iterator<String> nameIterator()
    {
        /*---------------- la compléxite est O(n) ----------- */
        LinkedList<String> listName = new LinkedList<>();
        
        for(Geometry geo : this.sig)
        {
            listName.add(geo.getNom());
        }


        Iterator<String> itrName = listName.iterator();


        return itrName;
    
    
    }


    /*
     *  Iterator<Geometry> geometryIterator(), 
     * qui retourne un itérateur permettant de parcourir les entités géométriques du SIG selon leur ordre d’insertion.
     * 
    */

    public Iterator<Geometry> geometryIterator()
    {
        /*--------------- al compléxite est O(1)--------------  */

        return sig.iterator();
    }



    public String toString()
    {
        String chaine = "SIG :\n";

        for(Geometry geo : this.sig)
        {
            chaine+="\t"+geo+"\n";
        }
    
    
        
        return chaine;
    }


    @Override
    public void draw(SimpleDrawer simpleDrawer)
    {

        for(Geometry geo : this.sig)
        {
            geo.drawGeo(simpleDrawer);
        }
    }

}
