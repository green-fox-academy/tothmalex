
public class Character extends PositionedImage {

    public Character(String filename) {

        super(filename);
    }

    public Character(String filename, int posX, int posY) {

        super(filename, posX, posY);
    }

    public void setPos() {
        posX = ((int) (Math.random() * 10));
        posY = ((int) (Math.random() * 11));
    }
}

