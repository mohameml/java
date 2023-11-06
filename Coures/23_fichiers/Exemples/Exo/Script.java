import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

public class Script {
    /*
     * Entrée : fichier note.txt
     * Sortie : fichier moyenne.txt
     */

    public static float average(int[] tab) {
        int sum = 0;
        for (int i : tab) {
            sum += i;
        }

        return sum / tab.length;
    }

    public static HashMap<String, Float> getData(String nameFichier) {
        // here I will extract the data in file and put theme in HashMap :

        HashMap<String, Float> dict = new HashMap<String, Float>();

        try {

            BufferedReader brw = Files.newBufferedReader(Paths.get(nameFichier));

            String ligne = brw.readLine();
            while (ligne != null) {
                // traitement d'une ligne :
                String[] nameNotes = ligne.split(":");
                System.out.println(nameNotes[0] + "" + nameNotes[1]);
                String[] notes = nameNotes[1].split(",");
                int[] tab = new int[3];

                for (int i = 0; i < notes.length; i++) {
                    tab[i] = Integer.parseInt(notes[i]);
                }

                // And i will put this data in HashMap :

                dict.put(nameNotes[0], average(tab));

                // update the line :
                System.out.print(ligne);
                ligne = brw.readLine();
            }

            brw.close();

        } catch (Exception e) {
            System.out.println("Errure :" + e.getMessage());
        }

        return dict;

    }

    public static void main(String[] args) {

        HashMap<String, Float> data = getData("note.txt");

        try {
            BufferedWriter brw = Files.newBufferedWriter(Paths.get("moyenne.txt"), StandardOpenOption.CREATE);

            for (Map.Entry<String, Float> ligne : data.entrySet()) {
                String name = ligne.getKey();
                float moyenne = ligne.getValue();
                brw.write("" + name + ":" + moyenne);
                brw.newLine();

            }

            brw.close();

        } catch (Exception e) {
            System.out.println("Errure :" + e.getMessage());
        }

    }
}