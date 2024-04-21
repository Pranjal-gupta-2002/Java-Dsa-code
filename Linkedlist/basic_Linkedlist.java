package Linkedlist;

public class basic_Linkedlist {
//    public static void display(Node head){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data + " --> ");
//            temp = temp.next;
//        }
//    }
    public static int length(Node head){

        int count = 0;
        while(head != null){
            count++;
            head =  head.next;
        }
        return count;
    }
    public static void display1(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display1(head.next);
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
        System.out.println("Length :- " + length(a));
        display1(a);

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);


//        System.out.println(a);
//        System.out.println(a.next);
//        System.out.println(b);
//        System.out.println(c);
    }
}
