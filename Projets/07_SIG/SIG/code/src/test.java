import packages.SIG.BrokenLine;
import packages.SIG.Geometry;
import packages.SIG.Point;
import packages.SIG.SIG;
import packages.fourni.Drawable;
import packages.fourni.GeometricPainter;

import java.util.Iterator;

public class test {
    

    public static void main(String[] args) {
        


        /*------------------- Test du calss Point ------------ */
        Point p1 = new Point(12 , 13);

        String nom = p1.getNom() ;
        System.out.println(nom);
        
        System.out.println("x  = "+p1.getX() + " , y = "+p1.getY());

        System.out.println(p1);

        Point p2 = p1.getBarycenter();
        System.out.println("le barycentre du p1 est = "+p2);

        /*------------- Test du renommage Auto ------------------ */

        Point p3 = new Point(1, 2);
        String nom2 = p3.getNom();
        System.out.println(nom2);
    
    
        Point p4 = new Point(1, 2);
        String nom3 = p4.getNom();
        System.out.println(nom3);



        /*-------------------------- Test du classe BrokenLine ------------- */

        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 100);
        Point point3 = new Point(100, 100);
        Point point4 = new Point(100, 0);
        Point point5 = new Point(0, 0);

        BrokenLine line = new BrokenLine(point1, point2 );
        
        line.add(point3);
        line.add(point4);
        line.add(point5);

        System.out.println(line);

        Point br = line.getBarycenter();
        System.out.println(br);




    /*-------------------------------------- Test de SIG  ------------------ */


    System.out.println("/*-------------------------------------- Test de SIG  ------------------ */");

        Geometry.setCount(0);

        SIG sig = new SIG();

        Point pt1 = new Point(0, 0);
        Point pt2 = new Point(0, 100);

        BrokenLine brl1 = new BrokenLine(pt1, pt2 );

        // Test add :
        sig.add(pt1);
        sig.add(pt2);
        sig.add(brl1);

        // Test de toString :
        System.out.println(sig);

        // test du Iterator<String>

        Iterator<String> itrName = sig.nameIterator();

        while(itrName.hasNext())
        {
            System.out.println(itrName.next());
        }


        // Test Iterator<Geomtry>

        Iterator<Geometry> itrGeo = sig.geometryIterator();

        while(itrGeo.hasNext())
        {
            System.out.println(itrGeo.next());
        }

    
        // Test getGoemtry 

        Geometry geo = sig.getGeometry("nom1");
        System.out.println(geo); // null 

        Geometry geo2= sig.getGeometry("NameAuto1");
        System.out.println(geo2); // Point(0 ,100)
    
        // Test add : 
        sig.add(new Point("NameAuto", 1, 11));

        System.out.println(sig);

        sig.add(line);

        // test :  L’envol du SIG 

        Drawable toDraw = sig; // un objet adé quat
        new GeometricPainter ( toDraw ) ;
    
    
    }

}
