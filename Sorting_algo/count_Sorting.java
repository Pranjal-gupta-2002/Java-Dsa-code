package Sorting_algo;

public class count_Sorting {

    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    static int findMax(int arr[]){
        int max  = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCountSort(int arr[]){
        //find the largest element in the array

        int max  = findMax(arr);
        int count[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }

    }

    static void countSort(int arr[]){
        int n  = arr.length;
        int output[] = new int[n];
        int max = findMax(arr);
        int count[] = new int[max+1];

        for (int i = 0; i < arr.length; i++) {  //frequency array
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) { // prefix count array
            count[i] = count[i] + count[i-1];
        }

        // find the index of each element in the original array and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int index = count[arr[i]] - 1;
            output[index] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        // range is given int the questions
        // it is a non-comparison algo
        // it is not a in-place sorting technique

        int arr[] = {1,4,5,2,2,5};
        countSort(arr);
        printArray(arr);
    }
}
