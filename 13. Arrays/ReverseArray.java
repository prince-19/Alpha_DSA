// Reversing an Arrry in TC O(n) & SC = O(1);

public class ReverseArray{
    public static void reverse_arr(int[] arr){
        int first = 0; 
        int last = arr.length - 1;
        
        while(first < last){
           int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        
    }


    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10,16};
        //int key = 13;

        System.out.println("Reversed array is : " );
       
        reverse_arr(arr);
        
        for (int i=0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        } 

    }
}