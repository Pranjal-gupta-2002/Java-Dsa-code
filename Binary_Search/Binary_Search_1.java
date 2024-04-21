package Binary_Search;

public class Binary_Search_1 {

    static boolean binarySearch(int arr[],int target){
        int n = arr.length;
        int start = 0;
        int end = n;

        while (start<end){
            int mid = (start+end)/2;

            if(target==arr[mid]){
                return true;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }

    static boolean recBinarySearch(int arr[],int start,int end,int target){
        if(start>end){
            return false;
        }
        int mid = start + (end-start)/2;

        if(target==arr[mid]){
            return true;
        }
        else if (target>arr[mid]) {
            return recBinarySearch(arr,mid+1,end,target);
        }
        else {
            return recBinarySearch(arr,start,mid-1,target);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(recBinarySearch(arr,0, arr.length-1, 50));
    }
}
