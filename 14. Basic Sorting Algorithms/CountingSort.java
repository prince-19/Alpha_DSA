public class CountingSort {

    public static void countingSort(int[] arr){
        // To find the largest number in array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest+1]; 
        // we are taking size largest+1 as we will count frequency from 0
        
        //storing the frequency of elements in count array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,2,4,3,3,4,7,4}; 
      
        countingSort(arr);

        printArray(arr);
    }
}
