package JAVA_8.FunctionalInterface.FunctionalInterface3;

@FunctionalInterface
interface Greeting{
    public abstract void greet();
}

class ABC{
    int x=46; // instance variable

    public void show(){
        int x=100;
        // ab iske under hum LAMDA expression likhege  (ye khud ek statement ki tarah hai method nahi)
        Greeting g=()->{
            System.out.println(x); // tum show ke local variable ko apne lambda expression mein use kar liye to ab ye x final ban chuka hai menas phir se reInitialize nahi kar sakoge
            System.out.println(this.x);// instance variable wala print hoga
            this.x=7788;  // ye kar sakte ho kyuki ye instance variable hai
        };
        g.greet();
        System.out.println(x); // 100
    }
}

public class LocalVariableInLamdaExpression {
    public static void main(String[] args) {

        ABC a1=new ABC();
        a1.show();

    }
}
