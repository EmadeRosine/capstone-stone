package com.company;

public class Player {
private String name;
private int attack;
private int defense;
private int health;
private int goldCoins;
private int experiencePoints;
private Inventory inventory;


        /**
         * Constructs a Player object with the specified health.
         *
         * @param health The player's health.
         */
        public Player(int health) {
                this.health = health;
        }

        /**
         * Gets the player's health.
         *
         * @return The player's health.
         */
        public int getHealth() {
                return health;
        }

        /**
         * Sets the player's health.
         *
         * @param health The player's health.
         */
        public void setHealth(int health) {
                this.health = health;
        }




public Player(String name, int attack, int defense, int health, int goldCoins, int experiencePoints, Inventory inventory) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.goldCoins = goldCoins;
        this.experiencePoints = experiencePoints;
        this.inventory = inventory;
        }

/**
 * Getter for the player's name.
 *
 * @return Returns the name of the player.
 */
public String getName() {
        return name;
        }

/**
 * Getter for the player's attack power.
 *
 * @return Returns the attack power of the player.
 */
public int getAttack() {
        return attack;
        }

/**
 * Getter for the player's defense power.
 *
 * @return Returns the defense power of the player.
 */
public int getDefense() {
        return defense;
        }


/**
 * Getter for the player's gold coins.
 *
 * @return Returns the amount of gold coins the player has.
 */
public int getGoldCoins() {
        return goldCoins;
        }

/**
 * Getter for the player's experience points.
 *
 * @return Returns the experience points of the player.
 */
public int getExperiencePoints() {
        return experiencePoints;
        }

/**
 * Getter for the player's inventory.
 *
 * @return Returns the inventory of the player.
 */
public Inventory getInventory() {
        return inventory;
        }

/**
 * Method for the player to attack the dragon in the dragon's cave.
 */
public void attack() {
        // Code to attack the dragon
        // ...
        }

/**
 * Method for the player to drink a potion from the inventory.
 */
public void drinkPotion() {
        // Code to drink a potion from the inventory
        // ...
        }

/**
 * Method for the player to attempt to flee from the dragon in the dragon's cave.
 */
public void flee() {
        // Code to attempt to flee from the dragon
        // ...
        }
        }