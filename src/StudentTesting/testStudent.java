package StudentTesting;

import StudentTesting.Student;

public class testStudent {
    public static void main(String[] args) {

        Student s1=new Student("Tanya",34,true);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.result);
    }
}
