package Arrays_2d;

import java.util.Scanner;

public class Arrays3 {

    static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] findTranspose(int arr[][],int r , int c){  // brute-force approach
        int ans[][] = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        return ans;
    }

    static void transposeInPlace(int arr[][],int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
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
        System.out.println("Matrix");
        printMatrix(a);

        System.out.println("Transpose of the matrix");
        transposeInPlace(a,r,c);
        printMatrix(a);
//        int ans[][] = findTranspose(a,r,c);
//        printMatrix(ans);
    }
}
