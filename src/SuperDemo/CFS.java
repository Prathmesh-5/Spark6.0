package SuperDemo;

public class CFS {
    String name="code for success ....";

    CFS(){
        System.out.println("CFS default constructor .....");
    }
}

class course extends CFS{
    String name="Spark 6.0";
    // par isme to iske parent wala bhi name hoga name="code for success ...."
    course(){
        System.out.println("course default constructor ....");
    }

    void displayAllName(){
        System.out.println(name); // Spark 6.0
        System.out.println(super.name); // code for success ....
    }
}


