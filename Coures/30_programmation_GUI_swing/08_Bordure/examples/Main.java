import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Title");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500 , 500);
        frame.setLayout(null);


        JLabel label = new JLabel("Lable");

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        label.setBorder(new LineBorder(Color.GREEN , 2));
        
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.setBounds(200 , 200 , 100 , 100);


        frame.add(label);



    }

}
