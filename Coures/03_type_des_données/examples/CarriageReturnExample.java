package exemple;

public class CarriageReturnExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            System.out.print("Progress: " + i + "%\r");
            Thread.sleep(500);
        }
        System.out.println("Process completed!");
    }
}
