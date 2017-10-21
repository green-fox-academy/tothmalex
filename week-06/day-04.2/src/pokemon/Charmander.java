package pokemon;

public class Charmander  extends Pokemon{

    public Charmander() {
        this.name = "Charmander";
        this.hp = 10;
        this.strength = (int) (Math.random() * 10);
    }

    public String speak() {
        return "Char-char";
    }
}