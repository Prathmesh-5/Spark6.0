package MethodOverriding;

class Payment{
    void pay(){
        System.out.println("Generic Payment");
    }
}

class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Payment by using UPI");
    }
}

public class MethodOverRide {
    public static void main(String[] args) {
        Payment payment=new Payment();
        payment.pay();
        System.out.println("---------------------");
        UPI upiPayment=new UPI();
        upiPayment.pay();


        // parent refrence can hold child object
        Payment parent=new UPI(); // upcasting parent hold child on his lap
        parent.pay();

    }
}
