package ExceptionHandling.THROW.CustomException.CustomException1;

public class ProductService {

    void findProduct(int productID){
        if(productID>=100 && productID<=150){ // ye product nahi hai mere paas idhar hum exception message throw kar de
            throw new ProductNotFoundException("I am sorry this product is currently not available !");
        }
        System.out.println("Thanks for buying our product");
    }
}
