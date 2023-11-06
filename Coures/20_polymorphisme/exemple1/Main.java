


public class Main {
    
    public static  void main(String[] args)
    {
        Animal a1 = new Animal("Ani1 ", 120 );
        Animal a2 = new Animal("Ani2 ", 100 );

        Vache v1 =  new Vache("vache1" , 130 , 5);

        Animal a3 =  v1 ;

        // System.out.println(v1);
        // System.out.println(a3);
        // v1.crier();
        // ((Animal)a3).crier();

        System.out.println("" + v1.getNbTache());
        System.out.println("" + ((Vache)a3).getNbTache());

    }
}
