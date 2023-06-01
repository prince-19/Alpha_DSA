import java.util.Scanner;

public class CheckIfNoIsEvenOrOdd {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 1){
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int numb = sc.nextInt();

        oddOrEven(numb);
    }
}
