package ABHYAS.test5;

class StudentPrinter{
    void printer(Student st1){
        System.out.println(st1.name);
        System.out.println(st1.age);
    }

    Student getStudentObject(){
        Student x=new Student();
        x.name="tyuuy";
        x.age=55;
        return x;
    }
}


public class PassingObject {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Ishita";
        s.age=23;

        StudentPrinter sp=new StudentPrinter();

        sp.printer(s);

        Student y=sp.getStudentObject();
        System.out.println(y.name+" "+y.age);

    }
}
