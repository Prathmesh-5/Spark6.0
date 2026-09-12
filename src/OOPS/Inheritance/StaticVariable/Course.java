package OOPS.Inheritance.StaticVariable;

public class Course {
    String name="spark";
    static String institute="CFS";

    public static void main(String[] args) {
        Course c1=new Course();

        System.out.println(c1.name);
        System.out.println(institute);

        new Course().print();
    }

    void print(){
        System.out.println(name);
        System.out.println(institute);
    }


}
