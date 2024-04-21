public class Arrays1 {
//    static int twoSumPair(int arr[],int target){
//        int answer = -1;
//        for(int i = 0 ; i <=arr.length;i++){
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]+arr[j]==target){
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
//    static int threeSumPair(int arr[],int target){
//        int answer = -1;
//        for(int i = 0 ; i <=arr.length;i++){
//            for (int j = i+1; j < arr.length; j++) {
//                for (int k = j+1; k < arr.length; k++) {
//                    if(arr[i]+arr[j]+arr[k]==target){
//                        answer++;
//                    }
//                }
//            }
//        }
//        return answer;
//    }

//    static int findUnique(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]==arr[j]){
//                    arr[i]=-1;
//                    arr[j]=-1;
//                }
//            }
//        }
//        int answer = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>0){
//                answer = arr[i];
//            }
//        }
//        return answer;
//    }


//    static int findMax(int arr[]){
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max= arr[i];
//            }
//        }
//        return max;
//    }
//
//    static int findSecondMax(int arr[]){
//        int max = findMax(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==max){
//                arr[i] = Integer.MIN_VALUE;
//            }
//        }
//
//        int secondmax = findMax(arr);
//
//        return  secondmax;
//    }

    static int firstRepeatingNumber(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){

                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int age [] = {2,3,4,5,6,7,8,9,5,54,4,3,1};
//        int target = 7;
//    int answer1 = twoSumPair(age,target);
//        int answer2 = threeSumPair(age,target);
//        System.out.println(answer1);
//        System.out.println(answer2);
//        int ans = findSecondMax(age);
//        System.out.println(ans);
        int ans = firstRepeatingNumber(age);
        System.out.println(ans);
    }
}
