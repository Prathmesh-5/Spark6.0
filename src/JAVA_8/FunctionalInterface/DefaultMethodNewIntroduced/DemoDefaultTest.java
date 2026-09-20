package JAVA_8.FunctionalInterface.DefaultMethodNewIntroduced;

interface Car{
    public abstract void accelerate();

    public default void wheel(){
        System.out.println("wheel is great");
    }
}

class BMW implements Car{
    @Override
    public void accelerate(){
        System.out.println("BMW is accelarting");
    }

}

class AUDI implements Car{
    @Override
    public void accelerate(){
        System.out.println("AUDI is accelerating");
    }

    @Override
    public void wheel(){
        System.out.println("Wheel of AUDI very gripping");
    }
}

public class DemoDefaultTest {
    public static void main(String[] args) {

        BMW bmw1=new BMW();
        bmw1.accelerate();
        bmw1.wheel();

        AUDI audi1=new AUDI();
        audi1.accelerate();
        audi1.wheel();

    }
}
