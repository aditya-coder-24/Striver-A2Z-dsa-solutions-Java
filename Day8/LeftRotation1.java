package com.mycompany.day8;

import java.util.Scanner;

public class LeftRotation1 {

    void Rotate() {
        System.out.print("Enter length of array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Rotated array: ");

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        LeftRotation1 a = new LeftRotation1();
        a.Rotate();
    }
}
