package com.mycompany.day5;

import java.util.Scanner;

public class PrintReverseArray {

    void Print() {

        System.out.println("Enter length of Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Reverse of the Array is: ");
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        PrintReverseArray a = new PrintReverseArray();
        a.Print();
    }
}
