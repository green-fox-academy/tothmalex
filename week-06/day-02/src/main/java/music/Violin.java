package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        super(4);
        this.name = "Violin";
    }

    public Violin (int num) {
        super(num);
        this.name = "Electricguitar";
    }

    @Override
    String sound() {
        return ("Screech");
    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that " + sound());
    }
}
