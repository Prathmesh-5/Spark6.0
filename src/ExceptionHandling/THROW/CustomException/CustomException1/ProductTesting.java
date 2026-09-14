package ExceptionHandling.THROW.CustomException.CustomException1;
import java.util.*;

public class ProductTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductService p1=new ProductService();

        System.out.println("Enter the product id to buy that product : ");
        int productID=sc.nextInt();

        // exception handeled
        try{
            p1.findProduct(productID);
        }
        catch(ProductNotFoundException e){
            System.out.println(e.getMessage()); // e.getMessage() se wahi console wala message print hoga
        }

        sc.close();

    }
}
