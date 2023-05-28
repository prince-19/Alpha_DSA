import java.lang.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
       //Example 1
       StringBuilder sb = new StringBuilder("");
       for(char ch='a'; ch<='z'; ch++){
        sb.append(ch);
       }
       System.out.println(sb);

        // //Example 2
        // StringBuilder sb = new StringBuilder();  // Declaration
        // sb.append("This is the first sentence. ");
        // sb.append("This is the second sentence. ");
        // sb.append("This is the third sentence.");
        // String result = sb.toString();
        // System.out.println(result);

    }
}
