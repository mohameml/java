public class Cat {

    // Les attributes

    private String name;
    private int age;

    // Un constructeur

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(this.name + " - " + this.age);

    }

    // construcuteur chainée :

    public Cat(String name) {
        this(name, 0);
    }

}
