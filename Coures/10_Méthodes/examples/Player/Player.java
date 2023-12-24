
public class Player {

    // les attributs

    private String name;
    private int level;

    // un constructuer

    public Player(String name) {
        this(name, 0);
    }

    public Player(String name, int level) {
        this.name = name;
        this.level = level;

    }

    // Les Méthodes

    public void displayPlayer() {
        System.out.println("Player(" + this.name + ", " + this.level + ")");
    }

    // une Méthode statique

    public static void great() {
        System.out.println("wolckom to the new game !!!!");
    }

}
