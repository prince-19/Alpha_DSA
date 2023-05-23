// Bubble Sort  
// Time Complexity = O(n)

public class BubbleSort{
    public static void bubbleSort(int[] array){
        for(int turn=0; turn<array.length-1; turn++){       // runs n times
            for(int j=0; j<array.length-1-turn; j++){    // runs n-1-turns times
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2,9,7,6};

        bubbleSort(arr);
        printArray(arr);
    }
}