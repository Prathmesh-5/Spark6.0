package UserInput;
import java.util.*;

public class userInput3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] marks=new int[5];

        for(int i=0;i<marks.length;i++){
            System.out.println("Enter marks for student "+(i+1)+" = ");
            marks[i]=sc.nextInt();
        }
        for(int x:marks) System.out.print(x+" ");

sc.close();
    }
}
