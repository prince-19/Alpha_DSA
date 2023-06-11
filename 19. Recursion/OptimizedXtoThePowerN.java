public class OptimizedXtoThePowerN {

    /*  this Code is still not optimized as we are writing
    halfPowerSq = optimizedPower(n, power/2) * optimizedPower(n, power/2)
    so, we are doing the recursion call for two times , which will result in the Time Complexity of O(n);(Which is similar to previous solution)
    so, we'll have to optimize it 
    */
    public static int optimizedPower(int n, int power){ // T.c = O(n)
        if(power == 0){
            return 1;
        }
        int halfPowerSq = optimizedPower(n, power/2) * optimizedPower(n, power/2);
        
        //n is odd
        if(power % 2 != 0){
            halfPowerSq = n * halfPowerSq;   // 2^5 = 2 * 2^2 * 2^2;
        }

        return halfPowerSq;
    }

    /*So to optimized above code we'll store the value of
     optimizedPower(n, power/2) * optimizedPower(n, power/2) in a variable and then we'll square it by multiplying two times */

    public static int optimizedPower1(int n, int power){ // T.c = O(log n)
        if(power == 0){
            return 1;
        }
        int halfPower = optimizedPower(n, power/2);
        int halfPowerSq = halfPower * halfPower;
        
        //n is odd
        if(power % 2 != 0){
            halfPowerSq = n * halfPowerSq;   // 2^5 = 2 * 2^2 * 2^2;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 1));
        System.out.println(optimizedPower1(2, 1));

    }
}
