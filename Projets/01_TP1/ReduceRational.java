public class ReduceRational extends Rational {

    public ReduceRational(int n, int d) throws RationalException {

        super(reduceNum(n, d), reduceDenom(n, d));

    }

    public static int reduceNum(int n, int d) {
        if (pgcd(n, d) == 1) {
            return n;
        } else {
            return n / pgcd(n, d);
        }
    }

    public static int reduceDenom(int n, int d) {
        if (pgcd(n, d) == 1) {
            return d;
        } else {
            return d / pgcd(n, d);
        }
    }

}
