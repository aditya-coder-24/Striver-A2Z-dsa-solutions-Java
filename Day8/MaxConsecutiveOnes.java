package com.mycompany.day8;

import java.util.Scanner;

public class MaxConsecutiveOnes {

    void Find() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter binary array (0s and 1s): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println("Maximum consecutive ones: " + max);
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        obj.Find();
    }
}
