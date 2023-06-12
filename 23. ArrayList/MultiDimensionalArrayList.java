import java.util.ArrayList;

public class MultiDimensionalArrayList{
    public static void main(String[] args) {
        //ArrayList<ArrayList<>> mainList = new ArrayList<>();  // Giving Error
       ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
       ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(1);
       list1.add(2);
       mainList.add(list1);

       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(2);
       list2.add(4);
       mainList.add(list2);

       // Directly print multi-dimensional arrayList
       System.out.println(mainList);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0; j<currentList.size(); j++){
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }

    }
}