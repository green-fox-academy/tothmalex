import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

        int size;
        int floorWidth;
        int floorHeight;
        String direction;
        int [][] wallPos;
        Hero hero;
        Boss boss;
        Skeleton skeleton;
        Enemy enemies;

        public Board() {

            size = 72;
            direction = "down";
            floorWidth = 10;
            floorHeight = 11;
            hero = new Hero(0,0);
            boss = new Boss();
            skeleton = new Skeleton();
            enemies = new Enemy();

            wallPos = new int[][]{{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                    {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                    {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};

            setPreferredSize(new Dimension(720, 792));
            setVisible(true);

            for (int i = 0; i < 3; i++) {
                enemies.add(new Skeleton());
            }
            for (int i = 1; i < enemies.size(); i++) {
                while (isItaWall(enemies.get(i).posX, enemies.get(i).posY)) {
                    enemies.get(i).setCharPos();
                }
            }
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);

            for (int i = 0; i < floorWidth; i++) {
                for (int j = 0; j < floorHeight; j++) {
                    drawingFloor(graphics, "src/floor.png", i, j);
                }
            }

            for (int i = 0; i < wallPos.length; i++) {
                drawingWall(graphics, "src/wall.png", wallPos[i][0], wallPos[i][1] );
            }

            hero.draw(graphics);
            boss.draw(graphics);

            for (int i = 0; i < enemies.size(); i++) {
                enemies.get(i).draw(graphics);
                }
             }

            public void drawingFloor (Graphics graphics, String filename, int x, int y) {
                PositionedImage image = new PositionedImage(filename, x, y);
                image.draw(graphics);
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
            public void keyReleased (KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_UP) {

                    hero.setDirection("up");
                    if (hero.posY > 0 && !isItaWall(hero.posX, (hero.posY - 1))) {
                        hero.posY--;
                    } else {}
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

                    hero.setDirection("down");
                    if (hero.posY < floorHeight - 1 && !isItaWall(hero.posX, (hero.posY + 1))) {
                        hero.posY++;
                    } else {}
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                    hero.setDirection("left");
                    if (hero.posX > 0 && !isItaWall((hero.posX - 1), hero.posY)) {
                        hero.posX--;
                    } else {}
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                    hero.setDirection("right");
                    if (hero.posX < floorWidth - 1 && !isItaWall((hero.posX + 1), hero.posY)) {
                        hero.posX++;
                    } else {}
                }
                repaint();
            }

            public boolean isItaWall(int posX, int posY) {
                for (int i = 0; i < wallPos.length; i++) {
                    if (wallPos[i][0] == posX && wallPos[i][1] == posY) {
                        return true;
                    }
                }
                return false;
            }
        }
