package com.greenfoxacademy.simbabank.model;

import java.text.DecimalFormat;

public class BankAccount {

    String name;
    String balance;
    String animalType;
    boolean king;
    String state;

    public BankAccount(String name, int balance, String animalType, boolean king, String state) {
        this.name = name;
        this.balance = String.format("%02d", balance);
        this.animalType = animalType;
        this.king = king;
        this.state = state;
    }

    public boolean isKing() {
        return king;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getState() {
        return state;
    }
}
