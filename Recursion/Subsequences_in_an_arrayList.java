package Recursion;

import java.util.ArrayList;

public class Subsequences_in_an_arrayList {

    static ArrayList<String> SSQ(String str ){

        ArrayList<String> ans = new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }

        ArrayList<String> smallAns = SSQ(str.substring(1));

        for(String ss : smallAns){
            ans.add(ss);
            ans.add(str.charAt(0)+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(SSQ(str));
    }
}
