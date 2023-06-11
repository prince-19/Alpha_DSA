public class SuperKeyword {
    public static void main(String[] args) {
        Fortuner f = new Fortuner();
        System.out.println(f.color);
        
    }
}

class Car{
    String color;
    Car(){
        System.out.println("Car constructor is called");
    }
}

class Fortuner extends Car{
    Fortuner(){
        super.color = "red";
        //super();
        System.out.println("Fortuer constructor is called");
    }
} 