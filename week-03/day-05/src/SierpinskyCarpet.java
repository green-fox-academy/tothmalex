import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    private static int sizeChange = 0;

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.drawRect(0 + sizeChange, 0 + sizeChange, WIDTH, HEIGHT);
        //graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        graphics.fillRect(0 + sizeChange, 0 + sizeChange, WIDTH, HEIGHT);

        drawSquare(graphics, 0+ sizeChange, 0+ sizeChange, HEIGHT, 4);
    }
    static int drawSquare(Graphics g, int x, int y, int size, int n) {


        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.fillRect(x + size / 3, y + size / 3, size / 3 + sizeChange, size / 3 + sizeChange);

       if (n == 0) {
            return 0;
        } else {
           drawSquare(g, x, y, size / 3, n - 1);
           drawSquare(g,x + size / 3, y, size / 3, n - 1);
           drawSquare(g,x + 2 * size / 3, y, size / 3, n - 1);
           drawSquare(g,x, y + size / 3, size / 3, n - 1);
           drawSquare(g,x + 2 * size / 3, y + size / 3, size / 3,n -1);
           drawSquare(g, x, y + 2 * size / 3, size / 3, n - 1);
           drawSquare(g,x + size / 3, y + 2 * size / 3, size / 3, n - 1);
           drawSquare(g,x + 2 * size / 3, y + 2 * size / 3, size / 3, n - 1);
        } return 0;
    }

    //    Don't touch the code below
    static int WIDTH = 660;
    static int HEIGHT = 660;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel im = new ImagePanel();
        jFrame.add(im);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        boolean goingUp = true;
        while(true) {
            if (goingUp) {
                sizeChange += 1;
                if (sizeChange > 10) {
                    goingUp = !goingUp;
                }
            } else {
                sizeChange -= 1;
                if (sizeChange < 1) {
                    goingUp = !goingUp;
                }
            }
            im.repaint();
            Thread.sleep(100);
        }
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}