public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.veg();
        b.nonVeg();
    }
}

interface hervivorus{
    void veg();
}

interface carnivorus{
    void nonVeg();
}

class Bear implements hervivorus, carnivorus{
    public void veg(){
        System.out.println("Bear eats vegeterian items");
    }

    public void nonVeg(){
        System.out.println("Bear eats non-vegeterian items");
    }
}
