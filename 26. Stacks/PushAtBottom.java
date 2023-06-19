import java.util.Stack;

//Time Complexity = O(n)  ,  Space Complexity = O(1)
public class PushAtBottom {
    public static void pushAtBottomSol(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottomSol(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottomSol(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.get(s.size() - 1));
            s.pop();
        }
    }
}
