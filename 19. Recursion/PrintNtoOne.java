// Print nos from n to 1; 

public class PrintNtoOne{

    public static void printDec(int n){
      if(n == 0) return;
      System.out.print(n + " ");
      printDec(n-1);
    }
    
    public static void main(String[] args) {
        printDec(23);
    }
}
