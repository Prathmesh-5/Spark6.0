package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program9;

public class ProductNotFoundException extends RuntimeException{
    ProductNotFoundException(String msg){
        super(msg);
    }
}
