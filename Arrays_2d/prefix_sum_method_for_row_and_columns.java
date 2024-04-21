package Arrays_2d;

import java.util.Scanner;

public class prefix_sum_method_for_row_and_columns {

    static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findPrefixSum(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr[i].length ; j++) {
                arr[i][j]+= arr[i][j-1];
            }
        }

        for (int j = 0; j <arr[0].length ; j++) {
            for (int i = 1; i < arr.length; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }
        printMatrix(arr);
    }

    static int findSum(int arr[][],int l1,int r1,int l2,int r2){
        int sum = 0 , left = 0,up = 0,leftUp = 0,ans=0;
        findPrefixSum(arr);

     sum = arr[l2][r2];
     if(r1>=1){
         left = arr[l2][r1-1];
     }
     if(l1>=1){
         up = arr [l1-1][r2];
     }
     if(l1>=1 && r1>=1){
         leftUp = arr[l1-1][r1-1];
     }
     ans = sum-left-up+leftUp;
     return ans;
    }

    public static void main(String[] args) {
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

        System.out.println(findSum(a,l1,r1,l2,r2));
    }
}
