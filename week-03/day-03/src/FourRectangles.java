import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){

        drawing(graphics, 50,100, 50,50);
        drawing(graphics, 25,105, 50,50);
        drawing(graphics, 75,110, 50,50);
        drawing(graphics, 105,115, 50,50);
    }
    public static void drawing(Graphics graphics, int x, int y, int width, int height) {

        graphics.setColor(Color.RED);
        graphics.fillRect(x, y, width, height);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(x, y, width, height);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(x, y, width, height);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, width, height);
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
