package Binary_Search;

public class Find_first_occurance_of_element {

    static int firstOcc(int arr[],int target){
        int n = arr.length-1;
        int start  = 0 ;
        int end = n;
        int fo = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                fo = mid;
                end = mid-1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,5,5,6,2,4};
        int target  = 15;
        System.out.println(firstOcc(arr,target));
    }
}
