package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class underFlowOverFlow {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st); // if stack is empty --->st.pop() and st.peek()
                                // it will give Empty Stack Exception (Error)
                                // underflow condition


        // overflow --> extend the size of the stack or the stack is full, and we are
        //              trying to push element in the stack ---> overflow (error)
    }
}
