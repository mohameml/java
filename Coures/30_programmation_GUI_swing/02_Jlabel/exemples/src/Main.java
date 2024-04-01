import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {
    public static void main(String[] args) {


        // lables :
        JLabel label = new JLabel();
        label.setText("---- Page d'accueil : -------");       
        label.setIcon(new ImageIcon("images/programmation.png"));
        // label.setIconTextGap(20);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        

        // frame : 

        JFrame frame = new JFrame("My Frame");
    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.add(label);            
    }    
}