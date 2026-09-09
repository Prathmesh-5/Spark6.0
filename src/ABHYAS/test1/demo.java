package ABHYAS.test1;

class Student{
    int age;
    float height;
    String name;

    void study(){
        System.out.println("studying");
    }
}

public class demo {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        s1.age=14;
        s1.name="Rahul";
        s1.height=6.1f;
        s1.study();
        System.out.println(s1.age);
        System.out.println(s1.height);
        System.out.println(s1.name);
    }

}
