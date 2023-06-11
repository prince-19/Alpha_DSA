// Time Complexity = O(n)
// Space Complexity = O(n) => as call stacks are formed

public class PrintFactorialOfNoN {
    public static int calcFact(int n){
        if(n == 0){
            return 1;
        }
        return n * calcFact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(calcFact(5));
    }
}
