package Recursion;

public class check_palindrome_of_a_String_two_pointer {

    static boolean palindrome(String str , int l, int r){
        if(l>=r){
            return true;
        }


        return str.charAt(l)==str.charAt(r) && palindrome(str,l+1,r-1);
    }

    public static void main(String[] args) {
        String str = "aba";

        System.out.println(palindrome(str,0,str.length()-1));
    }
}
