public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();  // Non-paramaterized constructor
        Student s2 = new Student("Prince");  // paramaterized constructor
        Student s3 = new Student(5);

        // Calling Copy Constructor
        Student s4 = new Student(s2);
        
        
        System.out.println(s1.name);
        System.out.println(s4.name);
        System.out.println(s4.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(){    // Non-paramaterized constructor
        System.out.println(" Non-paramaterized Constructor is called .....");
    }

    Student(String name){   //constructor
        this.name = name;
    }     

    Student(int rollNumber){
        this.roll = rollNumber;
    }

    // Copy Constructor
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
    }
}
