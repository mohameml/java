package gométrie;

public class Rectangle extends Gometrie {

    public Rectangle(int l, int L) {
        super(l, L, "Rectangle");

    }

    public int surface()

    {
        return super.largeure * super.longeure;
    }

    public int permite()

    {
        return 2 * (longeure + largeure);
    }

}
