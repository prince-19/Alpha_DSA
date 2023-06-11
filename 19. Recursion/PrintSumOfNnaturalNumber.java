public class PrintSumOfNnaturalNumber {
    // public static int natSum(int n){
    //     if( n == 1){
    //         return 1;
    //     }
    //     int sum = 0;
    //     sum = n + natSum(n - 1);
    //     return sum;
    // }   

       public static int natSum(int n){
        if( n == 1){
            return 1;
        }
        return n + natSum(n - 1);
    }   

    public static void main(String[] args) {
        System.out.println(natSum(5));
    }
}
