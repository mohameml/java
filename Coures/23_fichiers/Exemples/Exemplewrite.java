
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exemplewrite {
    public static void main(String[] args) {

        try {
            BufferedWriter brw = Files.newBufferedWriter(Paths.get("fil2.txt"));
            /*
             * Les Méthodes pour écrire dabs le fichier :
             * - write()
             * -newLine : pour le reour a la ligne
             * 
             */

            brw.write("Bonjour tout le mond !!!");
            brw.newLine();
            brw.write("Sidi va à l'école .");

            brw.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Errure :" + e.getMessage());
        }

    }

}
