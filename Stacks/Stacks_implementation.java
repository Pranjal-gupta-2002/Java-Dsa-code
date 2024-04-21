package Stacks;


import java.util.*;

public class Stacks_implementation {
    public static void main(String[] args) {
/*
        int arr[] = new int [5];
        ArrayList<Integer> arrayList  = new ArrayList<>();
*/

        Stack<Integer> st = new Stack<>();
        st.push(11);   // push to add items in the stack
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);

        //peek
//        System.out.println(st.peek()); // to get the peek item in the stack and it follows the LIFO ---> last in first out
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println("size is :- " + st.size());

        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());

    }
}
