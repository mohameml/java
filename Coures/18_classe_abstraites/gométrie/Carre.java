package gométrie;

public class Carre extends Gometrie {

    public Carre(int l) {
        super(l, l, "Carre");

    }

    public int surface()

    {
        return (int) Math.pow((double) super.longeure, 2);
    }

    int permite()

    {
        return 4 * super.longeure;
    }

}
