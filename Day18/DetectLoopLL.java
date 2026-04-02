package com.mycompany.day18;

public class DetectLoopLL {

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

    void detectCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle Detected");
                return;
            }
        }

        System.out.println("No Cycle");
    }

    void display() {

        Node temp = head;
        int count = 0;

        while (temp != null && count < 10) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
    }

    public static void main(String[] args) {

        DetectLoopLL list = new DetectLoopLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.createCycle();

        list.detectCycle();
    }

}
