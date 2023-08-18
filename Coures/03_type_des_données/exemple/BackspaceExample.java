package exemple;

public class BackspaceExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Countdown: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i);
            Thread.sleep(1000);
            if (i > 0) {
                System.out.print("\b");
            }
        }

        System.out.println("Countdown completed!");
    }
}
