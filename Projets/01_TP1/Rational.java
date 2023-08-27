
public class Rational {

    /*
     * L'attribut : num.
     */
    protected int num;

    public int getenum() {
        return this.num;
    }

    public void setNum(int n) {
        this.num = n;
    }

    /*
     * L'attribut : denom.
     */

    protected int denom;

    public int getdenom() {
        return this.denom;
    }

    public void setDenom(int d) {
        this.denom = d;
    }

    // un constructeur :

    public Rational(int n, int d) throws RationalException {

        if (d == 0) {
            throw new RationalException("le dénominateur d'un Rational ne peut pas étre négative");
        }
        this.num = n;
        this.denom = d;
    }

    // la méthode toString() :

    public String toString() {
        String chaine = "" + this.num + "/" + this.denom;

        return chaine;
    }

    // la méthode mult() :

    public void mult(Rational r2) {
        this.num = num * r2.num;
        this.denom = denom * r2.denom;
    }

    // la méthode add() :

    public void add(Rational r2) {
        this.num = this.num * r2.denom + this.denom * r2.num;
        this.denom = this.denom * r2.denom;
    }

    // la Méthode simplify() :

    public void simplify() {
        int pgcd = pgcd(this.num, this.denom);
        this.num = this.num / pgcd;
        this.denom = this.denom / pgcd;

    }

    // les fonctions pgcd :

    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b, a % b);
        }
    }

}