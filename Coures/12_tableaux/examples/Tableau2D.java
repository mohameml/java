
public class Tableau2D {

    public static void afficherTab2D(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int elem : ligne) {
                System.out.print(elem + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int[][] matrice = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        afficherTab2D(matrice);
    }

}
