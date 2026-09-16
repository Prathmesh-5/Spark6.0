package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program8;
import java.io.FileNotFoundException;
import java.util.*;
public class TestFileService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileService f1=new FileService();

        System.out.println("Enter file name : ");
        String fileName=sc.next();

       try{
           f1.readFile(fileName);
           System.out.println("File is readed successfully");
       }
       catch(FileNotFoundException e){
           System.out.println("file nahi hai!");
       }
       finally{

       }

    }
}
