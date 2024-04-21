package Stacks;

public class Array_implementation_of_stacks {
    public static class Stack{
        private int arr[] = new int[5];
        private int index = 0;
        void push(int item){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[index] = item;
            index++;
        }
        int peek(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index - 1];
        }
        int pop(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top;
        }
        void display(){
            for (int i = 0; i <= index-1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }
        boolean isEmpty(){
            if(index==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(index==arr.length){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}
