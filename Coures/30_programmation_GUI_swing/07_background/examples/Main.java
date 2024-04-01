import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Changer l'opacité d'un JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Fond opaque");
        label.setBackground(Color.GREEN);
        label.setOpaque(true); 

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }    
}
