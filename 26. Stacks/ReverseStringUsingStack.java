// Reverse the give string using stack

import java.util.*;

public class ReverseStringUsingStack {
    public static String reverseString(String s){
        Stack<Character> c = new Stack<>();

        int i = 0;
        while(i < s.length()){
            c.push(s.charAt(i));
            i++;
        }

        StringBuilder ans = new StringBuilder("");
        while(!c.isEmpty()){
            char curr = c.pop();
            ans.append(curr);
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String a = "Prince";
        System.out.println(reverseString(a));
    }
}
