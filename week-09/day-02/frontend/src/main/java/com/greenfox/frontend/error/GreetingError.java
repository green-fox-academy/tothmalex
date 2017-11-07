package com.greenfox.frontend.error;

public class GreetingError {

    public String error;

    public GreetingError (String error) {

        this.error = "Please provide a " + error +"!";
    }
}