package Stacks;

public class LinkedList_implementation_of_stacks {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LLStack{
        Node head = null;
        private int size = 0;

        void push(int item){
            Node temp = new Node(item);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayReverse(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        void displayRec(Node h){
            if(h==null) return;
            Node temp = h;
            displayRec(h.next);
            System.out.print(h.data + " ");
        }
        void display(){
            displayRec(head);
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println();
        System.out.println(st.size());
        st.pop();
        st.displayReverse();
        System.out.println();
        st.display();
    }
}
