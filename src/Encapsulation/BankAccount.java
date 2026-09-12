package Encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amt){
        if(amt>0) balance+=amt;
    }


    // getter
    public double getBalance(){
        return balance;
    }

}
