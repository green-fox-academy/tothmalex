public class Garden {

    String type;
    String color;

    public void watering() {
        System.out.println("The " + color + type + " needs water.");
    }

    public void noWatering() {
        System.out.println("The " + color + type + " needs water.");
    }

    public Garden(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }
    }
}
