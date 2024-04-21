package Recursion;

public class check_palindrome_of_a_String {

    static String reverseStr(String str, int index){
        if(index==str.length()){
            return "";
        }

        String ans = reverseStr(str,index+1) + str.charAt(index);

        return ans;
    }

    public static void main(String[] args) {
        String str = "aba";

        String reverseStr = reverseStr(str,0);

        if(str.equals(reverseStr)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
