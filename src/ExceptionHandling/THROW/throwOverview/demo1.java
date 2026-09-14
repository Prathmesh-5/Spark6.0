package ExceptionHandling.THROW.throwOverview;
import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();

        if(age<18){
            try{
                throw new ArithmeticException("please age 18 ya uske uper rahega to hi vote kar sakte ho !");
            }
            catch(ArithmeticException e){
                System.out.println("not allowed to vote");
            }
        }
        else{
            System.out.println("you are allowed to vote");
        }

        sc.close();
    }
}
