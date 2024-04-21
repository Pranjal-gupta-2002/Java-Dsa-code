package Sorting_algo;

public class Bubble_Sorting {

    static int [] bubbleSort(int []arr ){
        for (int i = 0; i < arr.length; i++) {
            boolean flag  = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag){
                return arr;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int []ans  = bubbleSort(arr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
}
