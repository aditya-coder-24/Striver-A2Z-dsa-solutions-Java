package com.mycompany.day16;

public class LinkedList {

    int data;
    LinkedList next;

    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        LinkedList a = new LinkedList(arr[0]);

        System.out.println(a);

        System.out.println(a.data);

    }
}
