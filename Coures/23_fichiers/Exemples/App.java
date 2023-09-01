import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {

        // on recupere le chemin d'un fichier :
        Path path = Paths.get("file.txt");

        try {
            BufferedReader brf = Files.newBufferedReader(path);

            System.out.println(brf.readLine());

            String ligne2 = brf.readLine();
            System.out.println("ligne 2 :" + ligne2);
            brf.close();

        } catch (IOException e) {
            System.out.println("Errure :" + e.getMessage());
        } catch (Exception e2) {
            System.out.println("Errure :" + e2.getMessage());
        }
    }

}
