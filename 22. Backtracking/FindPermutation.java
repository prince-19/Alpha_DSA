public class FindPermutation {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            /* "abcde" => "ab" + "de" = "abde"  // to remove any "i th" character from string */
        
           /* Both of the above code is correct when we dont pass second index then it is take to last of string i.e till length of string by default */
           // Newstr = str.substring(0, i) + str.substring(i+1, str.length());
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);

        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
