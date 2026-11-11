package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {

    public static void main(String[] args) {

        ArrayList<Product> inventory = new ArrayList<>();
        ArrayList<Product> cart = new ArrayList<>();

        Store.loadInventory("products.csv", inventory);

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice != 3) {

            System.out.println("\n=== ONLINE STORE ===");
            System.out.println("1. Display Products");
            System.out.println("2. Display Cart");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    Store.displayProducts(inventory, cart, scanner);
                    break;

                case 2:
                    Store.displayCart(cart, scanner);
                    break;

                case 3:
                    System.out.println("Thank you for shopping with us!");
                    break;

                default:
                    System.out.println("Please choose 1-3.");
            }
        }

        scanner.close();
    }
}
