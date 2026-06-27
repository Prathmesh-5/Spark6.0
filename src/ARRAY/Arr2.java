package ARRAY;

public class Arr2 {
    public static void main(String[] args) {
        int arr[][]=new int[2][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //-----------------------------------------

        int marks[][]=new int[3][];
        marks[0]=new int[3];
        marks[1]=new int[2];
        marks[2]=new int[6];

        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }

    }
}

