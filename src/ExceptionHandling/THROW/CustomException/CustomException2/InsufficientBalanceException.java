package ExceptionHandling.THROW.CustomException.CustomException2;

public class InsufficientBalanceException extends Exception{ // partial checked wala hai means hume aage pura force kiya jayega handle karne ko

    InsufficientBalanceException(String msg){
        super(msg);
    }
}
