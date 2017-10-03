import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class Board extends JComponent implements KeyListener {

        int testBoxX;
        int testBoxY;

        public Board() {
            testBoxX = 300;
            testBoxY = 300;

            // set the size of your draw board
            setPreferredSize(new Dimension(720, 792));
            setVisible(true);
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            graphics.fillRect(testBoxX, testBoxY, 72, 72);
            // here you have a 720x720 canvas
            // you can create and draw an image using the class below e.g.

            int x = 0;
            int y = 0;
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 10; j++) {
                    PositionedImage image = new PositionedImage("src/floor.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
                x = 0;
                y += 72;
            }

            x = 72;
            y = 144;
            for (int i = 2; i < 3; i++) {
                for (int j = 1; j < 4; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
            }

            x = 216;
            y = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 4; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    y += 72;
                }
            }
// ........................
            x = 72 * 5;
            y = 72 * 4;
            for (int i = 5; i < 6; i++) {
                for (int j = 6; j < 10; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
            }

            x = 72 * 5;
            y = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 5; j < 6; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    y += 72;
                }
            }

            x = 72 * 8;
            y = 72 * 5;
            for (int i = 5; i < 9; i++) {
                for (int j = 9; j < 10; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    y += 72;
                }
            }

            //------------------- creating the blocks
            x = 72 * 7;
            y = 72;
            for (int i = 1; i < 3; i++) {
                for (int j = 7; j < 9; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
                x = 72 * 7;
                y += 72;
            }

            x = 72 * 5;
            y = 72 * 6;
            for (int i = 5; i < 7; i++) {
                for (int j = 6; j < 8; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
                x = 72 * 5;
                y += 72;
            }

            //....................
            x = 0;
            y = 72 * 4;
            for (int i = 4; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
            }

            x = 72;
            y = 72 * 5;
            for (int i = 4; i < 6; i++) {
                for (int j = 1; j < 2; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    y += 72;
                }
            }

            x = 72 * 3;
            y = 72 * 5;
            for (int i = 4; i < 6; i++) {
                for (int j = 3; j < 4 ; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    y += 72;
                }
            }

            x = 72 * 5;
            y = 72 * 9;
            for (int i = 9; i < 10; i++) {
                for (int j = 5; j < 7; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
            }

            x = 72;
            y = 72 * 8;
            for (int i = 8; i < 9; i++) {
                for (int j = 1; j < 4; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;
                }
            }

            x = 72 * 3;
            y = 72 * 9;
            for (int i = 9; i < 11; i++) {
                for (int j = 3; j < 4; j++) {
                    PositionedImage image = new PositionedImage("src/wall.png", x, y);
                    image.draw(graphics);
                    y += 72;
                }
            }

            // .... creating sinlge ones
            PositionedImage image = new PositionedImage("src/wall.png", 72, 72 * 10);
            image.draw(graphics);

            image = new PositionedImage("src/wall.png", 72 * 5 , 72 * 10);
            image.draw(graphics);

        }

            // To be a KeyListener the class needs to have these 3 methods in it
            @Override
            public void keyTyped (KeyEvent e){

            }

            @Override
            public void keyPressed (KeyEvent e){

            }

            // But actually we can use just this one for our goals here
            @Override
            public void keyReleased (KeyEvent e){
                // When the up or down keys hit, we change the position of our box
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    testBoxY -= 100;
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    testBoxY += 100;
                }
                // and redraw to have a new picture with the new coordinates
                repaint();
            }
        }
