public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schooName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schooName);

        Student s3 = new Student();
        s3.schooName = "ABC";

        System.out.println(s1.schooName);
        System.out.println(s2.schooName);
    }
}

class Student{
    String name;
    int roll;

    static String schooName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}