package FUNCTION;

public class FunctionOverloading{
    // -----------------------------------------------------------------------------------------

    static int sum(int a,int b){ // no. of parameter = 2
        return a+b;
    }

    static int sum(int a,int b,int c){ // no. of parameter = 3
        return a+b;
    }

    static int sum(double a,double b){ // no. of parameter = 2 but datatype of those parameter are different
        return (int)(a+b);
    }

    /*

    static void sum(int a,int b){
        System.out.println(a+b);
        return ;
    }
     */

    //------------------------------------------------------------------------------------------

    static void greet(String name,int age){
        System.out.println("hi my name is : "+name+" and age is : "+age);
        return ;
    }

    static void greet(int age,String name){ // order of perameter change
        System.out.println("hi my name is : "+name+" and age is : "+age);
        return ;
    }

    // ----------------------------------------------------------------------------------------------
    public static void main(String[] args) {

    }
}
