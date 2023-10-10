package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    Inventory inventory = new Inventory();
    // Add items to the inventory
        inventory.addItem(sword);
        inventory.addItem(potion);

    // Display the items in the inventory
        inventory.display();

    // Select an item from the inventory
    Item selected = inventory.selectItem(0);

        private List<Item> items;

        /**
         * Constructor to initialize the inventory.
         */
        public Inventory() {
            items = new ArrayList<>();
        }

        /**
         * Adds an item to the inventory.
         *
         * @param item The item to be added.
         */
        public void addItem(Item item) {
            items.add(item);
        }

        /**
         * Removes an item from the inventory.
         *
         * @param item The item to be removed.
         */
        public void removeItem(Item item) {
            items.remove(item);
        }

        /**
         * Displays the items in the inventory.
         */
        public void display() {
            System.out.println("Inventory:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }

        /**
         * Selects an item from the inventory.
         *
         * @param index The index of the item to be selected.
         * @return Returns the selected item.
         * @throws IndexOutOfBoundsException if the index is out of range.
         */
        public Item selectItem(int index) {
            if (index < 0 || index >= items.size()) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            return items.get(index);
        }
    }

