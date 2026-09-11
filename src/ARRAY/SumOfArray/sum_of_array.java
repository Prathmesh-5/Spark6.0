package ARRAY.SumOfArray;
import java.util.*;

public class sum_of_array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("sum = "+sum);

        sc.close();
    }

}
