package Doubly_LinkedList;

public class deletion_in_LinkedList {
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
    }
}
