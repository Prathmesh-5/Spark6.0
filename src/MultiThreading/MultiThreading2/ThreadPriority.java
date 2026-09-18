package MultiThreading.MultiThreading2;

class Mythread3 extends Thread{
    @Override
    public void run(){
        System.out.println("running ... and JVM jo thread ka name rakha hai wo hai ab hum bata diye the ki change kar lo = "+Thread.currentThread().getName()+" and iski priority check karte hai = "+ Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {

        // main wale thread ki priority change kar rahe hai
        Thread.currentThread().setPriority(10);
        int y=Thread.currentThread().getPriority();

        // main thread ka name change karke "BossThread" rakh rahe hai
        Thread.currentThread().setName("BossThread");


        Mythread3 t1=new Mythread3();

        // t1 wale thread ki priority change kar rahe hai
        t1.setPriority(4);

        // t1 wale thread ka name change karke "AnurajThread" rakh rahe hai
        t1.setName("AnurajThread");

        // creating t1 thread
        t1.start();


        System.out.println("main thread wale ki priority hai "+y);
        System.out.println("hi i think i am run by main and JVM jo thread ka name rakha hai wo hai = "+Thread.currentThread().getName());

    }
}
