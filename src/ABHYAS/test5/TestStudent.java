package ABHYAS.test5;
import ABHYAS.test5.Student;

public class TestStudent {
    public static void main(String[] args){
        Student s1=new Student();
        s1.age=59;
        System.out.println("student ki age = "+s1.age);
        System.out.println("student ki name = "+s1.name);
        s1.studying();

    }
}
