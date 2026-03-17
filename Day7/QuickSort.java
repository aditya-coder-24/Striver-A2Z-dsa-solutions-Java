package com.mycompany.day7;

public class QuickSort {

    static int Part(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void Sort(int arr[], int low, int high) {

        if (low < high) {

            int pi = Part(arr, low, high);

            Sort(arr, low, pi - 1);
            Sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, 1, 5};

        Sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
