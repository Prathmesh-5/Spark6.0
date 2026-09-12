package InterfaceDemo;

public interface Car {
    int wheel=4; // actually mein ye instace variable nahi hai
    // ye kuch aisa likha hai --->>   public static final int wheel=4;

    // no constructor
    // no object of interface
    // contract hai
    // saare ke saare incomplete method hi hoge and sabko define karna compulsary hai yehi to hai contract

    void accelerate();
    void start();
    void brake();
}

class BMW implements Car{
    BMW b1=new BMW();

    BMW(){
        super();
    }

    @Override
    public void accelerate(){
        System.out.println("accelerate defined");
    }

    @Override

    public void start(){
        System.out.println("start defined");
    }

    @Override
    public void brake(){
        System.out.println("brake defined");
        System.out.println(Car.wheel);
    }



}
