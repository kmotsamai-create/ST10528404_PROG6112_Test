

package com.mycompany.gamingconsole;


public class Gamingconsole {

    public static void main(String[] args) {
       
        // Right now I'm doing the 1D array
        String[] consoles = {"Ps5","XBOX","SWITCH"};
        String[] cities ={"Cape Town","Port Elizabeth","Pretoria"};
        // Right now I'm doing the 2D array
        int [][] sales ={
            {1000,2000,3000},
                {2000,3000,4000},
                {1500,1100,1200}
       };  

        // 1D array to hold the total sales for Cape Town  city
        int[] cityTotals = new int[cities.length];

        // Accumulate each city's total by adding up its row
        for (int row = 0; row < sales.length; row++) {
            int total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }
            cityTotals[row] = total;
        }

        // Find the city with the most sales f
        int topIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[topIndex]) {
                topIndex = i;
            }
        }

       

        // This is the gaming console
        System.out.println("-----------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");

        // Console column headings
        System.out.printf("%-25s", "");
        for (String console : consoles) {
            System.out.printf("%-15s", console);
        }
        System.out.println();

        // Each city with its sales for every console
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%-25s", cities[row]);
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%-15d", sales[row][col]);
            }
            System.out.println();
        }

        // Totals console sales for each city
        System.out.println("----------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-25s%d%n", cities[i], cityTotals[i]);
        }

        // City with the most sales
        System.out.println("-------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[topIndex]);
        System.out.println("---------------------------------------------");
    }
}

        
        
        
        
    
