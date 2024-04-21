package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Display_stack {

    public static void display_recursively(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        display_recursively(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void addAtBottom(Stack<Integer> st ,int value){
        if(st.size()==0){
            st.push(value);
            return;
        }
        int top = st.pop();
        addAtBottom(st,value);
        st.push(top);
    }
    public static void removeAtBottom(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtBottom(st);
        st.push(top);
    }
    public static void reverseStack(Stack <Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        addAtBottom(st,top);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        display_recursively(st);
        System.out.println();
        addAtBottom(st,100);
        display_recursively(st);
        System.out.println();
        removeAtBottom(st);
        display_recursively(st);
        System.out.println();
        reverseStack(st);
        display_recursively(st);
//        System.out.println(st);

//        Stack<Integer> gt = new Stack<>();
//        while(st.size()>0) {
//            gt.push(st.pop());
//        }
//
//        while(gt.size()>0){
//            int x = gt.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }

//        int n = st.size();
//        int arr[] = new int[n];
//
//        for (int i = n-1; i >=0 ; i--) {
//            int x = st.pop();
//            arr[i] = x;
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//            st.push(arr[i]);
//        }
    }
}
