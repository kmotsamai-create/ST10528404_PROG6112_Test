
package com.mycompany.consoleapplication;

    public abstract class Consoles implements IConsoles {

    // Variables to store the sales details
    private final String consoleType;
    private final String store;
    private final int totalSales;

    // Constructor that accepts the console type, store name and total sales
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Get method for the console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Get method for the store name
    @Override
    public String getStore() {
        return store;
    }

    // Get method for the total amount of sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

