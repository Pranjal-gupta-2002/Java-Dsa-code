package Linkedlist;
public class intersection_of_list {
    public static void display1(Linkedlist_question1.Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display1(head.next);
    }
    public static Node intersectionOfList(Node headA,Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        int lengthB = 0;

        while(tempA!=null){
            lengthA++;
            tempA = tempA.next;
        }
        while(tempB!=null){
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;

        if(lengthA>lengthB){
            int steps = lengthA-lengthB;
            for(int i = 1;i<=steps;i++){
                tempA = tempA.next;
            }
        }
        else{
            int steps = lengthB-lengthA;
            for(int i = 1;i<=steps;i++){
                tempB = tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
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
        Node b = new Node(250);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);


        //5  10  15  20  25
        a.next = b; // 5 --> 10  15  20   25
        b.next = c; // 5 --> 10 --> 15  20  25
        c.next = d; // 5 --> 10 --> 15 --> 20  25
        d.next = e; // 5 --> 10 --> 15 --> 20 --> 25


        Node f = new Node(500);  // head Node
        Node g = new Node(100);
        Node h = new Node(150);
        Node i = new Node(250);
        Node j = new Node(200);
        Node k = new Node(350);
        Node l = new Node(450);


        //5  10  15  20  25
        f.next = g; // 5 --> 10  15  20   25
        g.next = h; // 5 --> 10 --> 15  20  25
        h.next = i; // 5 --> 10 --> 15 --> 20  25
        i.next = j; // 5 --> 10 --> 15 --> 20 --> 25
        j.next = k; // 5 --> 10 --> 15 --> 20 --> 25
        k.next = l; // 5 --> 10 --> 15 --> 20 --> 25


        Node ans = intersectionOfList(a,f);
        System.out.println(ans.data);
}
}
