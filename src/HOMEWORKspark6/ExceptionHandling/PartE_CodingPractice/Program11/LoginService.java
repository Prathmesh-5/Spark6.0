package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program11;

public class LoginService {

    void login(String userName,String password){
        if(!userName.equals("admin")  || !password.equals("java123")){
            throw new InvalidloginException("soory credentials are wrong!");
        }
        else{
            System.out.println("*** WELCOME ***");
        }
    }
}
