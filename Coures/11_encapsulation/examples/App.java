public class App {

    public static void main(String[] args) {
        SoftwarRegistration sr = new SoftwarRegistration(2020);

        int date_expiration = sr.getExpiration();
        System.out.println("The date of expiration is : " + date_expiration);

        // oo change la date d'expiration a l'aide d'un setter

        sr.setExpiration(2025);
        date_expiration = sr.getExpiration();
        System.out.println("The date of expiration is : " + date_expiration);
    }

}
