package MultiThreading.MultiThreading11;

class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println("this "+i+" is print by thread name = "+Thread.currentThread().getName());
            try{
                Thread.sleep(3000,200);
                System.out.println("sleep for 3 sec and 200 nano second");
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}

public class SleepMethodDemo {
    public static void main(String[] args) {

    Thread1 t1=new Thread1();
    t1.start();

        System.out.println("This is main Thread ...");



    }
}
