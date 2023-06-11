public class QuickSorting {
    public static void quickSort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        //last element
        int pIdx = partition(arr, si, ei); //pIdx is Pivot index
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei); //right
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot
        
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }


    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5}; //even
        int[] arr1 = {6, 3, 9, 8, 2, 5, -5}; //odd
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
        quickSort(arr1, 0, arr1.length-1);
        printArr(arr1);
    }
}
