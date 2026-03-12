package com.mycompany.day3;

import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        System.out.println(set);

        System.out.println("==========================================");

        System.out.println(set.contains(50));

        System.out.println("==========================================");

        System.out.println(set.getFirst());

        System.out.println("==========================================");

        System.out.println(set.getLast());

        System.out.println("==========================================");

        set.clear();
        System.out.println(set);

        System.out.println("==========================================");
    }

}
