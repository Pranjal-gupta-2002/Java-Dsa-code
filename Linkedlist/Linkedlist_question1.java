package Linkedlist;

public class Linkedlist_question1 {

    public static Node nthNode(Node head,int n){
        int size =0;
        Node temp =  head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        int a = size-n+1;

        temp = head;
        for (int i = 1; i <= a-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head,int n){
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <=n ; i++) {
            fast = fast.next;
        }

        while(fast !=null){
            slow= slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void display1(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display1(head.next);
    }
    public static void deletenthNode2(Node head,int n){
        Node ans = nthNode2(head,n);

        ans.data = ans.next.data;
        ans.next = ans.next.next;
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

            Node temp =  nthNode(a,3);
            Node temp1 =  nthNode2(a,3);

            deletenthNode2(a,2);
            display1(a);
//            System.out.println(temp.data);
//            System.out.println(temp1.data);

        }
    }


