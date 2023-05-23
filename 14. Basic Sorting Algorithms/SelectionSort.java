public class SelectionSort {
    public static void selectionSort(int[] arr){
        //outer loop will run from 0 to n-2
        //as at (n-2) th loop we need not to compare as there will be only one elemnt left
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){  // for sorting in decreasing order put  '<' on place of '>'; 
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrary = {5, 4, 1, 3, 2};
        selectionSort(arrary); 
        printArray(arrary);
    }
}
