import jc.entités.*;

public class App {
    public static void main(String[] args) throws Exception {
        Horse h = new Horse("Geuro");
        h.move(167, 428);

        Pegasus p = new Pegasus("Titanus");
        p.move(33, 146);
        p.fly(466);

        h.move(-1, 20);

    }
}