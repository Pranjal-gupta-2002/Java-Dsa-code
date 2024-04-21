package Binary_Search;

public class Square_root_of_a_number_to_its_nearest_floor_value {

    static int squareRoot(int num){
        int start = 0;
        int end = num;
        int ans = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (mid*mid == num){
                 ans  = mid;
            }
            else if (mid*mid>num) {
                end = mid-1;
            }
            else {
                start = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num =  35;
        System.out.println(squareRoot(num));
    }
}
