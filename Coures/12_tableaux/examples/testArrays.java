import java.util.Arrays;

public class testArrays {

    public static void afficherTab(int[] tab) {

        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ",");

        }
        System.out.println(tab[tab.length - 1]);
    }

    public static void main(String[] args) {
        int[] tab = { 2, 7, 1, 4, 5, 3, 6, 9, 8 };

        // la fonction sort
        Arrays.sort(tab); // le trié est locale
        afficherTab(tab); // 1,2,3,4,5,6,7,8,9

        // binarySearch(T[] array, T key)

        int indice = Arrays.binarySearch(tab, 1);

        System.out.println("L'indice de l'élement 1 est : " + indice);

    }

}
