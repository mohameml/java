package myframe;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Myframe implements ActionListener {
    
    JFrame frame = new JFrame();
    JButton Mybutton = new JButton("Window");

    public Myframe() {

        Mybutton.setFocusable(false);
        Mybutton.addActionListener(this);
        Mybutton.setBackground(Color.GREEN);
        Mybutton.setBounds(200 , 200 ,100 , 100);

        // frame.add(Mybutton , BorderLayout.CENTER);
        frame.add(Mybutton);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(500 , 500);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Mybutton) {
            this.frame.dispose();
            new NewWindow();
        }
    }
}
