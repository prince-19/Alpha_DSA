
public class BinarySearch{
    public static int binary_search(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            //comparison
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){  // search in Right
                start = mid+1;
            }else { //search in left
                end = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10,11,16};
        int key = 23;

        System.out.println("Index for key is : " + binary_search(arr, key));

    }
}