package com.mycompany.day8;

import java.util.Scanner;

public class UnionTwoArrays {

    void Union() {

        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter length of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Enter first sorted array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter length of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.print("Enter second sorted array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Union of arrays: ");

        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                if (arr1[i] != last) {
                    System.out.print(arr1[i] + " ");
                    last = arr1[i];
                }
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                if (arr2[j] != last) {
                    System.out.print(arr2[j] + " ");
                    last = arr2[j];
                }
                j++;
            } 
            else { // equal elements
                if (arr1[i] != last) {
                    System.out.print(arr1[i] + " ");
                    last = arr1[i];
                }
                i++;
                j++;
            }
        }

        // remaining elements of arr1
        while (i < n1) {
            if (arr1[i] != last) {
                System.out.print(arr1[i] + " ");
                last = arr1[i];
            }
            i++;
        }

        // remaining elements of arr2
        while (j < n2) {
            if (arr2[j] != last) {
                System.out.print(arr2[j] + " ");
                last = arr2[j];
            }
            j++;
        }
    }

    public static void main(String[] args) {
        UnionTwoArrays obj = new UnionTwoArrays();
        obj.Union();
    }
}