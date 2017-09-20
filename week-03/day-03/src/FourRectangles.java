import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.RED);
        graphics.fillRect(25, 100, 50, 67);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(50, 105, 50, 50);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(75, 110, 50, 234);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(105, 115, 50, 50);
    }
    // draw four different size and color rectangles.

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
