public class Trees{

    String type;
    String color;
    int waterLevel;

    public void watering() {
        if (waterLevel < 5) {
            System.out.println("The " + color + type + " needs water.");
        } else {
            System.out.println("The " + color + type + " needs water.");
        }
    }

    public void waterIncrease(int pouring ) {
        waterLevel += pouring * 0.75;
    }

    public void waterDecrease(int numberOfDays ) {
        waterLevel -= numberOfDays * 5;
    }

    public Trees(String type, String color) {
        this.type = type;
        this.color = color;
        this.waterLevel = 50;
    }
}
