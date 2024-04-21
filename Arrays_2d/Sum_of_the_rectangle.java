package Arrays_2d;

import java.util.Scanner;

public class Sum_of_the_rectangle {

    static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findSum(int arr[][],int l1,int r1,int l2,int r2){
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2 ; j++) {
                sum = sum + arr[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // brute-force approach
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter matrix values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum " + findSum(a,l1,r1,l2,r2));
    }
}
