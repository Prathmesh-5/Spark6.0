package OOP;

class Car{
    String name;
    String color;
    int year;
    double price;
    int horsepower;

    // default constructor (1)
    Car(){
        this.name="silia";
        this.color="grey";
        this.year=1980;
        this.price=1800000.8;
        this.horsepower=200;
        System.out.println("1st wale ko call laga");
    }

    // single parameterized constructor (2)
    Car(String name){
        this.name=name;
        System.out.println("2nd wale ko call laga");

    }

    // double parameter (3)
    Car(String name,String color){
        this.name=name;
        this.color=color;
        System.out.println("3rd wale ko call laga");

    }

    // (4)
    Car(String name,String color,int year){
        this.name=name;
        this.color=color;
        this.year=year;
        System.out.println("4th wale ko call laga");

    }

    // (5)
    Car(String name,String color,int year,double price){
        this.name=name;
        this.color=color;
        this.year=year;
        this.price=price;
        System.out.println("5th wale ko call laga");

    }

    // (6)
    Car(String name,String color,int year,double price,int horsepower){
        this.name=name;
        this.color=color;
        this.year=year;
        this.price=price;
        this.horsepower=horsepower;
        System.out.println("6th wale ko call laga");

    }

}

public class ConstructorOverload {
    public static void main(String[] args) {
        Car c1=new Car(); // 1st wale ko call lagega
        Car c2=new Car("BMW"); // 2nd wale ko call lagega
        Car c3=new Car("Mercedes","Black"); // 2nd wale ko call lagega
        Car c4=new Car("Range Rover","Golden",2025); // 3rd wale ko call lagega
        Car c5=new Car("Jaguar","Green",2020,13000000.4); // 4th wale ko call lagega
        Car c6=new Car("Rolls Royce","Granite",2026,158000000.4,500); // 4th wale ko call lagega

        System.out.println("\n*** 1st Car ***");
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.year);
        System.out.println(c1.price);
        System.out.println(c1.horsepower);

        System.out.println("\n*** 2nd Car ***");
        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.year);
        System.out.println(c2.price);
        System.out.println(c2.horsepower);

        System.out.println("\n*** 3rd Car ***");
        System.out.println(c3.name);
        System.out.println(c3.color);
        System.out.println(c3.year);
        System.out.println(c3.price);
        System.out.println(c3.horsepower);

        System.out.println("\n*** 4th Car ***");
        System.out.println(c4.name);
        System.out.println(c4.color);
        System.out.println(c4.year);
        System.out.println(c4.price);
        System.out.println(c4.horsepower);

        System.out.println("\n*** 5th Car ***");
        System.out.println(c5.name);
        System.out.println(c5.color);
        System.out.println(c5.year);
        System.out.println(c5.price);
        System.out.println(c5.horsepower);

        System.out.println("\n*** 6th Car ***");
        System.out.println(c6.name);
        System.out.println(c6.color);
        System.out.println(c6.year);
        System.out.println(c6.price);
        System.out.println(c6.horsepower);
    }
}
