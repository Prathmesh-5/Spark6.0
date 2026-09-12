package AbstractClass;

abstract class Car {

    void start(){
        System.out.println("define hai start pahle se");
    }


    abstract void breaks();
    abstract void accelerate();
}

class BMW extends Car{
    @Override
    void breaks(){
        System.out.println("ab idhar break bhi define ho gaya BMW ke liye");
    }

    @Override
    void accelerate(){
        System.out.println("ab idhar accelerate bhi define ho gaya BMW ke liye");
    }
}


