package MultiThreading.MultiThreading1;


// Method 2
class MyThread2 implements Runnable{

    @Override
    public void run(){
        for(int i=1;i<=7;i++){
            System.out.println(i+" is printed by the t2 Thread but in reality JVM gives this Thread a specific name = "+Thread.currentThread().getName());
        }
    }
}


// Method 1
class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=1;i<=9;i++){
            System.out.println(i+" is printed by the t1 Thread but in reality JVM gives this Thread a specific name = "+Thread.currentThread().getName());
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {


        // creating thread by extends Thread Class (1st method)
        MyThread t1=new MyThread(); // idhar bas Object bana
        t1.start(); // thread will craete here


        // creating thread by implementing Runnable Interface (2nd best Method)
        MyThread2 t2=new MyThread2();
        Thread thread=new Thread(t2);
        thread.start();


        // ye wala task to apna main thread hi kar dega
        for(int i=1;i<=5;i++){
            System.out.println(i+" is printed by the main Thread but in reality JVM gives this Thread a specific name = "+Thread.currentThread().getName());
        }
    }
}
