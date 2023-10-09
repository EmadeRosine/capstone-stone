package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Player");
        Shop shop = new Shop();

        if (true) {
            System.out.println("Welcome to the RPG Game!");
            System.out.println("1. Inventory");
            System.out.println("2. Shop");
            System.out.println("3. Dragon Cave");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();


        }
    }
}


