package MultiThreading.MultiThreading12;

class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            Thread.yield(); // yaha par child thread tyag karne ko tayaar hai apna chance dusre Threads ko dene ke liye
        }
    }
}

public class YieldMethodDemo {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        t1.start();

        for(int i=0;i<=5;i++) {
            System.out.println("I am main thread");
        }
    }
}
