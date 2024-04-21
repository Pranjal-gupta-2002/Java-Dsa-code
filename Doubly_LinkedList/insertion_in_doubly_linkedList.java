package Doubly_LinkedList;

public class insertion_in_doubly_linkedList {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }
    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head =  t;
        return head;
    }
    public static void insertAtTail(Node head,int x){

        Node temp = head ;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;

    }
    public static void insertAtAnyIndex(Node head,int index,int x){
        Node s = head;

        for (int i = 0; i < index - 1; i++) {
            s = s.next;
        }

        Node r = s.next;

        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
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
        Node newHead = insertAtHead(a,30);
        display(newHead);
        System.out.println();
        insertAtTail(a,100);
        display(a);
        System.out.println();
        insertAtAnyIndex(a,2,200);
        display(a);
    }
}
