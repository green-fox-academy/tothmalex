import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {

        int a = 250;

        for (int i = 0; i < 10; i++) {
            drawing(graphics, a, (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            a-=20;
        }
    }
    public static void drawing(Graphics graphics, int size, int R, int G, int B) {

        int x = (WIDTH-size)/2;
        int y = (HEIGHT-size)/2;

        graphics.setColor(new Color(R, G, B));
        graphics.fillRect(x, y, size, size);
    }

    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

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
