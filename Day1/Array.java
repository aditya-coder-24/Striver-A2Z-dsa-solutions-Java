package com.mycompany.Day1;

public class Array {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("=========================================");

        int array[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}

        };

        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[0][2]);
        System.out.println(array[1][0]);
        System.out.println(array[1][1]);
        System.out.println(array[1][2]);
        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
        System.out.println(array[2][2]);

        System.out.println("=========================================");

        System.out.println(arr.length);

        System.out.println("=========================================");

        System.out.println(arr.toString());

        System.out.println("=========================================");

        System.out.println(arr);
    }
}
