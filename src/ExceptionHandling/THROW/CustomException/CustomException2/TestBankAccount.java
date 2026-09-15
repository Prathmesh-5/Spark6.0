package ExceptionHandling.THROW.CustomException.CustomException2;
import java.util.*;

public class TestBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b1=new BankAccount();

        System.out.println("Enter how much money you want to withdraw : ");
        double amount=sc.nextDouble();

        b1.withdraw(amount);

        sc.close();

    }
}
