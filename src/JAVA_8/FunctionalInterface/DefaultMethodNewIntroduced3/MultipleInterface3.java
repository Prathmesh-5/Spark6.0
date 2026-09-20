package JAVA_8.FunctionalInterface.DefaultMethodNewIntroduced3;

interface Samsung{
    public abstract void display();

    public default void setting(){
        System.out.println("This is the setting of SAMSUNG");
    }
}

interface Apple{
    public abstract void display();

    public default void setting(){
        System.out.println("This is the setting of APPLE");
    }
}

class mobile implements Samsung,Apple{
    @Override
    public void display(){
        System.out.println("This is dispaly");
    }

    @Override
    public void setting(){
        Apple.super.setting();
    }
}

public class MultipleInterface3 {
    public static void main(String[] args) {

        mobile m=new mobile();
        m.display();
        m.setting();
    }
}
