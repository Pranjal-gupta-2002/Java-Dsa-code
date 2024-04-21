package Recursion;public class

Recursion_on_Strings {

    static String removeA(String str,int index){
        if(index==str.length()){
            return "";
        }

        char curr = str.charAt(index);

        if (curr != 'a') {
            return curr + removeA(str,index+1);
        }
        else {
            return removeA(str, index+1);
        }
    }

    public static void main(String[] args) {
        String str = "abagra";

        System.out.println(removeA(str,0));
    }
}
