import java.util.Scanner;

public class Arrays4 {

// frq array prob


    static int[] makFrqArr(int arr[]){
        int frq [] = new  int[100005];

        for (int i = 0; i < arr.length; i++) {
            frq[arr[i]]++;
        }
        return frq;
    }

    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6,7,8,9};
        int frq[] = makFrqArr(num);

        System.out.println("No. of qury :- ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-->0){
            System.out.println("Num you want to find :- ");
            int x = sc.nextInt();

            if(frq[x]>0){
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }

        }
    }
}
