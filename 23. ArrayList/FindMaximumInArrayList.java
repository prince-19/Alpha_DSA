import java.util.ArrayList;

public class FindMaximumInArrayList {
 public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
       
    list.add(2); 
    list.add(5);
    list.add(3);
    list.add(9);
    list.add(6);

    int max = Integer.MIN_VALUE;
    int max1 = Integer.MIN_VALUE;

    // T.C = O(n)
    for(int i=0; i<list.size(); i++){
        if(max < list.get(i)){
            max = list.get(i);
        }
    }

    // T.C = O(n)
    for(int i=0; i<list.size(); i++){
        max1 = Math.max(max1, list.get(i));
    }


    System.out.println("Maximum element is : " + max);
    System.out.println("Maximum element is : " + max1);

 }
}
