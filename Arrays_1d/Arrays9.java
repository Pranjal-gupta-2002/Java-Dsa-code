package Arrays_1d;
// find the sub-arrays whose sum is equal


public class Arrays9 {

    static int findArraySum(int arr[]){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int arr[]){
        int totalSum = findArraySum(arr);
        int prefSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefSum = prefSum + arr[i];
            int suffixSum = totalSum - prefSum;

            if(prefSum == suffixSum){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1};

        boolean ans = equalSumPartition(arr);

        System.out.println(ans);

    }
}
