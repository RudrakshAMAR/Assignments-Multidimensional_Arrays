package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

import java.util.Scanner;

public class sum_Elements_Of_Rectangle {
    public static void main(String[] args) {
        int[][] rec={{1,2,-3,4},
                     {0,0,-4,2},
                     {1,-1,2,3},
                     {-4,-5,-7,0}};
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=rec[i][j];
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
