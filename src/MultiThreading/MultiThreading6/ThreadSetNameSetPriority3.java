package MultiThreading.MultiThreading6;

class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("mera thread ka name = "+Thread.currentThread().getName());
        System.out.println("mera thread ka priority = "+Thread.currentThread().getPriority());
    }
}

public class ThreadSetNameSetPriority3 {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        t1.setPriority(6);
        t1.setName("childThread");
        t1.start();
    }
}
