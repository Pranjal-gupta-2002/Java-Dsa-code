package Linkedlist;

public class implementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;

        }
        void insertAtHead(int val){
            Node temp = new Node(val);

            if(head == null){
                insertAtEnd(val);
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void insertAtIndex(int index,int val){
            Node t = new Node(val);

            if(index == length()){
                insertAtEnd(val);
                return;
            }
            else if(index==0){
                insertAtHead(val);
                return;
            }
            else if(index<0 || index > length()){
                System.out.println("wrong index");
            }

            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }

        int get(int index){
            Node temp = head ;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int index){
            Node temp = head;

            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }

        }

        int length(){

            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp =  temp.next;
            }
            return count;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);

        ll.insertAtIndex(0,100);
//        System.out.println(ll.head.data);
        ll.deleteAtIndex(2);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println();
        System.out.println(ll.length());

    }
}
