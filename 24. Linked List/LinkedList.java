

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

    //Iteratively Search a key in linked list, return position where it is found. if not found return -1
    public int itrSearchKey(int key){  // T.C = O(n)
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

    // Recursively search a key in linked list, return position where it is found. If not found return -1
    //helper function for reversing
    public int helper (Node head, int key){ // T.C = O(n) & S.C = O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    // reverse search function
    public int recurSearch(int key){
        return helper(head, key);
    }

    // Reversing Linked List  
    public void reverseLinkedList(){ //T.C = O(n) 
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
    }

    // To delete the nth node of linked list from end
    public void deleteNthfromEnd(int n){
        //calcute size 
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++; 
        }

        if(n == size){
            head = head.next; //removeFirst
        }

        //size-n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    //To find mid-node of linked list using slow-fast approach
    public Node findMid(Node head){ // helper function for palindrom finding
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        //step 3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
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
        // System.err.println(ll.size);
        // ll.print();
        // ll.addFirst(2);
        //  ll.print();
        // ll.addFirst(1);
        //  ll.print(); 
        // ll.addLast(4);
        //  ll.print();
        // ll.addLast(5);
        // ll.addAtMiddle(2, 3);
        // ll.print();  
        // System.out.println(ll.size);
        // System.out.println(ll.removeFirst());
        // ll.print();
        // System.out.println(ll.size);
        // ll.print();
        // System.out.println("Removed last elment: "+ ll.removeLast());
        // System.out.println("size: " + size);
        // ll.print();

        // System.out.println("--------------------------------------------");
        // System.out.println(ll.itrSearchKey(3));
        // System.out.println(ll.itrSearchKey(2));
        // System.out.println(ll.recurSearch(3));
        // System.out.println(ll.recurSearch(2));

        // System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // System.out.println("Linked list before reversing");
        // ll.print();
        // ll.reverseLinkedList();
        // System.out.println("linked list after reversing");
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // ll.print();

        ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        //ll.addLast(1);
        System.out.println(ll.checkPalindrome());        

        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);
        // System.out.println(tail.data);

        //ll.print();
    }
}