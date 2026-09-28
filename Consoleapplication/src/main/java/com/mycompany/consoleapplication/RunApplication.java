package com.mycompany.consoleapplication;

import java.util.Scanner;


public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menu pick the console device type
        System.out.println("Select a console device type:");
        System.out.println("1. PlayStation");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter your choice (1-3): ");
        int choice = Integer.parseInt(input.nextLine().trim());

        // Turn the menu choice into the console type name
        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PlayStation";
                break;
            case 2:
                consoleType = "Xbox";
                break;
            case 3:
                consoleType = "Nintendo Switch";
                break;
            default:
                consoleType = "Unknown";
                System.out.println("Invalid choice, console type set to Unknown.");
        }

        // Take the store name
        System.out.print("Enter the store name: ");
        String store = input.nextLine();

        // Capture the total amount of sales
        System.out.print("Enter the total amount of sales: ");
        int totalSales = Integer.parseInt(input.nextLine().trim());

        // Instantiate ConsoleSales and print the report
        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();

        input.close();
    }
}