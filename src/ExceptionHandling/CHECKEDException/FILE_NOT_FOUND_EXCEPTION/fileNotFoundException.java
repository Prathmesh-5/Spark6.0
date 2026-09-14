package ExceptionHandling.CHECKEDException.FILE_NOT_FOUND_EXCEPTION;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileNotFoundException {
    public static void main(String[] args) {

            try{
                System.out.println("line1");
                FileReader fileReader=new FileReader("data.txt");
                System.out.println("line2");
            }

            catch (FileNotFoundException e){
                System.out.println("aisa koi file hai hi nahi !");
            }


    }
}
