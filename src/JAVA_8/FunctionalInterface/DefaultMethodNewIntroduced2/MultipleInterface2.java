package JAVA_8.FunctionalInterface.DefaultMethodNewIntroduced2;

interface Samsung{
    public abstract void setting();
}

interface Apple{
    public abstract void setting();
}

class Mobiles implements Samsung,Apple{
    @Override
public void setting() {
        System.out.println("setting are good");
}

}

public class MultipleInterface2 {
    public static void main(String[] args) {

        Mobiles m=new Mobiles();
        m.setting();

    }
}












