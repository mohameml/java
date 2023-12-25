package fr.exemple.entites;



public class TestPlayerSansJuint {
    

    public static void main(String[] args) {
        
        Player p1 = new Player("p1", 10);
        Player p2 = new Player("p2", 11);
        Player p3 = new Player("p3", 12);
        Player p4 = new Player("p4", 13);
        Player p5 = new Player("p1", 10);

        System.out.println("========= Test to String =============");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


        System.out.println("=========== Test to equals =============");
        System.out.println("p1 == p2 --> " + p1.equals(p2));
        System.out.println("p1 == p5 --> " + p1.equals(p5));
        System.out.println("p2 == p5 --> " + p2.equals(p5));


    }

}
