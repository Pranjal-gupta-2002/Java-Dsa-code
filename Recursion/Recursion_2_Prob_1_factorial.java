package Recursion;
public class Recursion_2_Prob_1_factorial {

    static int fact(int n){
        if(n==0||n==1){
            return n;
        }

        int ans = fact(n-1) * n ;

        return ans;
    }

    public static void main(String[] args) {
        // Factorial of a given number

        System.out.println(fact(5));
    }
}
