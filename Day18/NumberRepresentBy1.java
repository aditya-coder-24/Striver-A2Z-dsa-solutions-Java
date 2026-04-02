package com.mycompany.day18;

public class NumberRepresentBy1 {

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

    void addOne() {

        head = reverse(head);

        Node temp = head;
        int carry = 1;

        while (temp != null) {

            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }

            if (temp.next == null) {
                temp.next = new Node(carry);
                carry = 0;
                break;
            }

            temp = temp.next;
        }

        head = reverse(head);
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        NumberRepresentBy1 list = new NumberRepresentBy1();

        list.insertAtEnd(1);
        list.insertAtEnd(9);
        list.insertAtEnd(9);

        list.addOne();

        list.display();
    }

}
