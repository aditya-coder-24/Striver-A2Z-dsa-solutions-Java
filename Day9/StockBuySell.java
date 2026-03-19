package com.mycompany.day9;

import java.util.Scanner;

public class StockBuySell {

    void FindMaxProfit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] price = new int[n];

        System.out.print("Enter prices: ");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int minPrice = price[0];
        int maxProfit = 0;

        int buyDay = 0, sellDay = 0;

        for (int i = 1; i < n; i++) {

            // update minimum price
            if (price[i] < minPrice) {
                minPrice = price[i];
                buyDay = i;
            }

            // calculate profit
            int profit = price[i] - minPrice;

            // update max profit
            if (profit > maxProfit) {
                maxProfit = profit;
                sellDay = i;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
        System.out.println("Buy on day: " + buyDay);
        System.out.println("Sell on day: " + sellDay);
    }

    public static void main(String[] args) {
        StockBuySell a = new StockBuySell();
        a.FindMaxProfit();
    }
}