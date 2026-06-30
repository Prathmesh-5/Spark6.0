package OOP;

class Student1{
    String name;
    int age;
    int roll;
    String college;

    Student1(){ //normal initialization constructor
        name="Aditya";
        age=28;
        roll=101;
        college="IIT";
    }

    Student1(String name,int age,int roll,String college){ // Parameterized Constructor
        this.name=name;
        this.age=age;
        this.roll=roll;
        this.college=college;
    };

}
public class Constructor1 {
    public static void main(String[] args) {
        Student1 s=new Student1();
        System.out.println(s.name);
        System.out.println(s.age);

        Student1 s2=new Student1("raj",10,50,"IIT");
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
