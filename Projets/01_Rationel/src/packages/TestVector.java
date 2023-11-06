public class TestVector {
    public static void main(String[] args) {
        
        Rationel[] tab1 = {new Rationel(1,2), new Rationel(1,3) , new Rationel(4,5) }; 

        Vector v1 = new Vector(3, tab1);

        System.out.println("-------- Test de la classe Vector : --------------");
        System.out.println(v1);



        System.out.println("--------- Test 2 -----------------------");

        /*
        — v ← [0/1, 0/1] ;
        — a ← 2/3 (a est un Rational)
        — v1 ← a (affecte r au premier élément du vecteur)
        — Afficher v ;
        — b ← 3/2 (b est un Rational)
        — a ← a ∗ b (grâce à la méthode mult de la classe Rational. a vaut désormais 3/3 == 1)
        — Afficher v ;


        */


    Rationel[] tab = {new Rationel(0,1) ,  new Rationel(0,1)};

    Vector v = new Vector(2 ,tab   ); 
    System.out.println(v);

    Rationel a = new Rationel(2,3);


    System.out.println("----- Test de set ----------");     
    v.set(0,(Rationel)a);

    System.out.println(v);

    Rationel b = new Rationel(3,2);

    a.mult(b);
    System.out.println(a); 
    System.out.println(v);

    System.out.println("----------- Test de la méthode get --------------------");
    Rationel r2 = v.get(0);
    System.out.println(r2);


    /* 
     * 
     *  - v← (1/2, 1/2);
        — Afficher v ;
        — a ← v1 (récupérer la première composante de −→v ) ;
        — a ← a ∗ 1/3 (grâce à la méthode mult de la classe Rational.)
        — Afficher v
     * 
     * 
     * 
     * 
     * 
     * 
    */

    System.out.println("-------------------- Test 2 ---------------------");

    Rationel[] tab2 = {new Rationel(1, 2), new Rationel(1, 2)};
    Vector v2 = new Vector(2, tab2);
    System.out.println(v2);

    Rationel a1 = v2.get(0);
    
    System.out.println(a1);
    
    a1.mult(new Rationel(1, 3));
    System.out.println(a1);
    System.out.println(v2);


    System.out.println("-------------------- Test de mult sur Vector --------------------------");
    System.out.println("");

    v2.mult(new Rationel(1, 2));
    System.out.println(v2);

    System.out.println("------------------------- Test de add sur Vector ---------------------------");
    System.out.println("");
    
    Rationel[] tab3 = {new Rationel(1, 2), new Rationel(1, 4)};
    Vector v3 = new Vector(2, tab3);
    System.out.println(v3);
    Rationel[] tab4 = {new Rationel(2, 3), new Rationel(1, 4)};
    Vector v4 = new Vector(2, tab4);
    System.out.println(v4);

    // Test de add :
    v4.add(v3);
    System.out.println(v4);




    }   
}
