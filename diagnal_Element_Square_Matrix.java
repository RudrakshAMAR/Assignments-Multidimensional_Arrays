package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

public class diagnal_Element_Square_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print(arr[i-1][j-1]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
