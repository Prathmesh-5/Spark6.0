package MultiThreading.MultiThreading8;

class Thread1 implements Runnable{
    @Override
    public void run(){
        Thread trd=Thread.currentThread();
        trd.setPriority(9);
        trd.setName("childThread");

        System.out.println("priority = "+trd.getPriority());
        System.out.println("name = "+trd.getName());
    }
}

public class ThreadSetNameSetPriority5 {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        Thread thread=new Thread(t1);
        thread.start();

    }
}
