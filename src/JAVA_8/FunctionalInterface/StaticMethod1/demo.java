package JAVA_8.FunctionalInterface.StaticMethod1;

interface Car{
    public abstract void accelerate();

    // static wala (implementation wale class ke liye ye invisible hai)
    public static void wheel(){
        System.out.println("This is wheel");
    }

    // default wala
    public default void engine(){
        System.out.println("This is engine");
    }
}

class bmw implements Car{
    @Override
    public void accelerate(){
        System.out.println("Acceleration is more good");
    }

    public void wheel(){     // ye ek naya alag method hai koi bhi override nahi hua hai (isko to uper wlaa dikh hi nahi raha hai)
        System.out.println("This is bmw wheel");
    }

}

public class demo {
    public static void main(String[] args) {
        bmw b=new bmw();
        b.accelerate();
        b.wheel(); // ye ek normal method tha aise hi implementation class mein (to normal call ho jayega jaise sabka karte ho)
        b.engine();
        Car.wheel(); // static wala aise call hoga
    }
}
