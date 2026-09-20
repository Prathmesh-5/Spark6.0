package JAVA_8.FunctionalInterface.DefaultMethodNewIntroduced1;

interface Samsung{
public abstract void accelerate();
}

interface Apple{
    public abstract void greet();
}

class Mobiles implements Samsung,Apple {
    @Override
    public void accelerate() {
        System.out.println("BMW is accelarting");
    }

    @Override
    public void greet() {
        System.out.println("hello good morning");
    }
}

public class MultipleInterface1 {
    public static void main(String[] args) {

        Mobiles m1=new Mobiles();
        m1.accelerate();
        m1.greet();

    }
}

