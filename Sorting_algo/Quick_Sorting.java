package Sorting_algo;

public class Quick_Sorting {


    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    static void swap(int arr[],int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int arr[],int start,int end){
        int pivotIndex = start;
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;

            if(i<j){
                swap(arr,i,j);
                j--;
            }

            i++;

        }
        swap(arr,j,pivotIndex);

        for (int k = 0; k < arr.length; k++) {
            if(arr[k]==pivot){
                pivotIndex = k;
            }
        }
        return pivotIndex;
    }

    static void quick_Sort(int arr[],int start,int end){
        if(start>=end){
            return;
        }

        int pivotIndex = partition(arr,start,end);
        quick_Sort(arr,start,pivotIndex);
        quick_Sort(arr,pivotIndex+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 30, 5, 2};
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr); // 4 1 3 5 2
        quick_Sort(arr, 0, n-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
