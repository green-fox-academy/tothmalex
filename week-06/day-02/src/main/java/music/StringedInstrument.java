package main.java.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();
}
