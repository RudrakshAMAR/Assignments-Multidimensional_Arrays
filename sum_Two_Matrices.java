package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

public class sum_Two_Matrices {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int[][] brr={{4,5,8},
                     {0,0,8},
                     {1,2,0}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
