package com.mycompany.day3;

import java.util.PriorityQueue;

public class ArrayDQ {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        System.out.println(queue);

        System.out.println("==========================================");

        System.out.println(queue.contains(10));

        System.out.println("==========================================");

        System.out.println(queue.removeAll(queue));

        System.out.println("==========================================");
    }
}
