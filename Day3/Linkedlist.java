package com.mycompany.day3;

import java.util.*;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);

        System.out.println("==========================================");

        list.addFirst("Html");
        System.out.println(list);

        System.out.println("==========================================");

        System.out.println(list.contains("Java"));

        System.out.println("==========================================");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("==========================================");

        list.clear();
        System.out.println(list);

        System.out.println("==========================================");
    }
}
