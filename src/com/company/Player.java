package com.company;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int attack;
    private int defense;
    private int health;
    private int goldCoins;
    private int experiencePoints;
    private List<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.attack = 10;
        this.defense = 5;
        this.health = 100;
        this.goldCoins = 0;
        this.experiencePoints = 0;
        this.inventory = new ArrayList<>();
    }
}
