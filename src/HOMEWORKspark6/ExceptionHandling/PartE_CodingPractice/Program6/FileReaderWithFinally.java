package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program6;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileReaderWithFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name you want to open : ");
        String fileName=sc.next();

        FileReader reader=null;

        try{
            reader=new FileReader(fileName);
            System.out.println("File is Opened");
        }
        catch (IOException e) {
            System.out.println("Error while opening file");
        }


        finally{
            try{
                if(reader!=null){
                    reader.close();
                    System.out.println("File closed successfully");
                }
            }
            catch(IOException e){
                System.out.println("Error while closing file");
            }
        }

    }

}
