package ARRAY.Multiple;
import java.util.*;
public class multipleOperation {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};

        // count sum of even values and odd values
        int sumo=0,sume=0;
        for(int i=0;i<arr.length;i++){
            if((i&1)==1) sumo+=arr[i];
            else sume+=arr[i];
        }
        System.out.println("odd sum = "+sumo+", and sum of even = "+sume);

        // find index of given values

        System.out.println("Enter any element value 👇🏻");
        int elem=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elem){
                System.out.println("index = "+i);
                break;
            }
            else if(i==arr.length-1) System.out.println("in this array that elemnt is not here");
        }

        // print array in reverse order
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            swap(arr,left,right);
            left++;
            right--;
        }
        System.out.println("array in reverse order -> ");
        for(int x:arr) System.out.print(x+" ");

        sc.close();
    }
}
