package Recursion;

public class Recursion_prob_2_fibonacci {

    static int fibo(int n ){
        if(n==0||n==1){
            return n;
        }

//        int prev = fibo(n-1);
//        int prevPrev = fibo(n-2);
//
//        return prev + prevPrev;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i)+ " ");
        }

    }
}
