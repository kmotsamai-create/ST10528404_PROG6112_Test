package com.mycompany.consoleapplication;


public class ConsoleSales extends Consoles {

    // Constructor passes the values up to the Consoles (parent) constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Shows the console type, store name and total amount of sales
    public void printReport() {
        String stars = "*".repeat(40);

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println(stars);
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println(stars);
    }
}