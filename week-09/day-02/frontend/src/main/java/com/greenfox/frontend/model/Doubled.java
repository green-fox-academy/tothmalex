package com.greenfox.frontend.model;

public class Doubled {
    public int received;
    public int result;

    public int doubling ( int input){
        result = input *2;
        return result;
    }

    public Doubled( int received, int result ) {
        this.received = received;
        this.result = result;
    }
}
