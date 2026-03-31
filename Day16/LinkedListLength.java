package com.mycompany.day16;

public class LinkedListLength {

    Node head;

    void insertAtBeginning(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    int getLength() {

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedListLength list = new LinkedListLength();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.display();

        System.out.println("Length of Linked List: " + list.getLength());
    }
}
