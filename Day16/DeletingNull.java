package com.mycompany.day16;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletingNull {

    Node head;

    void insertAtBeginning(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    void deleteTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
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

        DeletingNull list = new DeletingNull();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        System.out.println("Original List:");
        list.display();

        list.deleteTail();

        System.out.println("After Deleting Tail:");
        list.display();
    }
}
