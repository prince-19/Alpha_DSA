/* Q. For a given String convert each of the first letter of each word to uppercase  */

import java.lang.*;

public class ConvertFirstLetterOfWordToUpperCase {
    public static String toUpperCaseEx(String str){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i)); // append the empty space
                i++;
                //Captalise the letter after space
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                //append the remaining character as it is
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am prince ";
        System.out.println(toUpperCaseEx(str));
    
 }   
}
