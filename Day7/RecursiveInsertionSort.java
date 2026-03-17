package com.mycompany.day7;

public class RecursiveInsertionSort {

    static void Sort(int arr[], int n) {
        if (n <= 1) {
            return;
        }
        Sort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, 1, 5};

        Sort(arr, arr.length);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
