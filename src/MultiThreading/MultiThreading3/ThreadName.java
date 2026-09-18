package MultiThreading.MultiThreading3;

class Thread1 implements Runnable{
    Thread t2=Thread.currentThread();
    @Override
    public void run(){
        System.out.println("ye t1 thread hai "+Thread.currentThread().getName());
    }
}

public class ThreadName {
    public static void main(String[] args) {
//        Thread1 t1=new Thread1();
//        t1.start();

        Thread1 t1=new Thread1();
        Thread thread=new Thread(t1);
        thread.start();

        System.out.println("ye main thread hai"+Thread.currentThread().getName());

    }

}
