package com.company;


import java.util.List;
import java.util.Map;

public class Shop {
    private List<String> availableItems;
    private Map<String, Double> itemPrices;
    private List<String> sellableItems;
    private Map<String, Double> sellPrices;

    /**
     * Constructs a new Shop object with the given available items, their prices, sellable items, and their sell prices.
     *
     * @param availableItems The list of items available for purchase in the shop.
     * @param itemPrices     The prices of the items available for purchase.
     * @param sellableItems  The list of items the player can sell to the shop.
     * @param sellPrices     The prices for selling items to the shop.
     */
    public Shop(List<String> availableItems, Map<String, Double> itemPrices, List<String> sellableItems, Map<String, Double> sellPrices) {
        this.availableItems = availableItems;
        this.itemPrices = itemPrices;
        this.sellableItems = sellableItems;
        this.sellPrices = sellPrices;
    }

    /**
     * Allows the player to buy an item from the shop.
     *
     * @param item The item to be bought.
     * @return Returns true if the item was successfully bought, false otherwise.
     */
    public boolean buy(String item) {
        if (availableItems.contains(item)) {
            // Perform the necessary logic to handle the purchase
            // ...
            return true;
        } else {
            return false;
        }
    }

    /**
     * Allows the player to sell an item to the shop.
     *
     * @param item The item to be sold.
     * @return Returns true if the item was successfully sold, false otherwise.
     */
    public boolean sell(String item) {
        if (sellableItems.contains(item)) {
            // Perform the necessary logic to handle the selling
            // ...
            return true;
        } else {
            return false;
        }
    }
}