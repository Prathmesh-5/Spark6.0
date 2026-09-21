package MultiThreading.MultiThreading13;

class Payment implements Runnable{
    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(5000,600);
            System.out.println("Payment is Compleete ...");
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}

public class joinMethodDemo {
    public static void main(String[] args) {

        Payment p=new Payment();
        Thread thread=new Thread(p);
        thread.start();

        try{
            thread.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Payment ke baad suuccessfully notification chaala gaya ...");

    }
}
