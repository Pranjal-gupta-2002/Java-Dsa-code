package Recursion;

public class Recursion_prob_p_power_q {

    // first way to do this
//    static int pow(int p ,int q){
//        if(q==0){
//            return 1;
//        }
//
//        return pow(p,q-1) * p;
//    }

    // second way to do this

    static int pow(int p , int q ){
        if(q==0){
            return 1;
        }

        int smallPow = pow(p,q/2);

        if(q % 2 == 0){
            return smallPow * smallPow;
        }

            return p * smallPow * smallPow;

    }


    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
