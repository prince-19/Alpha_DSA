public class getterSetter{
    public static void main(String[] args) {
        AnotherPen p2 = new AnotherPen(); // created a pen object called p1 
        p2.setColor("Blue");
        System.out.println(p2.getColor());   
        p2.setTip(5);
        System.out.println(p2.getTip());
        p2.setColor("Yellow");
        System.out.println(p2.getColor());
        p2.setColor("red");
        System.out.println(p2.getColor());
    }
}

class AnotherPen{      // Class pen
    private String color;       // Attributes of pen class i.e color & tip
    private int tip;

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}