package OOPS.Inheritance;

public class Employees {
    int id;
    String name;
    double salary;

    Employees(){
        System.out.println("employee constructor is called");
    }
}

class Developer extends Employees{
    String progLang;
    Developer(String x){
        System.out.println("jdbf");
    }
}

class Manager extends Employees{
    int teamSize;

    Manager(int c){
        System.out.println("manager constructor is called");
    }
}
