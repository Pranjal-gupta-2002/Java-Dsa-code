public class Arrays3 {


    // array rotation prob wrt k


    //solution :- 1
    static void printArray (int num []){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

//    static int[] arrRot(int arr[], int k){
//        int n = arr.length;
//        k = k % n ;
//        int ans[] = new int[n];
//        int j = 0;
//
//
//        for (int i = n-k; i < n; i++) {
//            ans[j++] = arr[i];
//        }
//
//        for (int i = 0; i < n-k; i++) {
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }


    //solution :- 2
    static void swap(int arr[],int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void arrayReverse(int arr[],int i ,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void  rotation(int arr[],int k ){
        int n = arr.length;
        arrayReverse(arr,0,n-k-1);
        arrayReverse(arr,n-k,n-1);
        arrayReverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6,7,8,9};
        printArray(num);
        System.out.println();

        rotation(num , 4);
        printArray(num);
//        printArray(arrRot(num,4));
    }
}
