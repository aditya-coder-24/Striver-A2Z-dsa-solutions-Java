package com.mycompany.day19;

public class PairSumDLL {

    static void findPairs(Node head, int target) {

        if (head == null)
            return;

        Node first = head;
        Node second = head;

        while (second.next != null)
            second = second.next;

        boolean found = false;

        while (first != null && second != null && first != second && second.next != first) {

            int sum = first.data + second.data;

            if (sum == target) {
                System.out.println(first.data + " " + second.data);
                found = true;
                first = first.next;
                second = second.prev;
            }
            else if (sum < target) {
                first = first.next;
            }
            else {
                second = second.prev;
            }
        }

        if (!found)
            System.out.println("No pair found");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(6);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        int target = 7;

        findPairs(head, target);
    }
}