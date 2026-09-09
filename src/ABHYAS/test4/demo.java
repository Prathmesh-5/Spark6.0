package ABHYAS.test4;

class Number{
    int x,y;

    Number(int x,int y){
        this.x=x;
        this.y=y;
    }
}



public class demo {
    public static void main(String[] args){
        Number n=new Number(3,6);
        Add(n);

        System.out.println(n.x);

    }
    static void Add(Number n1){
        n1.x=5;
        n1.y=4;
    }
}
