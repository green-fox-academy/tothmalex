import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    public Hero(int posX, int posY) {

        super("src/hero-down.png");
        super.posX = posX;
        super.posY = posY;
    }

    public void setDirection(String direction) {

        try {
            image = ImageIO.read(new File("src/hero-" + direction + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
