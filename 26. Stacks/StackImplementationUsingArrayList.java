import java.util.ArrayList;

public class StackImplementationUsingArrayList{
    static class Stacks{
         static ArrayList<Integer> list = new ArrayList<>();
       
         //Below funcitons can have static specifier of not both are correct
       
         // isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek => give top element
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }

         
    }
    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}