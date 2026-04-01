package com.mycompany.day17;

class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteAtEnd {

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
        newNode.prev = temp;
    }

    void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DeleteAtEnd dll = new DeleteAtEnd();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println("Before Deletion:");
        dll.display();

        dll.deleteLast();

        System.out.println("\nAfter Deletion:");
        dll.display();
    }
}
