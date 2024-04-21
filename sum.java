public class sum {
    static int[] rearrange(int[] nums) {

        int pos = 0;
        int neg  = 1;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(neg<n && nums[i]<0){
                nums[neg] = nums[i];
                neg = neg+2;
            }
            else if(pos<n && nums[i]>0){
                nums[pos] = nums[i];
                pos = pos+2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};

        int ans[] = rearrange(arr);
        for (int i = 0; i < ans.length; i++) {

            System.out.println(ans[i]);
        }
    }
}
