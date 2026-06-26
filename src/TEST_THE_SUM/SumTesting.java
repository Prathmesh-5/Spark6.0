package TEST_THE_SUM;

public class SumTesting {
    public static void main(String[] args) {
        Sum s1=new Sum();
        int x=5,y=10;
        int ans=s1.add(x,y);
        System.out.println("the sum of "+x+" & "+y+" is = "+ans);
    }
}
