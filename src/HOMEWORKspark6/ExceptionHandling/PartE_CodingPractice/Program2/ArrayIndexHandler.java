package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program2;
import java.util.*;

public class ArrayIndexHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,22,42,11,85};


        int element=-1;
        try{
            System.out.println("enter index : ");
            int idx = sc.nextInt();
            element=arr[idx];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ye index out of bound hai !");
        }
        catch(InputMismatchException e){
            System.out.println("invalid data type ka input diye ho !");
        }

        System.out.println("The element is : "+element);

        sc.close();
    }
}
