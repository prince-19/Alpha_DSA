// Compile time Polymorphism

public class MethodOverloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2, 3, 5));
        
        //By default any decimal number java takes double so we have to typecast
        System.out.println(calc.sum((float)2.5, (float)3.7));
    }
}

class calculator{
    int sum(int a, int b){
        return a + b;
    }
    
    int sum(int a, int b, int c){
        return a + b + c;
    }

    float sum(float a, float b){
        return a + b;
    }
}
