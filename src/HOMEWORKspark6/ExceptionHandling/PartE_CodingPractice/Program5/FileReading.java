package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) {

        try{
            FileReader reader=new FileReader("student.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("this file is not exist");
        }
    }
}
