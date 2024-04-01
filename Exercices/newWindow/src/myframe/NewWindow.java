package myframe;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    public NewWindow() {
        
        label.setBounds(100 , 100 , 200 , 50);
        label.setFont(new Font(null, Font.ITALIC, 25));

        frame.add(label);
        frame.setSize(500 , 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
