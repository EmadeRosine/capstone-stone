package com.company;
public class Item {
    private String name;
    private String type;
    private String effect;

    /**
     * Constructor to initialize the item properties.
     *
     * @param name   The name of the item.
     * @param type   The type of the item (weapon, potion).
     * @param effect The effect of the item (damage bonus, health restore).
     */
    public Item(String name, String type, String effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
    }

    /**
     * Applies the effect of the item.
     */
    public void use() {
        System.out.println("Using item: " + name);
        System.out.println("Effect: " + effect);
    }

    public String getName() {
        return name;
    }
}