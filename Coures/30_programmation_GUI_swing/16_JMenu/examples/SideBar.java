import javax.swing.*;
import java.awt.*;

public class SideBar {
    public static void main(String[] args) {
        // Création de la JFrame
        JFrame frame = new JFrame("Exemple de Sidebar Swing");

        // Création du JPanel pour la sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBackground(Color.LIGHT_GRAY);
        sidebar.setPreferredSize(new Dimension(150, frame.getHeight())); // Largeur et hauteur de la sidebar

        // Ajout de composants à la sidebar (exemple)
        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");
        JButton button3 = new JButton("Option 3");
        sidebar.setLayout(new GridLayout(3, 1)); // Positionnement des boutons en colonne
        sidebar.add(button1);
        sidebar.add(button2);
        sidebar.add(button3);

        // Création du JPanel pour le contenu principal
        JPanel content = new JPanel();
        content.setBackground(Color.WHITE);

        // Ajout de la sidebar à gauche et du contenu principal à droite
        frame.add(sidebar, BorderLayout.WEST);
        frame.add(content, BorderLayout.CENTER);

        // Configuration de la JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Taille de la fenêtre principale
        frame.setVisible(true);
    }
}
