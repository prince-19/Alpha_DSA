// Queue implementation using inbuilt functions
// Time Complexity for all the three operation is O(1)

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_using_inbuilt_library {
    
    public static void main(String[] args) {
        //Queue q = new Queue(5);
         //Queue can be implemented using 1.LinkedList  or  2.ArrayDeque
        Queue<Integer> q = new LinkedList<>();
       // Queue<Integer> q = new ArrayDeque<>();
       
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}

