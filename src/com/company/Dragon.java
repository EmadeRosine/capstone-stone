package com.company;

public class Dragon {
    private int level;
    private String type;
    private int attack;
    private int defense;
    private int health;


    private int strength;

    /**
     * Constructs a Dragon object with the specified strength.
     *
     * @param strength The dragon's strength.
     */
    public Dragon(int strength) {
        this.strength = strength;
    }

    /**
     * Gets the dragon's strength.
     *
     * @return The dragon's strength.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the dragon's strength.
     *
     * @param strength The dragon's strength.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }




    /**
     * Constructs a new Dragon object with the given level, type, attack, defense, and health.
     *
     * @param level   The level of the dragon.
     * @param type    The type of the dragon (Green, Blue, Red, Black, Gold).
     * @param attack  The attack power of the dragon.
     * @param defense The defense power of the dragon.
     * @param health  The health points of the dragon.
     */
    public Dragon(int level, String type, int attack, int defense, int health) {
        this.level = level;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

    /**
     * Allows the dragon to attack the player.
     */
    public void attack() {
        // Perform the necessary logic for the dragon's attack
        // ...
    }

    /**
     * Allows the dragon to defend against the player's attacks.
     */
    public void defend() {
        // Perform the necessary logic for the dragon's defense
        // ...
    }
}
