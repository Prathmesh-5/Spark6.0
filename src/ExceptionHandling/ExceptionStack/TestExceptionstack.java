package ExceptionHandling.ExceptionStack;

public class TestExceptionstack {
    public static void main(String[] args) {
        CFS1();
    }

    public static void CFS1(){
        CFS2();
    }

    public static void CFS2(){
        CFS3();
    }

    public static void CFS3(){
        CFS4();
    }

    public static void CFS4(){
        CFS5();
    }

    public static void CFS5(){
        System.out.println(10/0);
    }


}
