package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program3;
import java.util.*;

public class StringToNumberConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string value : ");
        String value=sc.next();

        try {
            int num = Integer.parseInt(value);
            System.out.println("Converted integer: " + num);
        }
        catch(NumberFormatException e){
            System.out.println("please give integer string !");
        }
        finally{
            sc.close();
        }

    }
}
