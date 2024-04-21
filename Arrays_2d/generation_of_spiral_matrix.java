package Arrays_2d;

import java.util.Scanner;

public class generation_of_spiral_matrix {

    static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n ){
        int [][] arr = new int[n][n];
        int topRow = 0 , bottomRow = n-1 , leftcol = 0, rightcol = n-1;
        int currelement  = 1 ;

        while (currelement <= n * n){
            //print top row  --> leftcol - rightcol
            for (int i = leftcol; i <= rightcol && currelement <= n * n; i++) {
                arr[topRow][i] = currelement;
                currelement++;
            }
            topRow++;

            //print right col  ---> topRow - bottomRow
            for (int i = topRow; i <= bottomRow && currelement <= n * n; i++) {
                arr[i][rightcol]  = currelement;
                currelement++;
            }
            rightcol--;

            //print bottom row ---> rightcol - leftcol
            for (int i = rightcol; i >= leftcol && currelement <= n * n; i--) {
                arr[bottomRow][i] = currelement ;
                currelement++;
            }
            bottomRow--;

            //print left col  ---> bottomRow - topRow
            for (int i = bottomRow; i >= topRow && currelement <= n * n; i--) {
                arr[i][leftcol] = currelement;
                currelement++;
            }
            leftcol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for a square matrix");
        int n = sc.nextInt();

        int ans [][]= generateSpiralMatrix(n);
        printMatrix(ans);
    }
}
