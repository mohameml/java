import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setVisible(true);
        frame.setSize(500 , 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel  titre = new JLabel("Bienvenue  dans l'App du gestion de poretefeuille");
        titre.setFont(new Font("Times New Roman", Font.BOLD, 15));
        titre.setHorizontalAlignment(SwingConstants.CENTER);
        titre.setVerticalAlignment(SwingConstants.CENTER);        
        
        
        
        
        
        
        frame.add(titre);
    }

}
