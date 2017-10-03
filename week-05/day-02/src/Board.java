import javax.swing.*;
import javax.swing.text.Position;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class Board extends JComponent implements KeyListener {

        int testBoxX;
        int testBoxY;
        int size;
        int floorWidth;
        int floorHeight;
        String direction;
        int [][] floorPos;
        int [][] wallPos;


        public Board() {

            testBoxX = 0;
            testBoxY = 0;
            size = 72;
            direction = "down";
            floorWidth = 10;
            floorHeight = 11;
            wallPos = new int[][]{{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                    {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                    {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};

            setPreferredSize(new Dimension(720, 792));
            setVisible(true);
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);

            int x = 0;
            int y = 0;
            for (int i = 0; i < floorHeight; i++) {
                for (int j = 0; j < floorWidth; j++) {
                    drawingFloor(graphics, "src/floor.png", x, y);
                    x += size;
                }
                x = 0;
                y += size;
            }
            

            for (int i = 0; i < wallPos.length; i++) {
                    drawingWall(graphics, "src/wall.png", wallPos[i][0] * size, wallPos[i][1] * size);
                }

                PositionedImage image = new PositionedImage("src/hero-" + direction + ".png", testBoxX, testBoxY);
                image.draw(graphics);
            }

            public void drawingFloor (Graphics graphics, String filename, int x, int y) {
                PositionedImage image = new PositionedImage(filename, x, y);
                image.draw(graphics);

               /* public class Floor extends PositionedImage {

                    public Floor(int posX, int posY) {
                        super("images/floor.png", posX, posY);
                    }
                }*/
            }

            public void drawingWall (Graphics graphics, String filename, int x, int y) {
                PositionedImage image = new PositionedImage(filename, x, y);
                image.draw(graphics);
            }


            @Override
            public void keyTyped (KeyEvent e){
            }

            @Override
            public void keyPressed (KeyEvent e){
            }

            @Override
            public void keyReleased (KeyEvent e){

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    testBoxY -= 72;
                    direction = "up";
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    testBoxY += 72;
                    direction = "down";
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    testBoxX -= 72;
                    direction = "left";
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                     testBoxX += 72;
                     direction = "right";
                }
                repaint();
            }
        }
