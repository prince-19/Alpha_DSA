Recursion 10th lec dry run + do stack analysis + write correct code

// Write a function to find the first Occurance of an element in an array

public class LastOccuranceOfElementInArray {
    // Logic By Self
    public static int lastOccurance(int[] arr, int key, int i){
        if(i == -1){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }

     // Shradha ma'am logic
    public static int lastOccurance1(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
          int[] arr ={34, 45, 5, 47, 5, 12, 5, 47, 5, 5, 39, 5, 82};
    //    int[] arr = {5, 5, 5, 5};
        System.out.println(lastOccurance(arr, 5, arr.length-1));
        System.out.println(lastOccurance1(arr, 5, 0));
    }
}
