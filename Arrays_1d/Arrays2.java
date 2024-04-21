public class Arrays2 {

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
    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

    public static void main(String[] args) {

        int num [] = {1,2,3,4,5,6,7,8,9};
        printArray(num);
        System.out.println();
        arrayReverse(num);
        printArray(num);

    }
}
