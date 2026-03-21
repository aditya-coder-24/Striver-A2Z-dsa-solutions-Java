package com.mycompany.day11;

import java.util.Scanner;

public class FirstLastOccurance {

    void Occurance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int x = sc.nextInt();

        int upper = -1;
        int lower = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < x) {
                upper = i;
            }

            if (arr[i] > x) {
                lower = i;
                break;
            }
        }

        System.out.println("Floor: " + upper);
        System.out.println("Ceil: " + lower);
    }

    public static void main(String[] args) {
        FirstLastOccurance a = new FirstLastOccurance();
        a.Occurance();
    }
}
