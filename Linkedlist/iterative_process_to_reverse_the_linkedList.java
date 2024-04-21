package Linkedlist;

public class iterative_process_to_reverse_the_linkedList {
    public static void display(Node head) {
        if(head==null) return;

        System.out.print(head.data + " ");
        display(head.next);
    }
    public static Node reverseList(Node head){
        Node prev = null;
        Node after = null;
        Node curr = head;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
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

        display(a);
        Node reverseListHead = reverseList(a);
        System.out.println();
        display(reverseListHead);
    }
}
