import javax.swing.*;
import javax.swing.text.Position;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class Board extends JComponent implements KeyListener {

        int testBoxX;
        int testBoxY;
        int size;
        String direction;
        int [][] floorPos;
        int [][] wallPos;


        public Board() {

            testBoxX = 0;
            testBoxY = 0;
            size = 72;
            direction = "down";
            floorPos = new int[11][10];
            wallPos = {{1, 2}, {3, 4}, {4,5}, {5, 4}};

            setPreferredSize(new Dimension(720, 792));
            setVisible(true);
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);

            int x = 0;
            int y = 0;
            for (int i = 0; i < floorPos.length + 1; i++) {
                for (int j = 0; j < floorPos[1].length + 1; j++) {
                    drawingFloor(graphics, "src/floor.png", x, y);
                    x += size;
                }
                x = 0;
                y += size;
            }

           /* for (int i = 0; i < floorPos[i].length; i++) {
                for (int j = 0; j < floorPos[j].length; j++) {
                    drawingFloor(graphics, "src/floor.png", floorPos[i][0] * size, floorPos[i][1] * size);
                }
            }*/

            for (int i = 0; i < wallPos[i].length; i++) {
                for (int j = 0; j < wallPos[j].length; j++) {
                    drawingWall(graphics, "src/wall.png", wallPos[i][0] * size, wallPos[i][1] * size);
                }
            }

                PositionedImage image = new PositionedImage("src/hero-" + direction + ".png", testBoxX, testBoxY);
                image.draw(graphics);
            }



            public void drawingFloor (Graphics graphics, String filename, int x, int y) {
                PositionedImage image = new PositionedImage(filename, x, y);
                image.draw(graphics);
            }

            public void drawingWall (Graphics graphics, String filename, int x, int y) {
                PositionedImage image = new PositionedImage(filename, x, y);
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
