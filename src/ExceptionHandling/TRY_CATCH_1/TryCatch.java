package ExceptionHandling.TRY_CATCH_1;

public class TryCatch {
    public static void main(String[] args) {

        try{
            System.out.println("line 1");

            int result=10/0;
            System.out.println("line 2");
        }
        catch (IndexOutOfBoundsException e){

            System.out.println("invalid division !");

        }


    }
}
