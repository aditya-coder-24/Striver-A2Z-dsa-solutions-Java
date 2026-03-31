package com.mycompany.day16;

public class SearchInLinkedList {

    Node head;

    void insertAtBeginning(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
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

        SearchInLinkedList list = new SearchInLinkedList();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.display();

        int value = 20;

        if (list.search(value)) {
            System.out.println(value + " is present in the linked list");
        } else {
            System.out.println(value + " is not present in the linked list");
        }
    }
}
