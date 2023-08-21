
public class Exemple {

    public static void main(String[] args) {
        // fonction principale :

        int a = 12;
        int b = 3;

        int a_add_b = add(a, b);
        int a_sub_b = sub(a, b);
        int a_mul_b = mul(a, b);
        int a_div_b = (int) div(a, b);
        int a_puissance_b = puissance(a, b);

        System.out.println("a= " + a + " , b = " + b);
        System.out.println("a+b = " + a_add_b);
        System.out.println("a-b = " + a_sub_b);
        System.out.println("axb = " + a_mul_b);
        System.out.println("a/b = " + a_div_b);
        System.out.println("a^b = " + a_puissance_b);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;

    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float div(int a, int b) {
        return a / b;
    }

    public static int puissance(int a, int b) {
        // version iterative

        int result = 0;

        if (a == 0 || b == 0) {
            return result;
        } else {
            for (int i = 0; i < b; i++) {
                result += a;
            }

            return result;

        }
    }

    // Le surcharge d'une Méthode

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

}
