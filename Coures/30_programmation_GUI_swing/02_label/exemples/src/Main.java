import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.*;
import javax.swing.SwingConstants;



public class Main {
    public static void main(String[] args) {


         // lables :
        JLabel label = new JLabel();
        label.setText("Bonjour le gars !!!");       
        label.setIcon(new ImageIcon("images/programmation.png"));
        label.setIconTextGap(20);


        // s:
        // ---------- position de Text et l'icon  dans le label  : -------------

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        // ---------- position de Text dans le label par roppet à l'icon : -------------
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(SwingConstants.CENTER);


        // ---------- style de text  : ------------------
        label.setForeground(Color.green);  // set the color of text 
        label.setFont(new Font("MV Boli" , Font.ITALIC , 20)); // le font 
        



        // --------------- backeground de label : --------------
        label.setBackground(Color.black);
        label.setOpaque(true);


        // -------------------- bordur de label : --------------------

        Border br = new LineBorder(Color.RED,10);


        label.setBorder(br);  
        // label.setBorder(new EtchedBorder(EtchedBorder.RAISED));  
        label.setBorder(new BevelBorder(BevelBorder.LOWERED)); // Bordure en biseau


        // un autre Label :
        JLabel label2 = new JLabel("je suis le 2 eme Label ");

        // ---------------------- position de label dans lé fentre ------------------------
        label.setBounds(0, 0, 550, 550);
        label2.setBounds(600, 0,200 , 200);


        // frame : 

        JFrame frame = new JFrame("the second frame in my live");
    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
         frame.setLayout(null); // changement du comportement par défaurt de manger de farme 
        frame.add(label);

        frame.add(label2);
        
        // frame.pack();
        


    
        
    }    
}
