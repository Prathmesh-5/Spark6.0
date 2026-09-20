package JAVA_8.FunctionalInterface.Predicate.Predicate2;

import java.util.function.Predicate;
import java.util.*;

public class LengthOfStringGreaterThan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Predicate<String> p=STR->STR.length()>5;
        System.out.println("Enter any string : ");
        String STR=sc.next();
        System.out.println("result = "+p.test(STR));

        sc.close();
    }

}
