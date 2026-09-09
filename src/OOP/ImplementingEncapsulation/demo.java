package OOP.ImplementingEncapsulation;

// ------ bank class ----------------
class BankAC{
    private double balance;
    public void deposit(double amt){
        balance+=amt;
    }
    public void withdraw(double amt){
        balance-=amt;
    }
    public void checkBalance(){
        System.out.println("your balance is = "+balance);
    }
}

// -------student class ---------------

class Student{
    private String name;
    private int roll;
    private int age;
    private String college;

    Student(String name,int roll,int age,String college){
        this.name=name;
        this.age=age;
        this.roll=roll;
        this.college=college;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}



// *******************************************************************
public class demo {
    public static void main(String[] args) {

        BankAC b1=new BankAC();

        b1.checkBalance();
        b1.deposit(5000);
        b1.checkBalance();
        b1.withdraw(1000);
        b1.deposit(200);
        b1.checkBalance();

        Student s1=new Student("Soniya",86,23,"ABCDEF");
        System.out.println(s1.getName());
        s1.setName("Priya");
        System.out.println(s1.getName());

    }
}

// *******************************************************************
