package Recursion;

public class Recursion_prob_Sum_of_digit_in_a_number {

    static int sod(int n ){
        if(n>=0 && n<=9){
            return n;
        }

        return sod(n/10) + (n%10);
    }

    public static void main(String[] args) {
        System.out.println(sod(12349));
    }
}
