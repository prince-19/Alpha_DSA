// print all sub-array

public class PrintSubArray{
    public static void printSubArrays(int[] arr){
       int total_sub_array = 0;
       for(int i=0; i<arr.length; i++){
           for(int j=i; j<arr.length; j++){
              for(int k=i ; k<=j ;k++){
                  System.out.print(arr[k] + " ");
              }
               ++total_sub_array;
             System.out.println(); 
           }
           System.out.println();
       }
        System.out.println("Total number of subarrays : " + total_sub_array);
    }


    public static void main(String[] args) {
       // int[] arr ={2,4,6,8,10};
       int[] arr ={1,2,3};
        
       printSubArrays(arr);

    }
}