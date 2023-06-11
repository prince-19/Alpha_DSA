public class MergeSorting{
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        //Kaam
        int mid = si + (ei - si)/2;  // (si+ei)/2 is also correct
        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid+1, ei); //right
        merge(arr, si, mid, ei);
    }
    
    public static void merge(int[] arr, int si, int mid, int ei){
        //left(0,3)=4 right(4,6)=3 -> 6-0+1 size, so, for (0,6) indexed array we need size 7
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part 
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for 

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
                //k++;
            }else{
                temp[k] = arr[j];
                j++;
                //k++;
            }
            k++;  // we write it outside if-else as it is common in both
        }
        
        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k]; 
        }

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8}; //even
        int[] arr1 = {6, 3, 9, 5, 2, 8, -2}; //odd
        mergeSort(arr, 0, arr.length-1);
        mergeSort(arr1, 0, arr1.length-1);
        printArr(arr);
        printArr(arr1);
    }
}