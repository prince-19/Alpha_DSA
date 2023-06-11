import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       
         list.add(2); 
         list.add(5);
         list.add(9);
         list.add(3);
         list.add(6);

         System.out.println("List before sorting : " + list);

         Collections.sort(list);  // Ascending order

         System.out.println("List after sorting : " + list); 
         
         //Descending
         Collections.sort(list, Collections.reverseOrder());
         /*Here we have passed a comparator to sort in descending order
          * Comparators are function in java in which logic is defined 
          * here, in this case logic to sort in Descending order is defined
          */
         System.out.println("List being sorted in descending order : " + list);

    }
}
