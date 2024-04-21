package Doubly_LinkedList;

import Linkedlist.recursion_for_reversal_of_linkedList;

public class implementation_of_Doubly_linkedList {

        public static class Node {
            int val;
            Node next;
            Node prev;

            Node(int val){
                this.val = val;
            }
        }


        public static void display(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

        }
        public static void display1(Node tail){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }

        }
        public static void display2(Node random){
            Node temp = random;
            while(temp.prev!=null){
                temp = temp.prev;
            }
            display(temp);

        }



    public static void main(String[] args) {
        Node a = new Node(5);  // head Node
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);


        //5  10  15  20  25

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        System.out.println();
        display2(e);
        System.out.println();
        display1(e);
    }
}
