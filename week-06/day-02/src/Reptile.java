public class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    void greet() {
    }

    @Override
    String wantChild() {
        return ("want a child from an egg!");
    }
}
