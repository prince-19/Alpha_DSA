public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();
    }   
}

class OtherAnimal{
    void eats(){
        System.out.println("Eat anything");
    }
}

class Deer extends OtherAnimal{
    void eats(){
        System.out.println("Deer Eats Grass");
    }
}