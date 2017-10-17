package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super(6);
        this.name = "Electricguitar";
    }
    public ElectricGuitar(int num) {
        super(num);
        this.name = "Electricguitar";
    }


    @Override
    String sound() {
        return ("Twang");
    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that " + sound());
    }
}
