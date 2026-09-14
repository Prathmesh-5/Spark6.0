package ExceptionHandling.THROW.CustomException.CustomException2;

public class InsufficientBalanceException extends RuntimeException{

    InsufficientBalanceException(String msg){
        super(msg);
    }
}
