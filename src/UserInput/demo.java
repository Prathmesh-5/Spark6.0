package UserInput;
import java.util.*;

public class demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int x= sc.nextInt();

        System.out.println("that number is = "+x);

        System.out.println("Enter name : ");
        String n=sc.next();
        System.out.println("that name is = "+n);

        sc.nextLine();

        System.out.println("Enter home full name : ");
        String nf=sc.next();
        System.out.println("that full name : "+nf);


    }
}
