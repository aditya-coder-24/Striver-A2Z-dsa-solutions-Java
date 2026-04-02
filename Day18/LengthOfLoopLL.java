package com.mycompany.day18;

public class LengthOfLoopLL {

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

    void createCycle() {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head.next;
    }

    void loopLength() {

        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            System.out.println(0);
            return;
        }

        int count = 1;
        fast = fast.next;

        while (slow != fast) {
            fast = fast.next;
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        LengthOfLoopLL list = new LengthOfLoopLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.createCycle();

        list.loopLength();
    }

}
