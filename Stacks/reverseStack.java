package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void insertRecursivelyAtBottom(Stack<Integer> st , int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertRecursivelyAtBottom(st,x);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertRecursivelyAtBottom(st ,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
