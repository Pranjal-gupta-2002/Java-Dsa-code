package Patterns;

import java.util.Scanner;

public class Pattern_1 {
    public static void print1(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(10);
        }
    }
    public static void main(String[] args) {
        //  ****
        //  ****
        //  ****
        //  ****

        System.out.println("Enter the numbers of the rows :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1(n);
    }
}
