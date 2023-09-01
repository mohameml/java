import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>();

        // on insere de donnes

        dict.put("1", "Sidi");
        dict.put("13", "Ahmed");
        dict.put("2", "Amare");

        // parcourir le HashMap

        System.out.println(dict.get("1"));

        // parcour

        for (String str : dict.keySet()) {
            System.out.println(str);
        }

        // parcourir ler HashMap avec entry

        for (Map.Entry<String, String> ent : dict.entrySet()) {
            System.out.printf("ent[%s]=%s\n", ent.getKey(), ent.getValue());

        }

        System.out.println(dict.containsKey("2"));

    }

}