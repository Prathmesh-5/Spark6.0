package MultiThreading.MultiThreading9;

class Thread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("priority = "+Thread.currentThread().getPriority());
        System.out.println("name = "+Thread.currentThread().getName());
    }
}

public class ThreadSetNameSetPriority6 {
    public static void main(String[] args) {

        Thread1 t1=new Thread1(); // Runnable interface ke child (Thread1) ka bas object banaye hai (t1); task idhar hai
        Thread thread=new Thread(t1,"childThread"); // aise bhi name set kar sakte ho kyuki Thread class mein dher tareke ke constructor available hai
        thread.setPriority(5);
        thread.start();

    }

}
