package packages;


import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;



public class MyFrame extends JFrame 
{


    public MyFrame()
    {

        // les différents configrations :

        this.setVisible(true);
        this.setLocation(100, 100); // Définit la position de la fenêtre à 100x100 pixels

        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("the first frame in my live");
        
        ImageIcon image = new ImageIcon("images/logo_ensimag.png");

        this.setIconImage(image.getImage());  

        // frame.getContentPane().setBackground(Color.green);
        // frame.getContentPane().setBackground(new Color(0,0,0)); // on utilise rgb 
        this.getContentPane().setBackground(new Color(0xFFFFFF)); // on utilise rgb         
    }
    
}
