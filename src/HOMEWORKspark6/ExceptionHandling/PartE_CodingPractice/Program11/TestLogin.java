package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program11;
import java.util.*;
public class TestLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginService l1=new LoginService();

        System.out.println("Enter username : ");
        String userName=sc.next();

        System.out.println("Enter password : ");
        String password=sc.next();

        try{
            l1.login(userName,password);
        }
        catch(InvalidloginException e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
