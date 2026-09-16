package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program10;


public class BankAccount {
    double balance=2000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount>balance){
            throw new InsufficientBalanceException("nahi hai itna paise tumhare account mein !");
        }
        else{
            balance-=amount;
            System.out.println("sahi hai sab and available banlance = "+balance);
        }
    }
}
