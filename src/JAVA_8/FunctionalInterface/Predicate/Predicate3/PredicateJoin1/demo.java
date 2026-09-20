package JAVA_8.FunctionalInterface.Predicate.Predicate3.PredicateJoin1;

import java.util.function.Predicate;


public class demo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        Predicate<Integer> p1=n1->n1%2==0;
        Predicate<Integer> p2=n2->n2>2;


        System.out.println("-------------p1 wala-----------------");
        show(p1,arr);
        System.out.println("-------------p2 wala-----------------");
        show(p2,arr);
        System.out.println("--------------p1.and(p2)----------------");
        show(p1.and(p2),arr);
        System.out.println("---------------p1.or(p2)---------------");
        show(p1.or(p2),arr);
        System.out.println("---------------p1.negate()---------------");
        show(p1.negate(),arr);
        System.out.println("------------------p2.negate()------------");
        show(p2.negate(),arr);

    }

    public static void show(Predicate<Integer> p, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(p.test(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
