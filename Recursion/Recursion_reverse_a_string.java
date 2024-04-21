package Recursion;

public class Recursion_reverse_a_string {

    static String reverseStr(String str, int index){
        if(index==str.length()){
            return "";
        }

        String ans = reverseStr(str,index+1) + str.charAt(index);

        return ans;
    }

    public static void main(String[] args) {
        String str = "abcdef";

        System.out.println(reverseStr(str,0));
    }
}
