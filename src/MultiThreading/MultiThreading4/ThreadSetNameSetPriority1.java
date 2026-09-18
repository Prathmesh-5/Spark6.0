package MultiThreading.MultiThreading4;

public class ThreadSetNameSetPriority1 {
    public static void main(String[] args) {

        // main thread ka priority and name bhi change kar diye hum
        Thread mainThread=Thread.currentThread();
        mainThread.setPriority(7);
        mainThread.setName("BOSSthread");
        System.out.println("name = "+mainThread.getName());
        System.out.println("pri = "+mainThread.getPriority());
        System.out.println(mainThread.getState());

    }
}
