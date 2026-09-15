package ExceptionHandling.THROW.CustomException.CustomException4;
import java.util.*;
public class TestChoclate {
    public static void main(String[] args) throws ChoclateNotFoundException{
        Scanner sc = new Scanner(System.in);

        ChoclateService c1=new ChoclateService();
        System.out.println("Enter choclate id : ");
        int choclateID=sc.nextInt();

        c1.buyChoclate(choclateID);

        sc.close();
    }
}
