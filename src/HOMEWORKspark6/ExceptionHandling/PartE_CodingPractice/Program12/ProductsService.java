package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program12;

public class ProductsService {

    void getProductById(int productId){
        if(productId<=0){
            throw new InvalidProductIdException("soory bhai invalid id hai !");
        }
        else if(productId!=101){
            throw new ProductNotFoundedException("soory tumhara product not found !");
        }
        else{
            System.out.println("*** printing product details ***");
        }
    }
}
