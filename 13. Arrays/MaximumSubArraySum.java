// Maximum sub-Array => Prefix-Sum method 

public class MaximumSubArraySum{
    public static void maxSubarraySum(int[] arr){
       int currSum = 0;
       int maxSum = Integer.MIN_VALUE;
       int[] prefix = new int[arr.length];
       
       prefix[0] = arr[0];
       //calculate prefix array 
       for(int i=1; i<arr.length; i++){
           prefix[i] = prefix[i-1] + arr[i];
       }
       
       
       
       
       for(int i=0; i<arr.length; i++){
           for(int j=i; j<arr.length; j++){
              currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
              
              if(currSum > maxSum){
                  maxSum = currSum;
              }
           }
       }
       
       System.out.print("Maximum sum is : " + maxSum);
    }


    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10};
        
      maxSubarraySum(arr);

    }
}