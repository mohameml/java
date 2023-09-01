import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenceMot {

    public static HashMap<Character, Integer> frequenceMot(String mot) {
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();

        for (int i = 0; i < mot.length(); i++) {

            if (dict.containsKey(mot.charAt(i))) {
                int frequence = dict.get(mot.charAt(i));
                dict.put(mot.charAt(i), frequence + 1);

            } else {
                dict.put(mot.charAt(i), 1);
            }
        }

        return dict;

    }

    public static void main(String[] args) {

        /*
         * énoce :
         * Entree : l'utilisateur écrit un mot
         * Sotie : la fréquence de chaque lettre dans le mot
         * 
         */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez votre mot svp :");
            String mot = scanner.nextLine();

            HashMap<Character, Integer> freqmot = frequenceMot(mot);

            // affichage

            for (Map.Entry<Character, Integer> freq : freqmot.entrySet()) {
                System.out.printf("le nombre de réptiton de %s est %d  \n", freq.getKey(), freq.getValue());
            }

        } catch (Exception e) {

            System.out.println("Errure :" + e.getMessage());
        } finally {
            scanner.close();
        }

    }

}
