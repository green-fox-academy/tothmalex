import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){

        drawing(graphics, 0,0);
    }
    public static void drawing(Graphics graphics, int x, int y) {

        for (int i = x; i <= HEIGHT; i++) {
            if (i == 0 || i == HEIGHT) {
                for (int j = y; j < WIDTH; j += 20) {
                    graphics.setColor(Color.BLACK);
                    graphics.drawLine(j, i, WIDTH / 2, HEIGHT / 2);
                }
            }
        }
        for (int j = y; j <= WIDTH; j++) {
            if (j == 0 || j == WIDTH) {
                for (int i = x; i < HEIGHT; i += 20) {
                    graphics.setColor(Color.BLACK);
                    graphics.drawLine(j, i, WIDTH / 2, HEIGHT / 2);
                }
            }
        }
    }

    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

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
