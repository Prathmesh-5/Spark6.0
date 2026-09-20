package JAVA_8.FunctionalInterface.Function;
import java.util.function.Function;

public class demo {
    public static void main(String[] args) {

        Function<String,Integer> f=STR->STR.length();
        System.out.println("result = "+f.apply("Prathmesh"));
    }
}
