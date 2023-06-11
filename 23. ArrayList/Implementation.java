import java.util.ArrayList;

//ArrayList is Similar to "Vectors" in "C++";
//ArrayList is part of "Java Collection FrameWork";
public class Implementation{
    public static void main(String[] args) {
        // ArrayList can store data of : Integer , Boolean , String , Float etc. 

        //ClassName   ObjectName  = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // <> it is used to represent "Data Type" used in ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();

        //to add elments in ArrayList  => O(1)
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //to add an element at given index
        //list.add(index, element)
        list.add(1, 19);   // O(n)

        System.out.println(list);

        //get element   =>  O(1)
        //get opertion is used to get element using index
        int element = list.get(2);  // O(1)
        System.out.println(element);


        //remove element  => O(n)
        //removes element using index
        list.remove(2);  //O(n)
        System.out.println(list);


        //set element at index  => O(n)
        //to replace existing element with another element
        list.set(2, 10);   //O(n)
        System.out.println(list);


        //contains element   => O(n)
        //checks whether an element is present in the array or not
        //returns true or false value
        System.out.println(list.contains(1));  //O(n)
        System.out.println(list.contains(11));


        //.size()  -> to find size of ArrayList
        //here .size() is a "method/function" unlike "length" in "array" which is "property"

        System.out.println(list.size());


        //print the ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


    }
}