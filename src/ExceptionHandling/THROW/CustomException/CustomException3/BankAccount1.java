package ExceptionHandling.THROW.CustomException.CustomException3;

public class BankAccount1 {
    double currBalance=2000;

    void withdraw(double amount){
        if(amount>currBalance){
            try{
                throw new InsufficientException("tumhare paas intna amount nahi hai withdraw karne ko");
            }
            catch(InsufficientException e){
                System.out.println(e.getMessage());
            }
        }
        else {
            currBalance -= amount;
            System.out.println("thanks for withdrwaing and now you available balance is : " + currBalance);
        }
    }

}
