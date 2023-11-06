package packages;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class MyFrame extends JFrame implements ActionListener{
    

    JButton button ;
    JLabel label ;


    public MyFrame(int L , int l)
    {
        // label :
        label = new JLabel();
        label.setIcon(new ImageIcon("images/photos.png"));
        label.setBounds(200,200,100,100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);

        //button.addActionListener(e -> System.out.println("Hello from the button:!!"));
        button.addActionListener(this);

        
        button.setText("Hi I'am button");
        button.setFocusable(true);
        button.setIcon(new ImageIcon("images/bouton-marche.png"));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.ITALIC, 20));
        button.setIconTextGap(5);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.YELLOW);
        button.setBorder(new LineBorder(Color.RED ,5));
        // button.setBorder(new EtchedBorder());



        this.setSize(l ,L);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }



    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            //System.out.println("Hello world from the buton:");
            label.setVisible(true);
            // button.setEnabled(false);
        }
    }



}
