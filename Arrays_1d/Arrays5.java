public class Arrays5 {
    // two pointer method
    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

    // base approach

//    static void sortZeroes(int arr[]){
//        int n = arr.length;
//        int zeroes = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==0){
//                zeroes++;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if(i < zeroes){
//                arr[i] = 0;
//            }
//            else {
//                arr[i]=1;
//            }
//        }
//    };

    static void swap(int arr[],int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static  void  sortZeroes(int arr[]){
        int r = arr.length-1;
        int l = 0 ;

        while (l<r){
            if (arr[l]==1 && arr[r]==0){
                swap(arr,l,r);
                l++;
                r--;
            }

            if(arr[r]==1){
                r--;
            }

            if(arr[l]==0){
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,1,1,0,1,0,0,0,1,0,1};
        printArray(arr);

        sortZeroes(arr);
        System.out.println();

        printArray(arr);
    }
}
