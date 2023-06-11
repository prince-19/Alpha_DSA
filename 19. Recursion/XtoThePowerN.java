public class XtoThePowerN {
    public static int calcXpowerN(int n, int power){
        if(power == 0){
            return 1;
        }
        return n * calcXpowerN(n, power-1);
    }
    public static void main(String[] args) {
        System.out.println(calcXpowerN(2, 10));
    }
}
