package music;

import music.Instrument;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();
}
