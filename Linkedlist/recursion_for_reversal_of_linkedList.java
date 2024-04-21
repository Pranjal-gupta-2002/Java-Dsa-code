package Linkedlist;

public class recursion_for_reversal_of_linkedList {

    public static Node reverseLinkedList(Node head){
        if(head.next==null){
            return head;
        }
        Node nextHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return nextHead;
    }
    public static void display(Node head) {
        if(head==null) return;

        System.out.print(head.data + " ");
        display(head.next);
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);  // head Node
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);


        //5  10  15  20  25
        a.next = b; // 5 --> 10  15  20   25
        b.next = c; // 5 --> 10 --> 15  20  25
        c.next = d; // 5 --> 10 --> 15 --> 20  25
        d.next = e; // 5 --> 10 --> 15 --> 20 --> 25
//        display(a);

        Node newHead = reverseLinkedList(a);
        display(newHead);
    }
}
