package Arrays_1d;


// prefix sum prob


public class Arrays8 {

    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    static int[] makePrefixSumArray(int arr[]){
        int n = arr.length;
//        int pref[] = new int[n];
//        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        printArray(arr);

        int pref[] = makePrefixSumArray(arr);
//        arrayReverse(ans);
        System.out.println();

        printArray(pref);
    }
}
