package JAVA_8.FunctionalInterface.Predicate.Predicate1;
import java.util.function.Predicate;
import java.util.*;

public class CheckIntegerGreaterThan50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Predicate<Integer> p=x->x>50;
        System.out.println("enter any number to check : ");
        int x=sc.nextInt();
        System.out.println("The result is = "+p.test(x));
    }
}
