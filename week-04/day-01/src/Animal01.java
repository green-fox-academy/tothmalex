public class Animal01 {

    String name;
    int hungerValue = 50;
    int thirstValue = 50;

    public Animal01(String name, int hungerValue, int thirstValue) {
        this.name = name;
        this.hungerValue = hungerValue;
        this.thirstValue = thirstValue;
    }

    public void canEat(){
        this.hungerValue += 1;
    }

    public void canDrink(){
        this.thirstValue += 1;
    }

    public void canPlay(){
        this.hungerValue += 1;
        this.thirstValue += 1;
    }

    public static void main(String[] args) {
        Animal01 animal1 = new Animal01("Alex", 50, 50);
        Animal01 animal2 = new Animal01("Dog",50,50);
    }
}
/* Create Animal class
    Every animal has a hunger value, which is a whole number
                    Every animal has a thirst value, which is a whole number
                    when creating a new animal object these values are created with the default 50 value
    Every animal can eat() which decreases their hunger by one
    Every animal can drink() which decreases their thirst by one
    Every animal can play() which increases both by one
*/