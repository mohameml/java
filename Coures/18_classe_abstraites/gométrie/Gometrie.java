package gométrie;

abstract public class Gometrie {
    // Les attributs

    protected String name;
    protected int longeure;
    protected int largeure;

    // un constructeur :

    public Gometrie(int l, int L, String name) {
        this.longeure = L;
        this.largeure = l;
        this.name = name;
    }

    // des Méthode abstarites :

    abstract public int surface();

    abstract public int permite();

}