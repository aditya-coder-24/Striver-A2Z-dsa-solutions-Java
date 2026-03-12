package com.mycompany.day3;

import java.util.*;

class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println("==========================================");

        list.add(0, 00);
        System.out.println(list);

        System.out.println("==========================================");

        System.out.println(list.contains(10));

        System.out.println("==========================================");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("==========================================");

        list.clear();
        System.out.println(list);

        System.out.println("==========================================");

    }
}
