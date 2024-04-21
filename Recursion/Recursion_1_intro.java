package Recursion;

import java.util.Scanner;

public class Recursion_1_intro {

    static void pi(int n ){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        pi(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        //Recursion ---> function calls itself is called recursion

        // print all natural number from 1 to n
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pi(n);

    }
}
