public class KandansAlgo{

    public static int kadanes(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        //int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Maximum Sum is : " + kadanes(arr));
    }
}