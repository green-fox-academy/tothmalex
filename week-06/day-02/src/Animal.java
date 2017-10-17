public abstract class Animal {

    int age;
    String name;
    String gender;
    String color;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void greet();
    abstract String wantChild();
}

