package PrivateDemo;

public class BankTest {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.deposit(3000);
        System.out.println(b1.getBalance());

        
    }
}

