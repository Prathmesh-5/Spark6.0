package ExceptionHandling.TRY_CATCH;
import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");
        int a=sc.nextInt();

        System.out.println("enter second number: ");
        int b=sc.nextInt();
        int result;
        try{
            result=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("You are Doing Invalid Division !");
            result=-1;
        }

        System.out.println("program completed and result = "+result);
    }
}
