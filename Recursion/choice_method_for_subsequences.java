package Recursion;

public class choice_method_for_subsequences {

    static void sSQ(String str , String currAns){

        if(str.length()==0){
            System.out.print(currAns + " ");
            return;
        }

        char curr  = str.charAt(0);

        String remString  = str.substring(1);

        sSQ(remString,currAns+curr);
        sSQ(remString,currAns);


    }

    public static void main(String[] args) {
        String str ="abc";

        sSQ(str,"");
    }
}
