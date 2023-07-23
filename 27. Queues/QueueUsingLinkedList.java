// Queue implementation using linkedlist 

public class QueueUsingLinkedList{
    static class Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
       static Node head = null;
       static Node tail = null;


        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add element
        public static void add(int data){  //T.C = O(1)
          Node newNode = new Node(data);
          if(head == null){
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
        }

        //remove
        public static int remove(){  //T.C = O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            //single element in linkedlist
            if(tail == head){
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        //peek
         public static int peek(){  // T.C = O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
         }


    } 
    public static void main(String[] args) {
        Queue q = new Queue();
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