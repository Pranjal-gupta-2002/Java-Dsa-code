public class Arrays6 {

    // even - odd arrangement question :-

    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

    static void swap(int arr[],int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static  void  sortArrayByParity(int arr[]){
        int r = arr.length-1;
        int l = 0 ;

        while (l<r){
            if (arr[l] % 2 == 1 && arr[r] % 2 == 0){
                swap(arr,l,r);
                l++;
                r--;
            }

            if(arr[r] % 2 == 1){
                r--;
            }

            if(arr[l] % 2 == 0){
                l++;
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,9,9};
        printArray(arr);

        sortArrayByParity(arr);
        System.out.println();

        printArray(arr);
    }
}
