package com.greenfox.simbabank.model;

public class BankAccount {

    String name;
    int balance;
    String animalType;
    boolean king;
    boolean good;

    public BankAccount(String name, int balance, String animalType, boolean king, boolean good) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.good = good;
    }

    public boolean isKing() {
        return king;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isGood() {
        return good;
    }
}
