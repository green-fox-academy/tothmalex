package music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super(4);
        this.name = "Bassguitar";
    }

    public BassGuitar(int num) {
        super(num);
        this.name = "Electricguitar";
    }

    @Override
    String sound() {
        return ("Duum-duum-duum");
    }

    @Override
    void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that " + sound());
    }
}
