package ExceptionHandling.THROW.CustomException.CustomException3;
import java.util.*;

public class Testbank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount1 b1=new BankAccount1();
        double amount=sc.nextDouble();

        b1.withdraw(amount);

        sc.close();
    }
}
