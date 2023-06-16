

public class LinkedList{
    public static class Node {
         int data;
         Node next;

         public Node(int data){
            this.data = data;
            this.next = null;
         }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //To add element at the begining
    public void addFirst(int data){   // O(1)
         //step1 - Create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    }

    //To add element at the last position
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //Add element in the middle of linked list
    public void addAtMiddle(int index, int data){  // O(n)
        if(head == null){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 0;
        while(count < index-1){
           count++;
           temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // To remove first element of linked list
    // it will return the value of node which is deleted
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
            int val = head.data;
            head = head.next;
            size--;

            return val;
    }

    //To remove first element of Linked List
    public int removeLast(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : index =  size - 2;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = tail.data;  // prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Search a key in linked list, return position where it is found. if not found return -1
    public int SearchKey(int key){  // T.C = O(n)
        if(size == 0){
            System.out.println("Linked List is empty");
            return -1;
        }else if(size == 1){
            if(head.data == key){
                return 0;
            }
        }

        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            else{
                temp = temp.next;
                index++;
            }
        }
        return -1;
    }

    // //Size of linked list :- we will use -> static int count for getting in O(1)
    // public int LlSize(){
    //     if(head == null){
    //         return 0;
    //     }

    //     int count = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         count++;
    //         temp = temp.next;
    //     }
    //     return count;
    // }


    //print function
    public void print(){    //O(n)
        if(head == null){ // for empty linked list
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.err.println(ll.size);
        ll.print();
        ll.addFirst(2);
         ll.print();
        ll.addFirst(1);
         ll.print(); 
        ll.addLast(4);
         ll.print();
        ll.addLast(5);
        ll.addAtMiddle(2, 3);
        ll.print();  
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.size);
        ll.print();
        System.out.println("Removed last elment: "+ ll.removeLast());
        System.out.println("size: " + size);
        ll.print();

        System.out.println("--------------------------------------------");
        System.out.println(ll.SearchKey(3));
        

        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);
        // System.out.println(tail.data);

        //ll.print();
    }
}