package Recursion;

public class Recursion_in_Arrays2 {

    static int findMax(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }

        return Math.max(arr[index],findMax(arr,index+1) );
    }

    public static void main(String[] args) {
        int arr[] = {9,12,10,20,30};
        System.out.println(findMax(arr,0));
    }
}
