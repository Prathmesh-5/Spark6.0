package OOP;

class Plane{
    String name;
    int numPlane;
    float size;
    String color;
    char grade;

    Plane(){
        this("unknown");
        System.out.println("1st called");

    }

    Plane(String name){
        this(name,0);
        System.out.println("2nd called");
    }

    Plane(String name,int numPlane){
        this(name,numPlane,0.0f);
        System.out.println("3rd called");

    }

    Plane(String name,int numPlane,float size){
        this(name,numPlane,size,"unknown");
        System.out.println("4th called");

    }

    Plane(String name,int numPlane,float size,String color){
        this(name,numPlane,size,color,'u');
        System.out.println("5th called");

    }

    Plane(String name,int numPlane,float size, String color,char grade){
        this.name=name;
        this.numPlane=numPlane;
        this.size=size;
        this.color=color;
        this.grade=grade;
        System.out.println("6th called");
    }


}

public class ChainingMethod2 {
    public static void main(String[] args) {
        Plane p1=new Plane();
        Plane p2=new Plane("Boing");
        Plane p3=new Plane("Airbus A320",102);
        Plane p4=new Plane("Boeing 777",103,73.9f);
        Plane p5=new Plane("Airbus A380",104,72.7f,"white");
        Plane p6=new Plane("Dassault Falcon",105,88.9f,"Purple",'A');

        System.out.println(p1.name);
        System.out.println(p1.numPlane);
        System.out.println(p1.size);
        System.out.println(p1.color);
        System.out.println(p1.grade);

        System.out.println(p2.name);
        System.out.println(p2.numPlane);
        System.out.println(p2.size);
        System.out.println(p2.color);
        System.out.println(p2.grade);

        System.out.println(p3.name);
        System.out.println(p3.numPlane);
        System.out.println(p3.size);
        System.out.println(p3.color);
        System.out.println(p3.grade);

        System.out.println(p4.name);
        System.out.println(p4.numPlane);
        System.out.println(p4.size);
        System.out.println(p4.color);
        System.out.println(p4.grade);

        System.out.println(p5.name);
        System.out.println(p5.numPlane);
        System.out.println(p5.size);
        System.out.println(p5.color);
        System.out.println(p5.grade);

        System.out.println(p6.name);
        System.out.println(p6.numPlane);
        System.out.println(p6.size);
        System.out.println(p6.color);
        System.out.println(p6.grade);

    }
}
