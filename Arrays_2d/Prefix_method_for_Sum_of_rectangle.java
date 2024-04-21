package Arrays_2d;
import java.util.Scanner;




public class Prefix_method_for_Sum_of_rectangle {

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
        printMatrix(arr);
    }

    static int findSum(int arr[][],int l1,int r1,int l2,int r2){
        int sum = 0;
        findPrefixSum(arr);

        for (int i = l1; i <=l2 ; i++) {
            if(r1>=1){
                sum += arr[i][r2] - arr[i][r1-1];
            }
            else {
                sum += arr[i][r2];
            }
        }

        return sum;
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
