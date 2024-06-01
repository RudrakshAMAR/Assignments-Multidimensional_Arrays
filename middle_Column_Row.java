package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

public class middle_Column_Row {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},
                {3,4,5,6,7},
                {7,6,5,4,3},
                {8,7,6,5,4},
                {1,2,37,8,0}};
        int n=arr.length;
        int mid=(n/2+1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid || j==mid) System.out.print(arr[i-1][j-1]+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
