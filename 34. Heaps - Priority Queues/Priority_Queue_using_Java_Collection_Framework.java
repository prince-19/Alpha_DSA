import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue_using_Java_Collection_Framework{
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); // By default it gives ascending order of elements in intergers

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // to get elements in decreasing order

       
        pq.add(3); //O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(log n)
        }
    }
}