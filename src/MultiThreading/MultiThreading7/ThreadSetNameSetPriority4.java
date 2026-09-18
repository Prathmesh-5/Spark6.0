package MultiThreading.MultiThreading7;


class Thread1 extends Thread{
    @Override
    public void run(){
        Thread trd=Thread.currentThread();
        trd.setName("BOSS");
        trd.setPriority(3);
        System.out.println("mera thread ka name = "+trd.getName());
        System.out.println("mera thread ka priority = "+trd.getPriority());
    }
}

public class ThreadSetNameSetPriority4 {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();

        t1.start();
    }
}
