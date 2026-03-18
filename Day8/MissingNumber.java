package com.mycompany.day8;

import java.util.Scanner;

public class MissingNumber {

    void Find() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.print("Enter array (n-1 elements): ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < n - 1; i++) {
            arrSum += arr[i];
        }

        int missing = totalSum - arrSum;

        System.out.println("Missing number is: " + missing);
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        obj.Find();
    }
}
