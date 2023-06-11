public class AbstractClass {
    public static void main(String[] args) {
        DiamondSociety d = new DiamondSociety();
        d.buildings();
        d.swimmingPool();
       // System.out.println(d.buildingColor);
        d.changeBuildingColor();
        System.out.println(d.buildingColor);


        System.out.println();

        GokulDham g = new GokulDham();
        g.buildings();
        g.swimmingPool();
       // System.out.println(g.buildingColor);
        g.changeBuildingColor();
        System.out.println(g.buildingColor);


        // Society s = new Society(); // We cannot initiate the Abstract class
         
    }
}

abstract class Society{
    String buildingColor;

    Society(){
        buildingColor = "RED";
    }

    void buildings(){
        System.out.println("Society has buildings");
    }

    abstract void swimmingPool();  // Abstract method
}

class DiamondSociety extends Society{

    void changeBuildingColor(){
        buildingColor = "Dark Yellow";
    }

    void swimmingPool(){
        System.out.println("DiamodSociety do not have swimming pool");
    }
}

class GokulDham extends Society{
    void changeBuildingColor(){
        buildingColor = "Green";
    }

    void swimmingPool() {
        System.out.println("GokulDham Society is having Olympics sized swimming pool");
    }
}