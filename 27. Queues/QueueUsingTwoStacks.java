import java.util.*;

public class QueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        // we don't need to check s2 as we are temporarily using stack s2

        // Add
        public static void add(int data){ //T.C = O(n) + O(n) = O(n)
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove(){  //T.C = O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        //peek
        public static int peek(){  //T.C = O(1)
           if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
             q.remove();
        }

       
    }
}
