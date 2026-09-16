package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program7;

public class AgeValidationUsingThrow {
    void check(int age){
        if(age<18){
            throw new IllegalArgumentException("not to vote 18 se kam ke ho tum !");
        }
        System.out.println("allowed to vote");
    }
}
