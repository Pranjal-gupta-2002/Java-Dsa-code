package Arrays_1d;

public class Arrays7 {


    // sorting of -no. & +no.
    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    static void swap(int arr[],int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void arrayReverse(int arr[]){
        int i = 0 ;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int arr[]){
        int n = arr.length;
        int l = 0;
        int r = n-1;

        int ans [] = new int[n];

        int k = 0;

        while (l<=r){
            if (Math.abs(arr[l])>Math.abs(arr[r])){
                ans[k++] = arr[l] * arr[l];
                l++;
            }
            else {
                ans[k++] = arr[r] * arr[r];
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-10,-3,-1,4,5,7};
        printArray(arr);

        int ans[] = sortSquares(arr);
        arrayReverse(ans);
        System.out.println();

        printArray(ans);
    }
}
