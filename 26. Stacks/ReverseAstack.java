//Reverse a stack 

import java.util.*;

public class ReverseAstack {

    public static void pushAtBottomSol(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottomSol(s, data);
        s.push(top);
    }


    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        
        int top = s.pop();
        revStack(s);
        pushAtBottomSol(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
            ;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        revStack(s);
        printStack(s);

        
    }
}
