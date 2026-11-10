package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Store {

    public static void main(String[] args) {

        // Create lists for inventory and the shopping cart
        ArrayList<Product> inventory = new ArrayList<>();
        ArrayList<Product> cart = new ArrayList<>();

        // Load inventory from the data file (pipe-delimited: SKU|Product Name|Price|Department)
        loadInventory("products.csv", inventory);

        // Main menu loop
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 3) {
            System.out.println("\nWelcome to the Online Store!");
            System.out.println("1. Show Products");
            System.out.println("2. Show Cart");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter 1, 2, or 3.");
                scanner.nextLine();                 // discard bad input
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();                     // clear newline

            switch (choice) {
                case 1 -> displayProducts(inventory, cart, scanner);
                case 2 -> displayCart(cart, scanner);
                case 3 -> System.out.println("Thank you for shopping with us!");
                default -> System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }

    public static void loadInventory(String fileName, ArrayList<Product> inventory) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            // Skip header row
            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                String sku = parts[0];
                String productName = parts[1];
                double price = Double.parseDouble(parts[2]);
                String department = parts[3];

                Product product = new Product(
                        sku,
                        productName,
                        price,
                        department
                );

                inventory.add(product);
            }

        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }

    public static void displayProducts(ArrayList<Product> inventory,
                                       ArrayList<Product> cart,
                                       Scanner scanner) {

        System.out.println("\nAvailable Products");
        System.out.println("------------------------------------");

        for (int i = 0; i < inventory.size(); i++) {
            Product product = inventory.get(i);

            System.out.printf("%d. %s | %s | $%.2f | %s%n",
                    i + 1,
                    product.getSku(),
                    product.getProductName(),
                    product.getPrice(),
                    product.getDepartment());
        }

        System.out.println("\nEnter product number to add to cart");
        System.out.println("Type X to return to home screen");
        System.out.print("Choice: ");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("X")) {
            return;
        }

        try {

            int productNumber = Integer.parseInt(input);

            if (productNumber < 1 || productNumber > inventory.size()) {
                System.out.println("Invalid product selection.");
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number or X.");
            return;
        }

        try {

            int productNumber = Integer.parseInt(input);

            if (productNumber < 1 || productNumber > inventory.size()) {
                System.out.println("Invalid product selection.");
                return;
            }

            Product selectedProduct = inventory.get(productNumber - 1);

            cart.add(selectedProduct);

            System.out.println(
                    selectedProduct.getProductName()
                            + " added to cart."
            );

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number or X.");
        }
    }

    public static void displayCart(ArrayList<Product> cart, Scanner scanner) {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        System.out.println("\nShopping Cart");
        System.out.println("------------------------------------");

        double total = 0;

        for (Product product : cart) {

            System.out.printf("%s | %s | $%.2f%n",
                    product.getSku(),
                    product.getProductName(),
                    product.getPrice());
        }

        total += product.getPrice();
    }

    System.out.println("------------------------------------");
System.out.printf("Total: $%.2f%n", total);

System.out.println("\n1. Checkout");
System.out.println("2. Return to Home Screen");
System.out.print("Choice: ");

    int choice = scanner.nextInt();
scanner.nextLine();

    switch (choice) {
        case 1:
            checkOut(cart, total, scanner);
            break;

        case 2:
            return;

        default:
            System.out.println("Invalid choice.");
    }

    public static void checkOut(ArrayList<Product> cart,
                                double totalAmount,
                                Scanner scanner) {

        System.out.print("Would you like to complete your purchase? (Y/N): ");
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("Y")) {
            System.out.println("Checkout cancelled.");
            return;
        }

        double payment = 0;

        while (payment < totalAmount) {

            System.out.printf("Total Due: $%.2f%n", totalAmount);
            System.out.print("Enter payment amount: ");

            payment = scanner.nextDouble();
            scanner.nextLine();

            if (payment < totalAmount) {
                System.out.println("Insufficient payment.");
            }
        }

    public static Product findProductById(String id, ArrayList<Product> inventory) {
        // TODO: loop over the list and compare ids
        return null;
    }
}
