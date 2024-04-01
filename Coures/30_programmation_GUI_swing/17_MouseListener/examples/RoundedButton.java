import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            super.paintComponent(g);
            return;
        }
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        float arc = 20.0f;
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, width - 1, height - 1, arc, arc));
        g2.setColor(getForeground());
        g2.setStroke(new BasicStroke(2));
        g2.draw(new RoundRectangle2D.Float(0, 0, width - 1, height - 1, arc, arc));
        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Do not paint border
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rounded Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            RoundedButton button = new RoundedButton("Click Me");
            frame.getContentPane().add(button, BorderLayout.CENTER);
            frame.setSize(200, 100);
            frame.setVisible(true);
        });
    }
}
