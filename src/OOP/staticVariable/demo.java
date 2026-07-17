package OOP.staticVariable;

class Student{
    String name;
    int age;
    int roll;
    static String college; // static variable
    static int numGround=5; // static variable
    static char grade; // static variable

    Student(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }

    // static block (use to initialize the static variable) [ pahle ye ban jaata hai uske baat object]
    static{
        grade='A';
    }
}

public class demo {
    public static void main(String[] args) {
        Student s1=new Student("Raj",27,149);
        Student s2=new Student("Ajesh",29,138);

        Student.college="IIT Guhati";
        System.out.println(s1.college);
        s1.college="IIT Bombay";
        System.out.println(s1.college);
        System.out.println(s2.college);
        System.out.println(s1.grade);
        System.out.println(s2.numGround);
    }
}
