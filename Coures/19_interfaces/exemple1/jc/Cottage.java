package jc;

public class Cottage extends Builder {

    public Cottage() {
        System.out.println("Parcelle en place ...");
    }

    public void build(String materials) {
        System.out.println("Construction du batiment en  " + materials);

    }
}
