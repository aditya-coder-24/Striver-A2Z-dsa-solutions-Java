package com.mycompany.day6;

import java.util.HashMap;
import java.util.Scanner;

public class HeighestOccuringElement {

    void Print() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int maxFreq = 0;
        int element = -1;

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                element = key;
            }
        }
        System.out.println("Element with highest frequency: " + element);
        System.out.println("Frequency: " + maxFreq);
    }

    public static void main(String[] args) {
        HeighestOccuringElement a = new HeighestOccuringElement();
        a.Print();
    }
}
