package com.mycompany.day10;

import java.util.Scanner;

public class MergeArrays {

    void Merge() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array A: ");
        int n = sc.nextInt();
        int[] arrA = new int[n];
        System.out.print("Enter array A: ");
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        System.out.print("Enter length pf array B: ");
        int m = sc.nextInt();
        int[] arrB = new int[n];
        System.out.print("Enter array B: ");
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        int[] arrC = new int[n + m];

        int a = 0, b = 0, c = 0;

        while (a < n && b < m) {
            if (arrA[a] < arrB[b]) {
                arrC[c] = arrA[a];
                a++;
            } else {
                arrC[c] = arrB[b];
                b++;
            }
            c++;
        }
        while (a < n) {
            arrC[c] = arrA[a];
            a++;
            b++;
        }

        while (b < m) {
            arrC[c] = arrB[b];
            b++;
            c++;
        }
        System.out.print("Merged array: ");
        for (int x = 0; x < arrC.length; x++) {
            System.out.print(arrC[x] + " ");
        }
    }

    public static void main(String[] args) {
        MergeArrays a = new MergeArrays();
        a.Merge();
    }
}
