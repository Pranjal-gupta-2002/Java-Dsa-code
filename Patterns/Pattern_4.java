package Patterns;

import java.util.Scanner;

public class Pattern_4 {

    public static void print1(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
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