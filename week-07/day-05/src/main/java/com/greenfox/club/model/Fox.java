package com.greenfox.club.model;

import java.util.ArrayList;

public class Fox {

    String name;
    ArrayList<String> tricks;
    ArrayList<String> food;
    ArrayList<String> drink;

    public Fox(String name, ArrayList<String> tricks, ArrayList<String> food, ArrayList<String> drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public ArrayList<String> getFood() {
        return food;
    }

    public ArrayList<String> getDrink() {
        return drink;
    }
}
