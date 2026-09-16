package HOMEWORKspark6.ExceptionHandling.PartE_CodingPractice.Program8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileService{

    void readFile(String fileName) throws FileNotFoundException{
        FileReader reader=new FileReader(fileName);
    }

}
