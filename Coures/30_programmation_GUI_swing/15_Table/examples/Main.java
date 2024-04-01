import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Création des données pour la table (exemple)
        Object[][] data = {
            {"John", 25, "Male"},
            {"Alice", 30, "Female"},
            {"Bob", 28, "Male"} ,
            {"John", 25, "Male"},
            {"Alice", 30, "Female"},
            {"Bob", 28, "Male"} ,
            {"John", 25, "Male"},
            {"Alice", 30, "Female"},
            {"Bob", 28, "Male"} ,
            {"John", 25, "Male"},
            {"Alice", 30, "Female"},
            {"Bob", 28, "Male"}
        };

        // Création des titres des colonnes
        String[] columnNames = {"Nom", "Âge", "Genre"};

        // Création de la JFrame
        JFrame frame = new JFrame("Exemple de Table Swing");

        // Création de la JTable
        JTable table = new JTable(data, columnNames);

        // Ajout de la JTable à un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Ajout du JScrollPane à la JFrame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Configuration de la JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
