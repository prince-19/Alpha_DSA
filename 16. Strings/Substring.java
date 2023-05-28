public class Substring{

    // fuction made by us to print substring
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Prince Shahi";
        System.out.println(subString(str, 0, 9));

        // buit in function
        System.out.println(str.substring(0, 9));
    }
}