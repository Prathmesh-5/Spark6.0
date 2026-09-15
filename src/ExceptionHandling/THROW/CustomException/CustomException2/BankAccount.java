package ExceptionHandling.THROW.CustomException.CustomException2;

public class BankAccount {
    double currBalance=2000;

    void withdraw(double amount){ // paise nikalna hai
        if(amount>currBalance){
            try{
                throw new InsufficientBalanceException("Sorry you have insuffienct balance !");
            }
            catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        }
        else {
            currBalance -= amount;
            System.out.println("Thanks for withdrawing and now your available balance is : " + currBalance);
        }
    }

}
