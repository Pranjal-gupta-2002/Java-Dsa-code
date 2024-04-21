package Arrays_2d;

import java.util.Scanner;

public class rotateArray {

    static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
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

    static void rotate(int arr[][],int n ){
        //transpose

        transposeInPlace(arr,n,n);
        // reverse the transpose

        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]);
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

        rotate(a,r);
        System.out.println("Rotated Matrix");
        printMatrix(a);
    }
}
