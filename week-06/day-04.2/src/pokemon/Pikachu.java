package pokemon;

public class Pikachu extends Pokemon {

    public Pikachu(){
        this.name = "Pikachu";
        this.hp = 12;
        this.strength = (int) (Math.random() * 10);
    }

    public String speak() {
        return "Pika-pika";
    }
}