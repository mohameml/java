import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Paths;

public class ExempleOption {

    public static void main(String[] args) {

        // on ouvrir en fichier en mode ajout : APPEND

        try {

            BufferedWriter brw = Files.newBufferedWriter(Paths.get("file.txt"), StandardOpenOption.APPEND);

            brw.write("ceci un nouveau messaje !!!");

            brw.close();
        } catch (Exception e) {

            System.out.println("Errure :" + e.getMessage());
        }

    }

}
