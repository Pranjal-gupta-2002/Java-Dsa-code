package Recursion;

public class Recursion_prob_sum_with_alter_signs {

    static int sum (int n){
        if(n==1){
            return 1;
        }

        if(n % 2 == 0){
            return sum(n-1) - n;
        }
        else {
            return sum(n-1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
