package com.mycompany.day3;

import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {
        Vector<Integer> vect = new Vector<>();

        vect.add(1);
        vect.add(2);
        vect.add(3);
        System.out.println(vect);

        System.out.println("==========================================");

        System.out.println(vect.contains(1));

        System.out.println("==========================================");

        System.out.println(vect.getFirst());
        System.out.println(vect.getLast());

        System.out.println("==========================================");

        vect.clear();
        System.out.println(vect);

        System.out.println("==========================================");
    }
}
