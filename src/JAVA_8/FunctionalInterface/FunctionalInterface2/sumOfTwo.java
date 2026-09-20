package JAVA_8.FunctionalInterface.FunctionalInterface2;

@FunctionalInterface
interface Summing{
    public abstract int add(int a,int b);
}

//class sum1 implements Summing{
//    @Override
//    public int add(int a,int b){
//        return a+b;
//    }
//}

public class sumOfTwo {
    public static void main(String[] args) {

//        sum1 s1=new sum1();
//        s1.add(2,3);

        Summing s=(a,b)->a+b;
        System.out.println(s.add(2,3));


    }
}
