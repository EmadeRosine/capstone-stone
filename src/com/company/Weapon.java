package com.company;

public class Weapon extends Item{

    /**
     * Constructor to initialize the item properties.
     *
     * @param name   The name of the item.
     * @param type   The type of the item (weapon, potion).
     * @param effect The effect of the item (damage bonus, health restore).
     */
    public Weapon(String name, String type, String effect) {
        super(name, type, effect);
    }
}

