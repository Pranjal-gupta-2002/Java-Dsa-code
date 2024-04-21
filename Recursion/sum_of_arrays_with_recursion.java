package Recursion;

public class sum_of_arrays_with_recursion {

    static int sum(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }

        return arr[index]+sum(arr,index+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(sum(arr,0));
    }
}
