class Student{
    int age;
    String name;
    float height;

    void study(){
        System.out.println("student is studying");
    }
}

public class TestStudent {
    public static void main(String[] args) {

        Student s1=new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.age=20;
        s1.name="anya";
        s1.height=5.6f;

        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.study();

        Student s2=new Student();


    }
}
