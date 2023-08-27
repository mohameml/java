
public class Cat {

    // Les attributs :
    private String name;
    private int age;

    // Les accessoires :

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void miaou() {
        System.out.printf("je suis le cat %s et j'ai %d ans  \n", this.name, this.age);
    }
}
