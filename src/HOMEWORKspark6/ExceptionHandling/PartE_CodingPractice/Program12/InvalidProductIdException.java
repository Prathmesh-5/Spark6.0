package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program12;

public class InvalidProductIdException extends RuntimeException{
    InvalidProductIdException(String msg){
        super(msg);
    }
}
