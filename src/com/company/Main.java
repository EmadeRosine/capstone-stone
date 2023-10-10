package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    private Player player;
    private Dragon dragon;

    /**
     * Constructs a Game object with a player and a dragon.
     *
     * @param player The player object.
     * @param dragon The dragon object.
     */
    public Main(Player player, Dragon dragon) {
        this.player = player;
        this.dragon = dragon;
    }

    /**
     * Starts the game by displaying the main menu options.
     */

    public static void main(String[] args) {

        // Create some items
        Item sword = new Item("Sword", "Weapon", "Damage bonus: +10");
        Item potion = new Item("Health Potion", "Potion", "Restore 50 health");

        // Create an inventory



        // Use the selected item
        selected.use();

        // Remove the selected item from the inventory
        inventory.removeItem(selected);

        // Display the updated inventory
        inventory.display();


        // Create an inventory for the player
        Inventory playerInventory = new Inventory();

        // Create a player object
        Player player = new Player("John", 10, 5, 100, 50, 0, playerInventory);

        // Perform actions with the player
        player.attack();
        player.drinkPotion();
        player.flee();


        // Create a shop with available items, their prices, sellable items, and their sell prices
        List<String> availableItems = new ArrayList<>();
        availableItems.add("Sword");
        availableItems.add("Shield");
        availableItems.add("Potion");

        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Sword", 10.0);
        itemPrices.put("Shield", 15.0);
        itemPrices.put("Potion", 5.0);

        List<String> sellableItems = new ArrayList<>();
        sellableItems.add("Old Sword");
        sellableItems.add("Rusty Shield");

        Map<String, Double> sellPrices = new HashMap<>();
        sellPrices.put("Old Sword", 2.0);
        sellPrices.put("Rusty Shield", 3.0);

        Shop shop = new Shop(availableItems, itemPrices, sellableItems, sellPrices);

        // Create a dragon with level, type, attack, defense, and health
        Dragon dragon = new Dragon(5, "Red", 50, 30, 100);

        // Perform actions in the game
        shop.buy("Sword");
        shop.sell("Old Sword");
        dragon.attack();
        dragon.defend();
    }
}




