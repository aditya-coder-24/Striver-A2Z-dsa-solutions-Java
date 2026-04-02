package com.mycompany.day18;

public class IntersectionPointLL {

    Node headA;
    Node headB;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node getIntersection() {

        Node a = headA;
        Node b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        IntersectionPointLL list = new IntersectionPointLL();

        Node common1 = list.new Node(30);
        Node common2 = list.new Node(40);
        Node common3 = list.new Node(50);

        list.headA = list.new Node(10);
        list.headA.next = list.new Node(20);
        list.headA.next.next = common1;

        list.headB = list.new Node(15);
        list.headB.next = common1;

        common1.next = common2;
        common2.next = common3;

        Node intersection = list.getIntersection();

        if (intersection != null) {
            System.out.println(intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
