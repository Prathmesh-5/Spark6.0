package PrivateDemo;

public class BankAccount {
    private double balance;

    void deposit(double ammount){
        if(ammount>0) balance+=ammount;
    }

    double getBalance(){
        return balance;
    }
}

class Child extends BankAccount{

}
