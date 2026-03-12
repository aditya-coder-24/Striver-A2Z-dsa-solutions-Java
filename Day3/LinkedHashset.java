package com.mycompany.day3;

import java.util.LinkedHashSet;

public class LinkedHashset {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        System.out.println("==========================================");

        set.addLast("D");
        System.out.println(set);

        System.out.println("==========================================");

        System.out.println(set.contains("A"));

        System.out.println("==========================================");

        System.out.println(set.getFirst());
        System.out.println(set.getLast());

        System.out.println("==========================================");

        set.clear();
        System.out.println(set);

        System.out.println("==========================================");

    }
}
