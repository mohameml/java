import gométrie.*;

public class App {

    public static void main(String[] args) {

        // on test le rectangle

        Rectangle r = new Rectangle(20, 40);

        System.out.println("Je suis un recatngle de l = 20 et L = 40");
        System.out.printf("la surface de r est %d et son périmte est %d \n", r.surface(), r.permite());

    }
}
