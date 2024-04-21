package Recursion;

public class find_the_element_in_array {

    static int find(int arr[],int index,int target){
        if(index >= arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }


        return find(arr,index+1,target);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

       int ans = find(arr,0,7);
        System.out.println(ans);
    }
}
