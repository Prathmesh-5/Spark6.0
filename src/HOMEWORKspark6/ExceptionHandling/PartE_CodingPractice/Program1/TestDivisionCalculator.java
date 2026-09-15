package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program1;
import java.util.*;
public class TestDivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DivisionCalculator d1= new DivisionCalculator();
        System.out.println("Enter first number : ");
        int a= sc.nextInt();
        System.out.println("Enter second number : ");
        int b= sc.nextInt();
        int res=-1;
        try{
            res=d1.divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println("not divisible by zero !");
        }
        finally{
            System.out.println("the result is : "+res);
            System.out.println("Program Completed");
        }

    }
}
