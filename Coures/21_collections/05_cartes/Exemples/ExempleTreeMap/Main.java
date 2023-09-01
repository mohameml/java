import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        // on ajoute des élements :

        treeMap.put(4, "rien");
        treeMap.put(5, "coucou");
        treeMap.put(6, "ok");
        treeMap.put(1, "sidi");
        treeMap.put(2, "khaled");
        treeMap.put(3, "Ahmed");

        // get :
        System.out.println(treeMap.get(1));

        // parcourir un treemPa :

        System.out.println("");
        for (Integer i : treeMap.keySet()) {
            System.out.println(treeMap.get(i));

        }

        // parcourir un TreeMap en utilisant Map.Entry

        for (Map.Entry<Integer, String> ent : treeMap.entrySet()) {
            System.out.printf("ent[%d]=%s \n", ent.getKey(), ent.getValue());
        }

    }
}