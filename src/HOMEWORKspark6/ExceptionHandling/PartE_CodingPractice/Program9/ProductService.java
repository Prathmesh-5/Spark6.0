package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program9;

public class ProductService {

    void findProduct(int productID){
        if(productID!=101){
            try{
                throw new ProductNotFoundException("ye wala product abhi available nahi hai !");
            }
            catch(ProductNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("yes this product is available");
        }
    }
}
