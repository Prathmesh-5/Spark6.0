package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program11;

public class InvalidloginException extends RuntimeException{
    InvalidloginException(String msg){
        super(msg);
    }
}
