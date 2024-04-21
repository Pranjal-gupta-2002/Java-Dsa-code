package Sorting_algo;

public class Selection_Sorting {

    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;

            for (int j = i+1; j < arr.length; j++) {

                if(arr[j]<arr[min_index]){
                    min_index = j;

                }
            }

            if (min_index!=i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int arr[]  = {5,4,3,2,1};
        selectionSort(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
