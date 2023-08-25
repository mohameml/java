package jc.entités;

public class Pegasus extends Horse {

    // Les attributs :

    private int posZ;

    // un constructeur :

    public Pegasus(String name) {
        super(name);
        this.posZ = 100;
    }

    // Les méthodes :

    public void move(int x, int y) {
        super.move(x, y);
        System.out.println("Le Pegase se deplace (X=" + this.posX + " ,Y=" + this.posY + ")");

    }

    public void fly(int z) {
        this.posZ = z;
        System.out.println("Le Pegase s'éleve dans l'air (Z=" + this.posZ + ")");

    }

}
