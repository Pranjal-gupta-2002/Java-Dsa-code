package Recursion;

public class Frog_Stone_prob {

    static int best(int[]h,int index,int n){

        if(index==n-1){
            return 0;
        }
        int op1 =Math.abs(h[index]-h[index+1])  +best(h,index+1,n);
        if(index==n-2){
            return op1;
        }

        int op2 =Math.abs(h[index]-h[index+2])  +best(h,index+2,n);

        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        int h [] = {10,30,40,20};

        System.out.println( best(h,0,h.length));
    }
}
