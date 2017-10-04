import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    public Hero() {
        super();
    }

    public void setDirection(String direction) {

        try {
            image = ImageIO.read(new File("src/hero-" + direction + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
