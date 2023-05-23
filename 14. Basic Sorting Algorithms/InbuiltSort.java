import java.util.*;
import java.util.Collections;

public class InbuiltSort {
    public static void printArray(Integer[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] arr={4,3,8,2,9,1};
       // Arrays.sort(arr);
       // Arrays.sort(arr, 2, arr.length); // ending index is non-inclusive

      // Arrays.sort(arr, Collections.reverseOrder()); // it will not work for "int" instead it will work for "Integer" 
      
      Arrays.sort(arr,2, arr.length, Collections.reverseOrder());
      // To reverse from a starting index to ending index



        printArray(arr);
     
    }
}
