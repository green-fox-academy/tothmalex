package pokemon;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        this.name = "Bulbasaur";
        this.hp = 10;
        this.strength = (int) (Math.random() * 10);
    }

    public String speak() {
        return "Bulba-saur";
    }
}