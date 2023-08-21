public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("sidi", 1);
        p1.displayPlayer();

        Player p2 = new Player("Bob");
        p2.displayPlayer();

        // apelle à une Méthode static de la classe Player

        Player.great();
    }

}
