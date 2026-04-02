package com.mycompany.day18;

public class SortLL {

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

    Node merge(Node left, Node right) {

        Node dummy = new Node(0);
        Node temp = dummy;

        while (left != null && right != null) {

            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        if (left != null) {
            temp.next = left;
        }

        if (right != null) {
            temp.next = right;
        }

        return dummy.next;
    }

    Node getMiddle(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node right = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        right = mergeSort(right);

        return merge(left, right);
    }

    void sort() {
        head = mergeSort(head);
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SortLL list = new SortLL();

        list.insertAtEnd(4);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        list.insertAtEnd(3);
        list.insertAtEnd(5);

        list.sort();

        list.display();
    }
}
