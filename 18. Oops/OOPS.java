public class OOPS{      // Always keep First letter of name of class Capital
    public static void main(String[] args) {
     Pen p1 = new Pen(); // created a pen object called p1 
     p1.setColor("Blue");
     System.out.println(p1.color);   
     p1.setTip(5);
     System.out.println(p1.tip);
     p1.setColor("Yellow");
     System.out.println(p1.color);
     p1.color = "red";
     System.out.println(p1.color);
    }
}

class Pen{      // Class pen
    String color;       // Attributes of pen class i.e color & tip
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}



