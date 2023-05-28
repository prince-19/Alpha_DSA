
import java.util.*;;
public class Strings{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
       
        // Will print only one word

        // String name = sc.next();
        // System.out.println(name);


        // Will print complete sentence

        // String name1 = sc.nextLine();
        // System.out.println(name1.length());


        // Concatenation
        String firstName = "Prince";
        String lastName = "Shahi";
        String fullname = firstName + " " + lastName;
       // System.out.println(fullname);

        // charAt()
        //System.out.println(fullname.charAt(0));

        printLetters(fullname);
    }
}