package jc;

interface Flyable {

    // ici toutes et public abstract

    void fly(String energy);

    default void Test() {
        System.out.println("Test par defaut");
    }

}
