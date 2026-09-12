package Encapsulation;
import Encapsulation.BankAccount;

public class TestBank {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();

        b1.deposit(4500);
        b1.deposit(200);
        System.out.println(b1.getBalance());
    }
}
