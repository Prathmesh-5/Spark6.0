package ARRAY.PrintEvenAndOddIndex;

import java.util.*;

public class evenOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr={1,2,3,4,5,6,7};

        int n=arr.length;
        int i=0;
        System.out.println("odd");

        while(i<n){
            if((i&1)==1) System.out.print(arr[i]);
            i++;
        }
        i=0;
        System.out.println();
        System.out.println("even");
        while(i<n){
            if((i&1)==0) System.out.print(arr[i]);
            i++;
        }
    }
}
