package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

import static array2dandarraylist2d.rotatematrix.print;

public class matrix_Waveform {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m =arr.length;
        int n=arr[0].length;
        print(arr);
        System.out.println();
        System.out.println("The waveform representation of arr[][] is : ");
        for(int i=0;i<m;i++){
            if(i%2==0) {
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.print(" ");
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.print(" ");
            }
        }
    }
}
