package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program10;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
