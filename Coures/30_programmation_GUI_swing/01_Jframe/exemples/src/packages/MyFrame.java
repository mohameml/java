package packages;


import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;



public class MyFrame extends JFrame {


    public MyFrame(String title) {

        super(title);

        this.setVisible(true);
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon image = new ImageIcon("images/logo_ensimag.png");

        this.setIconImage(image.getImage());  
        this.getContentPane().setBackground(new Color(0xFF1220));

    }
    
}
