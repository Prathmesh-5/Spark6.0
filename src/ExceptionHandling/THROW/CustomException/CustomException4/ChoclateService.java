package ExceptionHandling.THROW.CustomException.CustomException4;

public class ChoclateService {

    void buyChoclate(int choclateID) throws ChoclateNotFoundException{

        if(choclateID<50){
                throw new ChoclateNotFoundException("nahi hai ye wala choclate !");
        }

            System.out.println("choclate buyed succesfully");


    }
}
