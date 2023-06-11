/* When we make object of child class i.e B  then at first constructor of X will be called and then constructor of A will be called and at last Constructor of B will be called.

// i.e Initialization of properties occurs from top to bottom in Inheritance Hierarchy. */

public class HierarchialCallingOfConstructors {
    public static void main(String[] args) {
        // Construction -> Buildings -> Room
        Room r = new Room();
    }
}

class Construction{
    Construction(){
        System.out.println("Construction constructor called");
    }
}

class Buildings extends Construction{
    Buildings(){
        System.out.println("Buildings consturctor called");
    }
}

class Room extends Buildings{
    Room(){
        System.out.println("Room's constructor called");
    }
}
