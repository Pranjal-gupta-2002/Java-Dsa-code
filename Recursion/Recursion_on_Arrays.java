package Recursion;
public class Recursion_on_Arrays {

    //printing of Arrays with Recursion
    static void printArray(int arr[],int index){
        if(index==arr.length){
            return;
        }

        System.out.print(arr[index] +" ");

        printArray(arr,index+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9};
        printArray(arr,0);
    }
}
