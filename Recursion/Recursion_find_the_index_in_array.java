package Recursion;

public class Recursion_find_the_index_in_array {

    static void findIndex(int arr[],int index,int target){
        if(index>=arr.length){
            return;
        }

        if(arr[index]==target){
            System.out.print(index + " ");
        }

        findIndex(arr,index+1,target);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5,6,7,8,7};
        findIndex(arr,0,7);
    }
}
