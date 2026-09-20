package JAVA_8.FunctionalInterface.FunctionalInterface1;


@FunctionalInterface
interface jadu{
    public abstract void m1();
}

/*
class jadu1 implements jadu{
    @Override
    public void m1(){
        System.out.println("hi i am Hero");
    }
}
 */

public class demo1 {
    public static void main(String[] args) {
        jadu j=()-> System.out.println("hi i am Hero");
        j.m1();
    }
}
