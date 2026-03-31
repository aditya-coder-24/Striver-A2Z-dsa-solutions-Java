package com.mycompany.day16;

public class HeadInsertion {

    Node head;

    void insertAtBeginning(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
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

        HeadInsertion list = new HeadInsertion();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.display();
    }
}