package com.greenfox.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private Drink drink;
    private Food food;
    private String name;
    private List<Trick> tricks;

    public Fox() {
        this.name = "Mr. Green";
        tricks = new ArrayList<>();
        drink = new Drink();
        food = new Food();
        drink.setName("water");
        food.setName("salad");
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }

    public Drink getDrink() {
        return drink;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void learnTrick(Trick t) {
        tricks.add(t);
    }
}