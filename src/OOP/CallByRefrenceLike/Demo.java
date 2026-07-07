package OOP.CallByRefrenceLike;
class Number{
    int x;
    int y;

    Number(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class Demo {
    public static void main(String[] args) {
        Number n1=new Number(4,8);

        System.out.println(n1.x+" , "+n1.y);
        addition(n1);
        System.out.println(n1.x+" , "+n1.y);
    }

    static void addition(Number n1){
        n1.x+=10;
        n1.y+=10;
    }
}
