import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500 ,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel Panel5 = new JPanel();

        Panel1.setBackground(Color.red);
        Panel2.setBackground(Color.green);
        Panel3.setBackground(Color.yellow);
        Panel4.setBackground(Color.gray);
        Panel5.setBackground(Color.white);

        Panel1.setPreferredSize(new Dimension(100, 100));
        Panel2.setPreferredSize(new Dimension(100, 100));
        Panel3.setPreferredSize(new Dimension(100, 100));
        Panel4.setPreferredSize(new Dimension(100, 100));
        Panel5.setPreferredSize(new Dimension(100, 100));



        frame.setLayout(new BorderLayout(10 ,10));

        frame.add(Panel1 , BorderLayout.NORTH);
        frame.add(Panel2 , BorderLayout.SOUTH);
        frame.add(Panel3 , BorderLayout.WEST);
        frame.add(Panel4 , BorderLayout.EAST);
        frame.add(Panel5 , BorderLayout.CENTER);


    }
}
