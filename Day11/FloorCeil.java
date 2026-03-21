package com.mycompany.day11;

import java.util.Scanner;

public class FloorCeil {

    void FindFloorCeil() {
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

        int floor = -1;
        int ceil = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < x) {
                floor = arr[i];
            }

            if (arr[i] > x) {
                ceil = arr[i];
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {
        FloorCeil a = new FloorCeil();
        a.FindFloorCeil();
    }
}
