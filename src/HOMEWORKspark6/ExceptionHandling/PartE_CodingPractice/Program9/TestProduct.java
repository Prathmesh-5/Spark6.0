package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program9;
import java.util.*;
public class TestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService p1 =new ProductService();

        System.out.println("Enter product ID : ");
        int productID=sc.nextInt();

        p1.findProduct(productID);

        sc.close();
    }
}
