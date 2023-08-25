package jc;

public class Ship extends Vehicle implements Flyable {

    public Ship() {
        this.mouvementSpeed = 16;
    }

    public void moveXY(int x, int y) {
        System.out.println("la navire brasse les flots et se deplace en" + x + "," + y);

    }

    public void fly(String energy) {
        System.out.println("Je proplus dans le aires avec " + energy);

    }

    public void Test() {
        System.out.println("Test pesonelle !!");
    }

}
