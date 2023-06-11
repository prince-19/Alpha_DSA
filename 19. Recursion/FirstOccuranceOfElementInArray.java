// Write a function to find the first Occurance of an element in an array

public class FirstOccuranceOfElementInArray {
    public static int firstOccurance(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccurance(arr, i+1, key);                                   
    }
    public static void main(String[] args) {
        int[] arr ={34, 45, 47, 12, 39, 82};
        System.out.println(firstOccurance(arr, 0, 39));
    }
}
