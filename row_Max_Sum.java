package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;
public class row_Max_Sum {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},
                {4,5,6},
                {7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        int row=0;
        int maxRowSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<m;j++){
                rowSum+=arr[i][j];
            }
            if(rowSum>maxRowSum) {
                maxRowSum=rowSum;
                row=i;
            }
        }
        System.out.println(maxRowSum+" "+row);
    }
}
