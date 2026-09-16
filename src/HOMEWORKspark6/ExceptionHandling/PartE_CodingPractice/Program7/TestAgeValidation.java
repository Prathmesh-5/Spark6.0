package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program7;
import java.util.*;

public class TestAgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgeValidationUsingThrow age1=new AgeValidationUsingThrow();
        System.out.println("Enter age : ");
        int age= sc.nextInt();

        try{
            age1.check(age);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}


