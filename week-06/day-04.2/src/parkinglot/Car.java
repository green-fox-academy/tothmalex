package parkinglot;

public class Car {

    public enum Brand {DACIA, NISSAN, MAZDA, OPEL, VOLKSWAGEN, FORD}
    public enum Color {RED, WHITE, BLUE, YELLOW, GREEN}

    Brand brand;
    Color color;

    public Car() {
        this.color = Color.values()[(int) (Math.random() * Color.values().length)];
        this.brand = Brand.values()[(int) (Math.random() * Brand.values().length)];
    }
}