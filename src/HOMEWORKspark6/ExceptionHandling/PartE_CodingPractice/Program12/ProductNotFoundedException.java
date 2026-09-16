package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program12;

public class ProductNotFoundedException extends RuntimeException{
    ProductNotFoundedException(String msg){
        super(msg);
    }
}
