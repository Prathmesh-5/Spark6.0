package MultiThreading.MultiThreading5;

public class ThreadSetNameSetPriority2 {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(8);
        Thread.currentThread().setName("BOSS");
        System.out.println("priority = "+Thread.currentThread().getPriority());
        System.out.println("priority = "+Thread.currentThread().getName());
    }
}
