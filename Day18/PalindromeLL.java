package com.mycompany.day18;

public class PalindromeLL {

    Node head;

    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    void checkPalindrome() {

        if (head == null || head.next == null) {
            System.out.println(true);
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);

        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                System.out.println(false);
                return;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println(true);
    }

    public static void main(String[] args) {

        PalindromeLL list = new PalindromeLL();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        list.insertAtEnd(1);

        list.checkPalindrome();
    }

}
