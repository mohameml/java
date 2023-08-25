package jc.entités;

public class Horse {

    // les attributs :
    protected String name;
    protected int posX;
    protected int posY;

    public Horse(String name) {
        this.name = name;
        this.posX = 50;
        this.posY = 50;
    }

    public void move(int x, int y) throws HorseException {

        if (x < 0) {
            throw new HorseException("x ne peut pas etre négative .");
        }
        this.posX = x;
        this.posY = y;

    }

}
