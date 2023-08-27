import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> listeCat = new ArrayList<Cat>(5);

        Cat c1 = new Cat("cat1", 1);
        Cat c2 = new Cat("cat2", 2);
        Cat c3 = new Cat("cat3", 3);

        // Les ajouts de cat dans ArrayList :

        listeCat.add(c1);
        listeCat.add(c2);
        listeCat.add(c3);

        // parcourir :

        for (Cat c : listeCat) {
            c.miaou();
        }

        // Acces a un élemnt :

        Cat cat = listeCat.get(0);
        cat.miaou();

        // supprimer un élemnt
        listeCat.remove(c1);

        for (Cat c : listeCat) {
            c.miaou();
        }

        // le nombre des élements :

        System.out.printf("len(listeCat) = %d \n", listeCat.size());

    }

}