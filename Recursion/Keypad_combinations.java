package Recursion;

public class Keypad_combinations {

    static void combination(String dig,String kp[], String res){  //  253
        if(dig.length()==0){
            System.out.print(res + " ");
            return;
        }
        int currNum  = (dig.charAt(0)) - '0';  //2
        String currchoices = kp[currNum];  // abc
        for (int i = 0; i < currchoices.length(); i++) {
            combination(dig.substring(1),kp,res + currchoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s = "23";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
         //             0   1    2      3      4      5      6       7       8      9
        combination(s,kp,"");
    }
}
