package Arrays_1d;

public class rotate_array_by_one_place {
    public static void rotate_array_by_one_place(int arr[]){
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        rotate_array_by_one_place(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
