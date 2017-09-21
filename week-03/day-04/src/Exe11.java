import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exe11 {

    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 0;
        int w = WIDTH;
        int h = HEIGHT;

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x, y, w, h);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, w, h);

        drawSquare(graphics, x, y, w, h);
    }

    public static int drawSquare(Graphics g, int x, int y, int w, int h) {

        g.setColor(Color.BLACK);
        g.drawRect(x + w / 3, y, w / 3, h / 3);
        g.drawRect(x + w / 3 * 2, y + h / 3, w / 3, h / 3);
        g.drawRect(x + w / 3, y + w / 3 * 2, w / 3, h / 3);
        g.drawRect(x, y + h / 3, w / 3, h / 3);

        if (w == 0) {
            return 0;
        } else {
            return drawSquare(g, x + w / 3, y + h / 3, w / 3, h / 3);
        }

       /* float radius = (float)(6 * Math.sqrt(i));
        int x = (int)(radius * Math.cos(angle)) + i;
        int y = (int)(radius * Math.sin(angle)) + i;
        g.setColor(Color.getHSBColor((float)i / n,1,1));
        g.fillOval(x, y, (int)radius % w, (int)radius % w);
        if (i < n) {
            drawSquare(g, cx, cy, w, i + 1, n);
        } */

        }


    //    Don't touch the code below
    static int WIDTH = 660;
    static int HEIGHT = 660;

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

