package com.mycompany.day19;

import java.util.*;

class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DeleteKeyDLL {

    static Node deleteAll(Node head, int key) {

        Node curr = head;

        while (curr != null) {

            if (curr.data == key) {

                if (curr.prev == null) {
                    head = curr.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    curr.prev.next = curr.next;

                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    }
                }
            }

            curr = curr.next;
        }

        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.prev = head;

        head.next.next = new Node(2);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(2);
        head.next.next.next.next.prev = head.next.next.next;

        int key = 2;

        head = deleteAll(head, key);

        display(head);
    }
}
