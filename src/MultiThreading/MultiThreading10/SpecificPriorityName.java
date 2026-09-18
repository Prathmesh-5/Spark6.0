package MultiThreading.MultiThreading10;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        Thread trd=Thread.currentThread();


        System.out.println("priority = "+trd.getPriority()+" and name = "+trd.getName());

    }
}

public class SpecificPriorityName {
    public static void main(String[] args) {
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Thread thread1=new Thread(new MyRunnable(),"childThread1");
        Thread thread2=new Thread(new MyRunnable(),"childThread2");
        thread2.setPriority(Thread.MIN_PRIORITY+2);
        thread1.start();
        thread2.start();

        System.out.println("priority = "+Thread.currentThread().getPriority()+" and name = "+Thread.currentThread().getName());

    }
}
