import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500 , 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER , 10 ,0));

        JPanel Panel = new JPanel();

        Panel.setPreferredSize(new Dimension(100 , 200));
        Panel.setLayout(new FlowLayout());
        Panel.setBackground(Color.gray);
        Panel.add(new JButton("1"));
        Panel.add(new JButton("2"));
        Panel.add(new JButton("3"));
        Panel.add(new JButton("4"));
        Panel.add(new JButton("5"));
        Panel.add(new JButton("6"));
        Panel.add(new JButton("7"));
        Panel.add(new JButton("8"));
        Panel.add(new JButton("9"));

        frame.add(Panel);
        frame.setVisible(true);

    }    
}
