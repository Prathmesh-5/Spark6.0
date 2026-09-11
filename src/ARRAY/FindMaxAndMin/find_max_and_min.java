package ARRAY.FindMaxAndMin;

import java.util.*;

public class find_max_and_min{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={5,3,7,4,9,8,1,3,5,6};
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }

        System.out.println("max value = "+maxi+", min value = "+mini);

        sc.close();

    }
}