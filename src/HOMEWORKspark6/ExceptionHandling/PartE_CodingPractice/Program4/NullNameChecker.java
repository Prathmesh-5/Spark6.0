package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program4;
public class NullNameChecker {

    static void printNameLength(String name){
        try{
            System.out.println("name ki length = "+name.length());
        }
        catch (NullPointerException e){
            System.out.println("Name is null");
        }
    }
    public static void main(String[] args) {
        printNameLength(null);
        printNameLength("raj chauhan");

    }
}
