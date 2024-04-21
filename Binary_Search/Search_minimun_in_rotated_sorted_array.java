package Binary_Search;

public class Search_minimun_in_rotated_sorted_array {

    static int findMinimum(int arr[]){
        int n  = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]>arr[n-1]){
                start = mid+1;
            }
            else if (arr[mid]<=arr[n-1]) {
                end = mid-1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(findMinimum(arr));
    }
}
