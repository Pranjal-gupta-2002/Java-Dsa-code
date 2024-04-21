package Sorting_algo;

public class Radix_Sorting {

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


    static void countSort(int arr[],int place){
        int n  = arr.length;
        int output[] = new int[n];
        int max = findMax(arr);
        int count[] = new int[10];

        for (int i = 0; i < arr.length; i++) {  //frequency array
            count[(arr[i]/place)%10]++;
        }

        for (int i = 1; i < count.length; i++) { // prefix count array
            count[i] = count[i] + count[i-1];
        }

        // find the index of each element in the original array and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int index = count[(arr[i]/place)%10] - 1;
            output[index] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    static void radixSort(int []arr){
        int max = findMax(arr);

        for (int place = 1; max/place > 0; place*=10) {
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
        // digit by digit sorting ,place value / position of digit in a number

        int arr[] = {43,453,626,894,0,3};
        radixSort(arr);
        printArray(arr);
    }
}
