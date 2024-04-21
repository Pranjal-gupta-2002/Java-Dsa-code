package Recursion;

public class Recursion_prob_print_k_multiple_of_num {

    static void fac(int n ,int m){
        if(m==1){
            System.out.println(n);
            return;
        }

        fac(n,m-1);


        System.out.println(n * m );
    }

    public static void main(String[] args) {
        fac(12,5);
    }
}
