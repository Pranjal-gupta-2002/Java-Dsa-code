package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Insert_at_bottom_or_any_indices {

    public static void insertRecursivelyAtBottom(Stack<Integer> st , int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertRecursivelyAtBottom(st,x);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int index = 2;
        int x = 7;
        insertRecursivelyAtBottom(st,x);
        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while(st.size()>index){
            gt.push(st.pop());
        }

        st.push(x);

        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
