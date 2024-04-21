package Arrays_2d;

import java.util.Scanner;

public class Spiral_Matrix {

    static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralMatrix(int arr[][], int r , int c){

        int topRow = 0 , bottomRow = r-1 , leftcol = 0, rightcol = c-1;
        int totalelement  = 0 ;

        while (totalelement < r * c){
            //print top row  --> leftcol - rightcol
            for (int i = leftcol; i <= rightcol && totalelement < r * c; i++) {
                System.out.print(arr[topRow][i] + " ");
                totalelement++;
            }
            topRow++;

            //print right col  ---> topRow - bottomRow
            for (int i = topRow; i <= bottomRow && totalelement < r * c; i++) {
                System.out.print(arr[i][rightcol] + " ");
                totalelement++;
            }
            rightcol--;

            //print bottom row ---> rightcol - leftcol
            for (int i = rightcol; i >= leftcol && totalelement < r * c; i--) {
                System.out.print(arr[bottomRow][i] + " ");
                totalelement++;
            }
            bottomRow--;

            //print left col  ---> bottomRow - topRow
            for (int i = bottomRow; i >= topRow && totalelement < r * c; i--) {
                System.out.print(arr[i][leftcol] + " ");
                totalelement++;
            }
            leftcol++;
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

        printSpiralMatrix(a,r,c);
    }
}
