package com.mycompany.day9;

import java.util.Scanner;

public class RearrangeBySign {

    void Rearrange() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        int posIndex = 0; 
        int negIndex = 1; 

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[posIndex] = arr[i];
                posIndex += 2;
            } else {
                result[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        System.out.print("Rearranged array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        RearrangeBySign a = new RearrangeBySign();
        a.Rearrange();
    }
}