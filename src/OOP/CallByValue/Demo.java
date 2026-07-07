package OOP.CallByValue;

// call by value example
public class Demo {
    public static void main(String[] args) {
        int x=4;
        int y=8;

        System.out.println(x+" , "+y); // 4,8 aana chiye and yehi aaya to ye sahi hai

        addition(x,y); // call by value
        System.out.println(x+" , "+y); // 14,18 aana chaiye par 4,8 hi aa raha hai wapis kyuki humlog caal by value kiye hai na ki call by refrence
    }

    static void addition(int x,int y){
        x+=10;
        y+=10;
    }
}
