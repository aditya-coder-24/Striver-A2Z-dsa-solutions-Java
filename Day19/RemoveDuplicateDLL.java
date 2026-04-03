package com.mycompany.day19;

public class RemoveDuplicateDLL {

    static Node removeDuplicates(Node head) {

        if (head == null) {
            return head;
        }

        Node curr = head;

        while (curr != null && curr.next != null) {

            if (curr.data == curr.next.data) {

                Node temp = curr.next;
                curr.next = temp.next;

                if (temp.next != null) {
                    temp.next.prev = curr;
                }
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.prev = head;

        head.next.next = new Node(2);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(3);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head = removeDuplicates(head);

        display(head);
    }
}
