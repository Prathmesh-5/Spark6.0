package OOP.SimpleInheritance1stType;

public class demo {
    public static void main(String[] args) {
        EngStudent e1=new EngStudent();

        e1.attendLab();
        e1.markAttendence();
        e1.name="Ranu";
        e1.age=17;

        Student s1=new Student();

        s1.markAttendence();
    }

}

class Student{
    String name;
    int age;

    void markAttendence(){
        System.out.println("Attendence is marked");
    }
}

class EngStudent extends Student{

    void attendLab(){
        System.out.println("Lab Attented");
    }
}

