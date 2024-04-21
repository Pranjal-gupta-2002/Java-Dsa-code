package Patterns;

import java.util.Scanner;

public class Pattern_7 {

    public static void print1(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers of the rows :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1(n);

    }
}