// isme hum apna khud ka Exception wala class banayege jiska name hai "ProductNotFoundException" and ye tab aana chahiye jab koi product na rahe

package ExceptionHandling.THROW.CustomException.CustomException1;

public class ProductNotFoundException extends RuntimeException{

    ProductNotFoundException(String msg){ // meri is wale class ke paas aisi koi power nahi hai jo console par exceptio wala message print kara de ; ye capability sirf Throwable wale class ke paas hai means super() ki help se hum log kara sakte hai print message console par
        super(msg);
    }

}
