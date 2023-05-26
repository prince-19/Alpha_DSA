public class PalindromString {
    public static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
       return true;
    }

    public static boolean isPalindrom1(String str){
        int n = str.length();

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;   
            }
        }
        return true;
    } 

    public static void main(String[] args) {
     System.out.println(isPalindrom1("racecar"));   
    }
}
