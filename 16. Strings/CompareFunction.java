import java.util.EnumSet;

public class CompareFunction {
    public static void main(String[] args) {
        String str1 ="Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        if(str1 == str2){
            System.out.println("str1 == str2");
        }
        else{
            System.out.println("str1 != str2");
        }

        // "==" checks only if objects are same 
        if(str1 == str3){
            System.out.println("str1 == str3");
        }
        else{
            System.out.println("str1 != str3");
        }

        // .equals() checks and give correct ans if strings are same
        if(str1.equals(str3)){
            System.out.println("str1 == str3");
        }
        else{
            System.out.println("str1 != str3");
        }
    }
}
