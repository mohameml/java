import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class ChartExample extends JFrame {

    public ChartExample(String title) {
        super(title);

        // Créer un ensemble de données pour le graphique
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series 1", "Category 1");
        dataset.addValue(4.0, "Series 1", "Category 2");
        dataset.addValue(3.0, "Series 1", "Category 3");
        
        // Créer le graphique à partir de l'ensemble de données
        JFreeChart chart = ChartFactory.createLineChart(
            "Line Chart Example", // Titre du graphique
            "Category",           // Étiquette de l'axe des abscisses
            "Value",              // Étiquette de l'axe des ordonnées
            dataset
        );

        // Créer un panneau de graphique pour afficher le graphique
        ChartPanel chartPanel = new ChartPanel(chart);
        
        // Ajouter le panneau de graphique au JFrame
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> {
        // });
        ChartExample example = new ChartExample("JFreeChart Example");
        example.setSize(800, 600);
        example.setLocationRelativeTo(null); // Centrer la fenêtre
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        example.setVisible(true);
    }
}
