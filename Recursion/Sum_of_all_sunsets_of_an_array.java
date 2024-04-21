package Recursion;

public class Sum_of_all_sunsets_of_an_array {

    static void SSB(int arr[],int n , int sum ,int index){

        if (index>=n){
            System.out.print(sum + " ");
            return;
        }

        //curr index + sum
        SSB(arr,n,arr[index]+sum,index+1);

        // curr ans

        SSB(arr,n,sum,index+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        SSB(arr,arr.length,0,0);
    }
}
