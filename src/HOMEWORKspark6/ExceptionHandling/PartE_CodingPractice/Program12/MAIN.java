package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program12;
import java.util.*;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductsService p1=new ProductsService();

        System.out.println("Enter product ID : ");
        int productID=sc.nextInt();

        try{
            p1.getProductById(productID);
        }
        catch(InvalidProductIdException e){
            System.out.println(e.getMessage());
        }
        catch(ProductNotFoundedException e){
            System.out.println(e.getMessage());
        }
    }
}
